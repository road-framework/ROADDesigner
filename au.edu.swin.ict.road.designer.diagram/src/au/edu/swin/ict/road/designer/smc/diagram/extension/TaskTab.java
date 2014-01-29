package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.InMsg;
import au.edu.swin.ict.road.designer.smc.MessageType;
import au.edu.swin.ict.road.designer.smc.Operation;
import au.edu.swin.ict.road.designer.smc.OutMsg;
import au.edu.swin.ict.road.designer.smc.Parameter;
import au.edu.swin.ict.road.designer.smc.ResultMsg;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SmcFactory;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.SrcMsg;
import au.edu.swin.ict.road.designer.smc.Task;
import au.edu.swin.ict.road.designer.smc.Term;

public class TaskTab extends Tab4Role {

	Table mTableWidget;
	Group mInMsgGroup, mOutMsgGroup;
	Text mNameWidget, mInOperationWidget, mOutOperationWidget;
	Combo mIsMessageDrivenWidget, mMEPWidget, mDeliveryTypeWidget, mTransformationWidget;
	List mResultWidget, mSourceWidget;
	Button mEditTaskWidget, mAddWidget, mRemoveWidget, mEditTransformationWidget;
	
	/* For creating transformation file */
	Shell mTransformationFileDialog;
	Text mTransformationFileName;
	Button mTransformationCreateButton, mTransformationCancelButton;

	/* For editing result message */
	Shell mResultMessageDialog;
	Group mResultInteractionGroup, mResultFactGroup;
	Button mResultInteractionCategoryWidget; 
	Combo mResultContractWidget, mResultTermWidget, mResultIsResponseWidget;
	Combo mResultInteractionTransformationWidget;
	Button mResultInteractionButton;
	Button mResultFactCategoryWidget;
	Combo mResultFactWidget, mResultFactTransformationWidget;
	Button mResultFactButton;
	Button mResultCreateButton, mResultDeleteButton, mResultCancelButton;

	/* For editing source message */
	Shell mSourceMessageDialog;
	Group mSourceInteractionGroup, mSourceFactGroup;
	Button mSourceInteractionCategoryWidget; 
	Combo mSourceContractWidget, mSourceTermWidget, mSourceIsResponseWidget;
	Button mSourceFactCategoryWidget;
	Combo mSourceFactWidget;
	Button mSourceCreateButton, mSourceDeleteButton, mSourceCancelButton;
	
	public static final String UNKNOWN_CONTRACT = "Unknown";
	public static final String TRANSFORMATION_FILE_EXTENSION = ".xsl";
	
	ArrayList<String> mTransformationData;
	ResultData mResultData;
	SourceData mSourceData;
	
	Operation mInOperation, mOutOperation;
	
	public static final String BUTTON_STATE_EDIT = "Edit";
	public static final String BUTTON_STATE_SAVE = "Save";
	public static final String TRANSFORMATION_BUTTON_STATE_CREATE = "Create";
	public static final String TRANSFORMATION_BUTTON_STATE_EDIT = "Edit";
	public static final String MEP_IN = "In";
	public static final String MEP_OUT = "Out";
	public static final String MEP_IN_OUT = "In_Out";
	public static final String MEP_OUT_IN = "Out_In";
	
	/* These constants are used to align all labels. Check method formatLabel() */
	public static final int LABEL_LENGTH_GENERAL = 19;
	public static final int LABEL_LENGTH_INMSG = 22;
	public static final int LABEL_LENGTH_OUTMSG = 18;
	
	/* This variable is used to specify whether a new task is being created
	 * or an existing task is being modified
	 */
	Boolean newTask = false;
	
	/* Default folder for transformation files */
	public static final String PROJECT_PATH_TRANSFORMATION = "src/main/xslt/";
	
	TaskTab(RoleEditorEditPolicy instance) {
		super(instance);
	}

	@Override
	String getTabText() {
		return "Tasks";
	}
	
	@Override
	void createItemGroup() {
		super.createItemGroup();
		itemGroup.setText("Task List");
	}
	
	@Override
	void createItemWidgets() {
		super.createItemWidgets();		
		
		// Create table with single column
		mTableWidget = new Table (itemGroup, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan = 2;
		mTableWidget.setLayoutData(data);
		mTableWidget.setLinesVisible (true);
		mTableWidget.setHeaderVisible (false);

		// Set header
		TableColumn nameColumn = new TableColumn(mTableWidget, SWT.NONE);
		nameColumn.setWidth(150);

		// Populate data
		populateTableData();
		
		// Add event listener
		mTableWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = mTableWidget.getSelectionIndex();
				if (index == -1) return;
				
				displayTask(index);
			}
		});
		
		// Create edit button
		mRemoveWidget = new Button(itemGroup, SWT.PUSH);
		mRemoveWidget.setText("Remove");
		mRemoveWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int[] indices = mTableWidget.getSelectionIndices();
				mTableWidget.remove(indices);
				removeTasks(indices);
			}
		});
		
		mAddWidget = new Button(itemGroup, SWT.PUSH);
		mAddWidget.setText("Add");
		mAddWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				initializeContentWidget();
			}
		});
	}
	
	@Override
	void createContentWidgets() {
		super.createContentWidgets();
		
		/* Name */
		Label label = new Label(contentGroup, SWT.WRAP);
		label.setText(formatLabel("Name", LABEL_LENGTH_GENERAL));
		
		mNameWidget = new Text(contentGroup, SWT.SINGLE | SWT.BORDER);
		GridData nameData = new GridData(200,20);
		mNameWidget.setLayoutData(nameData);
		
		/* isMessageDriven */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText(formatLabel("isMessageDriven", LABEL_LENGTH_GENERAL));
		label.setToolTipText("Specify message driven nature");

		mIsMessageDrivenWidget = new Combo(contentGroup, SWT.READ_ONLY);
		mIsMessageDrivenWidget.setItems(new String[] {Boolean.TRUE.toString(), Boolean.FALSE.toString()});

		/* MEP */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText(formatLabel("MEP", LABEL_LENGTH_GENERAL));

		mMEPWidget = new Combo(contentGroup, SWT.READ_ONLY);
		mMEPWidget.setItems(new String[] {MEP_IN, MEP_OUT, MEP_IN_OUT, MEP_OUT_IN});
		mMEPWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				renderMEP();
			}
		});
		
		/* InMsg */
		mInMsgGroup = new Group (contentGroup, SWT.NONE);
		GridData inMsgData = new GridData(SWT.FILL, SWT.FILL, false, false);
		inMsgData.horizontalSpan=2;
		mInMsgGroup.setLayoutData (inMsgData);
		mInMsgGroup.setLayout (new GridLayout (2, false));
		mInMsgGroup.setText ("InMsg");

		/* InOperation */
		label = new Label(mInMsgGroup, SWT.WRAP);
		label.setText(formatLabel("Operation", LABEL_LENGTH_INMSG));

		mInOperationWidget = new Text(mInMsgGroup, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData inOperationData = new GridData(200, 80);
		mInOperationWidget.setLayoutData(inOperationData);
		
		/* Result */
		label = new Label(mInMsgGroup, SWT.WRAP);
		label.setText(formatLabel("Result", LABEL_LENGTH_INMSG));
			
		mResultWidget = new List(mInMsgGroup, SWT.BORDER | SWT.V_SCROLL);
		GridData resultData = new GridData(200, 80);
		mResultWidget.setLayoutData(resultData);
		
		mResultWidget.addListener(SWT.MouseDoubleClick, new Listener() {
			@Override
			public void handleEvent(Event event) {
				displayResultMessage(mResultWidget.getFocusIndex()-1);
			}			
		});
		
		/* OutMsg */
		mOutMsgGroup = new Group (contentGroup, SWT.NONE);
		GridData outMsgData = new GridData(SWT.FILL, SWT.FILL, false, false);
		outMsgData.horizontalSpan=2;
		mOutMsgGroup.setLayoutData (outMsgData);
		mOutMsgGroup.setLayout (new GridLayout (3, false));
		mOutMsgGroup.setText ("OutMsg");

		/* deliveryType */
		label = new Label(mOutMsgGroup, SWT.WRAP);
		label.setText(formatLabel("deliveryType", LABEL_LENGTH_OUTMSG));
			
		mDeliveryTypeWidget = new Combo(mOutMsgGroup, SWT.READ_ONLY);
		mDeliveryTypeWidget.setItems(new String[] {MessageType.PUSH.toString(), MessageType.PULL.toString()});
		GridData deliveryTypeData = new GridData();
		deliveryTypeData.horizontalSpan = 2;
		mDeliveryTypeWidget.setLayoutData(deliveryTypeData);
		
		/* OutOperation */
		label = new Label(mOutMsgGroup, SWT.WRAP);
		label.setText(formatLabel("Operation", LABEL_LENGTH_OUTMSG));
			
		mOutOperationWidget = new Text(mOutMsgGroup, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData outOperationData = new GridData(200, 80);
		outOperationData.horizontalSpan = 2;
		mOutOperationWidget.setLayoutData(outOperationData);
		
		/* transformation */
		label = new Label(mOutMsgGroup, SWT.WRAP);
		label.setText(formatLabel("transformation", LABEL_LENGTH_OUTMSG));
			
		mTransformationWidget = new Combo(mOutMsgGroup, SWT.READ_ONLY);
		populateTransformationData();
		mTransformationWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateTransformationWidget(mTransformationWidget, mEditTransformationWidget);
			}
		});
		
		mEditTransformationWidget = new Button(mOutMsgGroup, SWT.PUSH);
		GridData editTransformationData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
		mEditTransformationWidget.setLayoutData(editTransformationData);
		mEditTransformationWidget.setText(TRANSFORMATION_BUTTON_STATE_CREATE);
		
		/* Event Listener */
		mEditTransformationWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Open existing file
				if (mEditTransformationWidget.getText().equalsIgnoreCase(TRANSFORMATION_BUTTON_STATE_EDIT)) {
					// Ask users to save the task before proceeding further
					if (!MessageDialog.openConfirm(shell, "Save the task", 
							"Do you want to save the task before proceeding further?")) return;
					
//					if (successfullySaved())
					if (taskSaved())
						openTransformationFile(mTransformationWidget.getText());
				}
				// Create new file
				else {
					Point pt = mTableWidget.getLocation();
					pt = e.display.map(mTableWidget, null, pt);
					createSetGetDialog(mTransformationWidget, mEditTransformationWidget,
									   pt.x, pt.y);						
				}				
			}
		});
		
		/* Source */
		label = new Label(mOutMsgGroup, SWT.WRAP);
		label.setText(formatLabel("Source", LABEL_LENGTH_OUTMSG));
			
		mSourceWidget = new List(mOutMsgGroup, SWT.BORDER | SWT.V_SCROLL);
		GridData sourceData = new GridData(200, 80);
		sourceData.horizontalSpan = 2;
		mSourceWidget.setLayoutData(sourceData);
		
		
		mSourceWidget.addListener(SWT.MouseDoubleClick, new Listener() {
			@Override
			public void handleEvent(Event event) {
				displaySourceMessage(mSourceWidget.getFocusIndex()-1);
			}			
		});
		
		/* Edit Buttons */
		mEditTaskWidget = new Button(contentGroup, SWT.PUSH);
		GridData editButtonData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		editButtonData.horizontalSpan=2;
		mEditTaskWidget.setLayoutData(editButtonData);
		mEditTaskWidget.setVisible(false);
		
		/* Event Listener */
		mEditTaskWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (mEditTaskWidget.getText().equalsIgnoreCase(BUTTON_STATE_EDIT)) {
					mEditTaskWidget.setText(BUTTON_STATE_SAVE);
					setEnableContentWidget(true);
					renderMEP();
				}
				else if (mEditTaskWidget.getText().equalsIgnoreCase(BUTTON_STATE_SAVE)) {
					if (!taskSaved()) return;
					
					rePopulateTableData();
					
					mEditTaskWidget.setText(BUTTON_STATE_EDIT);
					setEnableContentWidget(false);
					
					/* Finish editing a new task */
					newTask = false;
				}
			}
		});
		
		setEnableContentWidget(false);

	}

	protected void displaySourceMessage(int i) {
		createSourceMessageDialog(i);
		populateSourceMessageDialog(i);
	}

	private void createSourceMessageDialog(int index) {
		
		/* Create new shell */
		mSourceMessageDialog = new Shell(shell, SWT.DIALOG_TRIM | SWT.MODELESS);
		mSourceMessageDialog.setLayout(new GridLayout(3, true));
		mSourceMessageDialog.setSize(450, 250);
		
		/* Set title of the new shell */
		if (index == -1)
			mSourceMessageDialog.setText("New Source Message");
		else
			mSourceMessageDialog.setText("Edit Source Message");

		/* Interaction group */
		mSourceInteractionGroup = new Group(mSourceMessageDialog, SWT.SINGLE | SWT.BORDER);
		GridData sourceInteractionGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		sourceInteractionGroupData.horizontalSpan = 3;
		mSourceInteractionGroup.setLayoutData(sourceInteractionGroupData);
		mSourceInteractionGroup.setLayout(new GridLayout(3, false));
		
		/* Interaction radio button */
		mSourceInteractionCategoryWidget = new Button(mSourceInteractionGroup, SWT.RADIO);
		mSourceInteractionCategoryWidget.setText(formatLabel("Interaction", LABEL_LENGTH_GENERAL));
		GridData sourceInteractionCategoryWidgetData = new GridData(150, SWT.DEFAULT);
		sourceInteractionCategoryWidgetData.verticalSpan = 3;
		mSourceInteractionCategoryWidget.setLayoutData(sourceInteractionCategoryWidgetData);
		
		/* Event listener */
		mSourceInteractionCategoryWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEditSourceMessageMode(true);
			}
		});
		
		/* Contract */
		Label label = new Label(mSourceInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("contract", LABEL_LENGTH_GENERAL));		
		mSourceContractWidget = new Combo(mSourceInteractionGroup, SWT.READ_ONLY);
		GridData sourceContractWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mSourceContractWidget.setLayoutData(sourceContractWidgetData);
		
		/* Event listener */
		mSourceContractWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				populateSourceTerm();
			}
		});
		
		/* Term */
		label = new Label(mSourceInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("term", LABEL_LENGTH_GENERAL));		
		mSourceTermWidget = new Combo(mSourceInteractionGroup, SWT.READ_ONLY);
		GridData sourceTermWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mSourceTermWidget.setLayoutData(sourceTermWidgetData);
		
		/* isResponse */
		label = new Label(mSourceInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("isResponse", LABEL_LENGTH_GENERAL));		
		mSourceIsResponseWidget = new Combo(mSourceInteractionGroup, SWT.READ_ONLY);
		GridData sourceIsResponseWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mSourceIsResponseWidget.setLayoutData(sourceIsResponseWidgetData);
		
		/* Fact group */
		mSourceFactGroup = new Group(mSourceMessageDialog, SWT.SINGLE | SWT.BORDER);
		GridData sourceFactGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		sourceFactGroupData.horizontalSpan = 3;
		mSourceFactGroup.setLayoutData(sourceFactGroupData);
		mSourceFactGroup.setLayout(new GridLayout(3, false));
		
		/* Fact radio button */
		mSourceFactCategoryWidget = new Button(mSourceFactGroup, SWT.RADIO);
		mSourceFactCategoryWidget.setText(formatLabel("Fact", LABEL_LENGTH_GENERAL));
		GridData sourceFactCategoryWidgetData = new GridData(150, SWT.DEFAULT);
		mSourceFactCategoryWidget.setLayoutData(sourceFactCategoryWidgetData);
		
		/* Event listener */
		mSourceFactCategoryWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEditSourceMessageMode(false);
			}
		});
		
		/* Fact */
		label = new Label(mSourceFactGroup, SWT.WRAP);
		label.setText(formatLabel("fact", LABEL_LENGTH_GENERAL));		
		mSourceFactWidget = new Combo(mSourceFactGroup, SWT.READ_ONLY);
		GridData sourceFactWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mSourceFactWidget.setLayoutData(sourceFactWidgetData);
		
		/* "Save" button */
		mSourceCreateButton = new Button(mSourceMessageDialog, SWT.PUSH);
		GridData sourceCreateButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		if (index == -1) sourceCreateButtonData.horizontalSpan = 2;
		mSourceCreateButton.setLayoutData(sourceCreateButtonData);
		mSourceCreateButton.setText("Save");
		mSourceCreateButton.addSelectionListener(new MySelectionAdapter(index) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (sourceMessageSaved(getIndex())) {
					mSourceMessageDialog.close();
					rePopulateSourceData();
				}
			}
		});
		
		/* "Delete" button */
		if (index != -1) {
			mSourceDeleteButton = new Button(mSourceMessageDialog, SWT.PUSH);
			GridData sourceDeleteButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
			mSourceDeleteButton.setLayoutData(sourceDeleteButtonData);
			mSourceDeleteButton.setText("Delete");
			mSourceDeleteButton.addSelectionListener(new MySelectionAdapter(index) {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (MessageDialog.openConfirm(mSourceMessageDialog, "Warning", 
							"Do you really want to delete this Source Message?")) {
						mSourceData.remove(getIndex());
						mSourceMessageDialog.close();
						rePopulateSourceData();
					}
				}
			});			
		}
		
		/* "Cancel" button */
		mSourceCancelButton = new Button(mSourceMessageDialog, SWT.PUSH);
		GridData sourceCancelButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		mSourceCancelButton.setLayoutData(sourceCancelButtonData);
		mSourceCancelButton.setText("Cancel");
		mSourceCancelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mSourceMessageDialog.close();
			}
		});

		mSourceMessageDialog.open();
	}

	private void populateSourceMessageDialog(int index) {
		
		/* List of associated contracts */
		ArrayList<Contract> contracts = this.instance.getContracts();
		ArrayList<String> contractNames = new ArrayList<String>();
		for (Contract contract: contracts) 
			contractNames.add(contract.getName());
		
		// Add "Unknown" item to enable the selection of any existing terms
		contractNames.add(UNKNOWN_CONTRACT);
		
		mSourceContractWidget.setItems(contractNames.toArray(new String[0]));
		mSourceContractWidget.select(0);
		
		/* List of terms */
		populateSourceTerm();
		
		/* IsResponse */
		ArrayList<String> isResponseNames = new ArrayList<String>();
		isResponseNames.add(Boolean.TRUE.toString());
		isResponseNames.add(Boolean.FALSE.toString());
		mSourceIsResponseWidget.setItems(isResponseNames.toArray(new String[0]));
		mSourceIsResponseWidget.select(0);
		
		/* Fact */
		ArrayList<ExternalFactLink> monitorFactLinks = this.instance.getMonitorFactLink();
		ArrayList<String> monitorFactLinkNames = new ArrayList<String>();
		
		for (ExternalFactLink factLink: monitorFactLinks) {
			monitorFactLinkNames.add(factLink.getFact().getName());
		}
		
		mSourceFactWidget.setItems(monitorFactLinkNames.toArray(new String[0]));
		if (monitorFactLinkNames.size() > 0) mSourceFactWidget.select(0);
		
		/* process parameter */
		SrcMsg sourceMsg = mSourceData.getSourceMsg(index);
		if (sourceMsg != null) {
			if (sourceMsg.getFactId() != null && sourceMsg.getFactId().length() > 0) {
				mSourceFactWidget.setText(sourceMsg.getFactId());
			}
			else {
				mSourceContractWidget.setText(sourceMsg.getContractId());
				populateSourceTerm();
				mSourceTermWidget.setText(sourceMsg.getTermId());
				mSourceIsResponseWidget.setText(Boolean.toString(sourceMsg.isIsResponse()));
			}
		}
	}

	protected void displayResultMessage(int index) {
		createResultMessageDialog(index);
		populateResultMessageDialog(index);
	}

	private void populateResultMessageDialog(int index) {
		
		/* List of associated contracts */
		ArrayList<Contract> contracts = this.instance.getContracts();
		ArrayList<String> contractNames = new ArrayList<String>();
		for (Contract contract: contracts) 
			contractNames.add(contract.getName());
		
		// Add "Unknown" item to enable the selection of any existing terms
		contractNames.add(UNKNOWN_CONTRACT);
		
		mResultContractWidget.setItems(contractNames.toArray(new String[0]));
		mResultContractWidget.deselectAll();
//		mResultContractWidget.select(0);
		
		/* List of terms */
//		populateResultTerm();
		
		/* IsResponse */
		ArrayList<String> isResponseNames = new ArrayList<String>();
		isResponseNames.add(Boolean.TRUE.toString());
		isResponseNames.add(Boolean.FALSE.toString());
		mResultIsResponseWidget.setItems(isResponseNames.toArray(new String[0]));
		mResultIsResponseWidget.deselectAll();
//		mResultIsResponseWidget.select(0);
		
		/* Transformation for Interaction */
		mResultInteractionTransformationWidget.setItems(mTransformationData.toArray(new String[0]));
		mResultInteractionTransformationWidget.select(0);
//		mResultInteractionTransformationWidget.select(mTransformationData.size() - 1);
		
		/* Fact */
		ArrayList<ExternalFactLink> provideFactLinks = this.instance.getProvideFactLink();
		ArrayList<String> provideFactLinkNames = new ArrayList<String>();
		
		for (ExternalFactLink factLink: provideFactLinks) {
			provideFactLinkNames.add(factLink.getFact().getName());
		}
		
		mResultFactWidget.setItems(provideFactLinkNames.toArray(new String[0]));
		mResultFactWidget.deselectAll();
//		if (provideFactLinkNames.size() > 0) mResultFactWidget.select(0);
		
		/* Transformation for Fact */
		mResultFactTransformationWidget.setItems(mTransformationData.toArray(new String[0]));
		mResultFactTransformationWidget.select(0);
//		mResultFactTransformationWidget.select(mTransformationData.size() - 1);

		/* process parameter */
		ResultMsg resultMsg = mResultData.getResultMsg(index);
		if (resultMsg != null) {
			if (resultMsg.getFactId() != null && resultMsg.getFactId().length() > 0) {
				mResultFactWidget.setText(resultMsg.getFactId());
				mResultFactTransformationWidget.setText(resultMsg.getTransformation());
			}
			else {
				mResultContractWidget.setText(resultMsg.getContractId());
				populateResultTerm();
				mResultTermWidget.setText(resultMsg.getTermId());
				mResultIsResponseWidget.setText(Boolean.toString(resultMsg.isIsResponse()));
				mResultInteractionTransformationWidget.setText(resultMsg.getTransformation());
			}
		}

		/* Update button label */
		updateTransformationWidget(mResultInteractionTransformationWidget,
				   					   mResultInteractionButton);

	}

	private void createResultMessageDialog(int index) {
		
		/* Create new shell */
		mResultMessageDialog = new Shell(shell, SWT.DIALOG_TRIM | SWT.MODELESS);
		mResultMessageDialog.setLayout(new GridLayout(3, true));
		mResultMessageDialog.setSize(450, 300);
		
		/* Set title of the new shell */
		if (index == -1)
			mResultMessageDialog.setText("New Result Message");
		else
			mResultMessageDialog.setText("Edit Result Message");

		/* Interaction group */
		mResultInteractionGroup = new Group(mResultMessageDialog, SWT.SINGLE | SWT.BORDER);
		GridData resultInteractionGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		resultInteractionGroupData.horizontalSpan = 3;
		mResultInteractionGroup.setLayoutData(resultInteractionGroupData);
		mResultInteractionGroup.setLayout(new GridLayout(4, false));
		
		/* Interaction radio button */
		mResultInteractionCategoryWidget = new Button(mResultInteractionGroup, SWT.RADIO);
		mResultInteractionCategoryWidget.setText(formatLabel("Interaction", LABEL_LENGTH_GENERAL));
		GridData resultInteractionCategoryWidgetData = new GridData(150, SWT.DEFAULT);
		resultInteractionCategoryWidgetData.verticalSpan = 4;
		mResultInteractionCategoryWidget.setLayoutData(resultInteractionCategoryWidgetData);
		
		/* Event listener */
		mResultInteractionCategoryWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEditResultMessageMode(true);
			}
		});
		
		/* Contract */
		Label label = new Label(mResultInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("contract", LABEL_LENGTH_GENERAL));		
		mResultContractWidget = new Combo(mResultInteractionGroup, SWT.READ_ONLY);
		GridData resultContractWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		resultContractWidgetData.horizontalSpan = 2;
		mResultContractWidget.setLayoutData(resultContractWidgetData);
		
		/* Event listener */
		mResultContractWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				populateResultTerm();
			}
		});
		
		/* Term */
		label = new Label(mResultInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("term", LABEL_LENGTH_GENERAL));		
		mResultTermWidget = new Combo(mResultInteractionGroup, SWT.READ_ONLY);
		GridData resultTermWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		resultTermWidgetData.horizontalSpan = 2;
		mResultTermWidget.setLayoutData(resultTermWidgetData);
		
		/* isResponse */
		label = new Label(mResultInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("isResponse", LABEL_LENGTH_GENERAL));		
		mResultIsResponseWidget = new Combo(mResultInteractionGroup, SWT.READ_ONLY);
		GridData resultIsResponseWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		resultIsResponseWidgetData.horizontalSpan = 2;
		mResultIsResponseWidget.setLayoutData(resultIsResponseWidgetData);
		
		/* Transformation */
		label = new Label(mResultInteractionGroup, SWT.WRAP);
		label.setText(formatLabel("transformation", LABEL_LENGTH_GENERAL));		
		mResultInteractionTransformationWidget = new Combo(mResultInteractionGroup, SWT.READ_ONLY);
		GridData resultInteractionTransformationWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mResultInteractionTransformationWidget.setLayoutData(resultInteractionTransformationWidgetData);
		
		/* Transformation event listener */
		mResultInteractionTransformationWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateTransformationWidget(mResultInteractionTransformationWidget,
										   mResultInteractionButton);
			}
		});
		
		/* Transformation button */
		mResultInteractionButton = new Button(mResultInteractionGroup, SWT.PUSH);
		GridData resultInteractionButtonData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
		mResultInteractionButton.setLayoutData(resultInteractionButtonData);
		mResultInteractionButton.setText(TRANSFORMATION_BUTTON_STATE_CREATE);
		
		/* Event Listener */
		mResultInteractionButton.addSelectionListener(new MySelectionAdapter(index) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String fileName = mResultInteractionTransformationWidget.getText();
				// Open existing file
				if (mResultInteractionButton.getText().equalsIgnoreCase(TRANSFORMATION_BUTTON_STATE_EDIT)) {
					// Ask users to save the task before proceeding further
					if (!MessageDialog.openConfirm(mResultMessageDialog, "Save the message & task", 
						"Do you want to save the message and task before proceeding further?")) 
						return;
					if (resultMessageSaved(getIndex()) && taskSaved()) {
						mResultMessageDialog.close();
						openTransformationFile(fileName);
					}
				}
				// Create new file
				else {
					Point pt = mTableWidget.getLocation();
					pt = e.display.map(mTableWidget, null, pt);
					createSetGetDialog(mResultInteractionTransformationWidget,
									   mResultInteractionButton, pt.x, pt.y);						
				}				
			}
		});
		
		/* Fact group */
		mResultFactGroup = new Group(mResultMessageDialog, SWT.SINGLE | SWT.BORDER);
		GridData resultFactGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		resultFactGroupData.horizontalSpan = 3;
		mResultFactGroup.setLayoutData(resultFactGroupData);
		mResultFactGroup.setLayout(new GridLayout(4, false));
		
		/* Fact radio button */
		mResultFactCategoryWidget = new Button(mResultFactGroup, SWT.RADIO);
		mResultFactCategoryWidget.setText(formatLabel("Fact", LABEL_LENGTH_GENERAL));
		GridData resultFactCategoryWidgetData = new GridData(150, SWT.DEFAULT);
		resultFactCategoryWidgetData.verticalSpan = 2;
		mResultFactCategoryWidget.setLayoutData(resultFactCategoryWidgetData);
		
		/* Event listener */
		mResultFactCategoryWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEditResultMessageMode(false);
			}
		});
		
		/* Fact */
		label = new Label(mResultFactGroup, SWT.WRAP);
		label.setText(formatLabel("fact", LABEL_LENGTH_GENERAL));		
		mResultFactWidget = new Combo(mResultFactGroup, SWT.READ_ONLY);
		GridData resultFactWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		resultFactWidgetData.horizontalSpan = 2;
		mResultFactWidget.setLayoutData(resultFactWidgetData);
		
		/* Transformation */
		label = new Label(mResultFactGroup, SWT.WRAP);
		label.setText(formatLabel("transformation", LABEL_LENGTH_GENERAL));		
		mResultFactTransformationWidget = new Combo(mResultFactGroup, SWT.READ_ONLY);
		GridData resultFactTransformationWidgetData = new GridData(SWT.FILL, SWT.TOP, true, false);
		mResultFactTransformationWidget.setLayoutData(resultFactTransformationWidgetData);
		
		/* Transformation button */
		mResultFactButton = new Button(mResultFactGroup, SWT.PUSH);
		GridData resultFactButtonData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
		mResultFactButton.setLayoutData(resultFactButtonData);
		mResultFactButton.setText(TRANSFORMATION_BUTTON_STATE_CREATE);
		
		/* "Save" button */
		mResultCreateButton = new Button(mResultMessageDialog, SWT.PUSH);
		GridData resultCreateButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		if (index == -1) resultCreateButtonData.horizontalSpan = 2;
		mResultCreateButton.setLayoutData(resultCreateButtonData);
		mResultCreateButton.setText("Save");
		mResultCreateButton.addSelectionListener(new MySelectionAdapter(index) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultMessageSaved(getIndex())) {
					mResultMessageDialog.close();
					rePopulateResultData();
				}
			}
		});
		
		/* "Delete" button */
		if (index != -1) {
			mResultDeleteButton = new Button(mResultMessageDialog, SWT.PUSH);
			GridData resultDeleteButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
			mResultDeleteButton.setLayoutData(resultDeleteButtonData);
			mResultDeleteButton.setText("Delete");
			mResultDeleteButton.addSelectionListener(new MySelectionAdapter(index) {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (MessageDialog.openConfirm(mResultMessageDialog, "Warning", 
							"Do you really want to delete this Result Message?")) {
						mResultData.remove(getIndex());
						mResultMessageDialog.close();
						rePopulateResultData();
					}
				}
			});			
		}
		
		/* "Cancel" button */
		mResultCancelButton = new Button(mResultMessageDialog, SWT.PUSH);
		GridData resultCancelButtonData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		mResultCancelButton.setLayoutData(resultCancelButtonData);
		mResultCancelButton.setText("Cancel");
		mResultCancelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mResultMessageDialog.close();
			}
		});

		mResultMessageDialog.open();
	}

	protected boolean resultMessageSaved(int index) {
		ResultMsg resultMsg;
		
		if (mResultInteractionCategoryWidget.getSelection()) {
			if (mResultContractWidget.getText() == null || 
				mResultContractWidget.getText().length() == 0 ||
				mResultTermWidget.getText() == null ||
				mResultTermWidget.getText().length() == 0) {
				MessageDialog.openError(mResultMessageDialog, "Error",
										"Either contract or term is empty!");
				return false;
			}
			
			resultMsg = SmcFactory.eINSTANCE.createResultMsg();
			resultMsg.setContractId(mResultContractWidget.getText());
			resultMsg.setTermId(mResultTermWidget.getText());
			resultMsg.setIsResponse(Boolean.valueOf(mResultIsResponseWidget.getText()));
			if (mResultInteractionTransformationWidget.getSelectionIndex() > 0)
				resultMsg.setTransformation(mResultInteractionTransformationWidget.getText());
			
			mResultData.update(index, resultMsg);
			return true;
		}
		
		if (mResultFactWidget.getText() == null ||
			mResultFactWidget.getText().length() == 0) {
			MessageDialog.openError(mResultMessageDialog, "Error",
									"fact is empty!");
			return false;			
		}
		
		resultMsg = SmcFactory.eINSTANCE.createResultMsg();
		resultMsg.setFactId(mResultFactWidget.getText());
		if (mResultFactTransformationWidget.getSelectionIndex() > 0)
			resultMsg.setTransformation(mResultFactTransformationWidget.getText());
		
		mResultData.update(index, resultMsg);
		return true;
	}

	protected boolean sourceMessageSaved(int index) {
		SrcMsg sourceMsg;
		
		if (mSourceInteractionCategoryWidget.getSelection()) {
			if (mSourceContractWidget.getText() == null || 
				mSourceContractWidget.getText().length() == 0 ||
				mSourceTermWidget.getText() == null ||
				mSourceTermWidget.getText().length() == 0) {
				MessageDialog.openError(mSourceMessageDialog, "Error",
										"Either contract or term is empty!");
				return false;
			}
			
			sourceMsg = SmcFactory.eINSTANCE.createSrcMsg();
			sourceMsg.setContractId(mSourceContractWidget.getText());
			sourceMsg.setTermId(mSourceTermWidget.getText());
			sourceMsg.setIsResponse(Boolean.valueOf(mSourceIsResponseWidget.getText()));
			
			mSourceData.update(index, sourceMsg);
			return true;
		}
		
		if (mSourceFactWidget.getText() == null ||
			mSourceFactWidget.getText().length() == 0) {
			MessageDialog.openError(mSourceMessageDialog, "Error",
									"fact is empty!");
			return false;			
		}
		
		sourceMsg = SmcFactory.eINSTANCE.createSrcMsg();
		sourceMsg.setFactId(mSourceFactWidget.getText());
		
		mSourceData.update(index, sourceMsg);
		return true;
	}

	protected void populateResultTerm() {
		ArrayList<Contract> contracts = this.instance.getContracts();
		ArrayList<String> termNames = new ArrayList<String>();
		
		if (contracts.size() > 0) {
			int index = mResultContractWidget.getSelectionIndex();
			// If "UNKNOWN" is selected
			if (index == contracts.size()) {
				for (Contract contract: contracts) {
					java.util.List<Term> terms = contract.getTerm();
					for (Term term: terms) termNames.add(term.getName());
				}
			} else {
				java.util.List<Term> terms = contracts.get(index).getTerm();
				for (Term term: terms) termNames.add(term.getName());				
			}
		}
		
		mResultTermWidget.setItems(termNames.toArray(new String[0]));
		if (termNames.size() > 0) mResultTermWidget.select(0);
	}

	protected void populateSourceTerm() {
		ArrayList<Contract> contracts = this.instance.getContracts();
		ArrayList<String> termNames = new ArrayList<String>();
		
		if (contracts.size() > 0) {
			int index = mSourceContractWidget.getSelectionIndex();
			// If "UNKNOWN" is selected
			if (index == contracts.size()) {
				for (Contract contract: contracts) {
					java.util.List<Term> terms = contract.getTerm();
					for (Term term: terms) termNames.add(term.getName());
				}
			} else {
				java.util.List<Term> terms = contracts.get(index).getTerm();
				for (Term term: terms) termNames.add(term.getName());				
			}
		}
		
		mSourceTermWidget.setItems(termNames.toArray(new String[0]));
		if (termNames.size() > 0) mSourceTermWidget.select(0);
	}

	/**
	 * Switching between two widget groups: Interaction & Fact
	 * This is meant to implement two separate radio buttons as a group of alternative
	 * radio buttons
	 * @param interaction is true for Interaction widget group
	 */
	protected void setEditResultMessageMode(boolean interaction) {
		if (interaction) {
			mResultFactCategoryWidget.setSelection(false);
			setEnableResultInteractionGroup(true);
			setEnableResultFactGroup(false);
		}
		else {
			mResultInteractionCategoryWidget.setSelection(false);
			setEnableResultInteractionGroup(false);
			setEnableResultFactGroup(true);			
		}
	}

	/**
	 * Switching between two widget groups: Interaction & Fact
	 * This is meant to implement two separate radio buttons as a group of alternative
	 * radio buttons
	 * @param interaction is true for Interaction widget group
	 */
	protected void setEditSourceMessageMode(boolean interaction) {
		if (interaction) {
			mSourceFactCategoryWidget.setSelection(false);
			setEnableSourceInteractionGroup(true);
			setEnableSourceFactGroup(false);
		}
		else {
			mSourceInteractionCategoryWidget.setSelection(false);
			setEnableSourceInteractionGroup(false);
			setEnableSourceFactGroup(true);			
		}
	}

	private void setEnableResultInteractionGroup(boolean enabled) {
		mResultContractWidget.setEnabled(enabled);
		mResultTermWidget.setEnabled(enabled);
		mResultIsResponseWidget.setEnabled(enabled);
		mResultInteractionTransformationWidget.setEnabled(enabled);
		mResultInteractionButton.setEnabled(enabled);
	}

	private void setEnableResultFactGroup(boolean enabled) {
		mResultFactWidget.setEnabled(enabled);
		mResultFactTransformationWidget.setEnabled(enabled);
		mResultFactButton.setEnabled(enabled);
	}

	private void setEnableSourceInteractionGroup(boolean enabled) {
		mSourceContractWidget.setEnabled(enabled);
		mSourceTermWidget.setEnabled(enabled);
		mSourceIsResponseWidget.setEnabled(enabled);
	}

	private void setEnableSourceFactGroup(boolean enabled) {
		mSourceFactWidget.setEnabled(enabled);
	}

	private String formatLabel(String inString, int max) {
		StringBuffer buf = new StringBuffer();
		if (inString.length() > max) {
			buf.append(inString.substring(0, max));
		}
		else {
			buf.append(inString);
			for (int i=inString.length(); i<max; i++) {
				buf.append(' ');
			}
		}
		
		return buf.toString();
	}
	
	private void populateTableData() {
		Role role = this.instance.getRole();
		java.util.List<Task> tasks = role.getTask();
		
		for (int i=0; i<tasks.size(); i++) {
			Task task = tasks.get(i);
			TableItem item = new TableItem(mTableWidget, SWT.NONE);
			item.setText(0, task.getId());
		}
	}

	private void displayTask(int index) {
		Role role = this.instance.getRole();
		java.util.List<Task> tasks = role.getTask();
		Task task = tasks.get(index);
		
		/* Name */
		mNameWidget.setText(task.getId());
		
		/* isMessageDriven */
		mIsMessageDrivenWidget.setText(Boolean.toString(task.isIsMsgDriven()));
		
		/* MEP */
		if (task.getIn() == null && task.getResultMsg() == null &&
			task.getOut() == null && task.getSrcMsg() == null)
			mMEPWidget.deselectAll();
		else if (task.getIn() == null && task.getResultMsg() == null)
			mMEPWidget.setText(MEP_OUT);
		else if (task.getOut() == null && task.getSrcMsg() == null)
			mMEPWidget.setText(MEP_IN);
		else if (task.getIn() != null && task.getIn().isIsResponse()) mMEPWidget.setText(MEP_OUT_IN);
		else mMEPWidget.setText(MEP_IN_OUT);
		
		/* InMsg */
		if (task.getIn() != null && task.getIn().getOperation() != null)
			mInOperationWidget.setText(Utils.convertOperation(task.getIn().getOperation()));
		else 
			mInOperationWidget.setText("");
		
		/* ResultMsg */
		populateResultData(task);
		
		/* OutMsg */
		if (task.getOut() != null) {
			OutMsg outMsg = task.getOut();
			
			/* DeliveryType */
			if (outMsg.getDeliveryType() != null)
				mDeliveryTypeWidget.setText(outMsg.getDeliveryType().getLiteral());
			else
				mDeliveryTypeWidget.deselectAll();
			
			/* Operation */
			if (outMsg.getOperation() != null) 
				mOutOperationWidget.setText(Utils.convertOperation(outMsg.getOperation()));
			else
				mOutOperationWidget.setText("");
			
			/* Transformation */
			mTransformationWidget.select(0);
			if (task.getOut() != null && task.getOut().getTransformation() != null) {
				for (int i=0; i < mTransformationData.size(); i++) {
					if (mTransformationData.get(i).equalsIgnoreCase(task.getOut().getTransformation())) {
						mTransformationWidget.select(i);
						break;
					}
				}
			}
						
			/* Transformation edit button */
			updateTransformationWidget(mTransformationWidget, mEditTransformationWidget);
		}
		else {
			mDeliveryTypeWidget.deselectAll();
			mOutOperationWidget.setText("");
			mTransformationWidget.select(0);
		}
		
		/* SrcMsg */
		populateSourceData(task);

		// Make all fields read-only
		mEditTaskWidget.setText(BUTTON_STATE_EDIT);
		mEditTaskWidget.setVisible(true);
		setEnableContentWidget(false);
	}

	private void removeTasks(int[] indices) {		
		Role role = this.instance.getRole();
		java.util.List<Task> tasks = role.getTask();
		java.util.List<Task> newTaskList = new ArrayList<Task>();
		java.util.List<Task> removeTasks = new ArrayList<Task>();

		// Create a copy of term list
		for (int i=0; i<tasks.size(); i++) {
			newTaskList.add(tasks.get(i));
		}
		
		// Create a list of terms to be removed
		for (int i=0; i<indices.length; i++)
			removeTasks.add(tasks.get(indices[i]));
		
		// Remove terms
		newTaskList.removeAll(removeTasks);

		// Update model
		EReference feature = SmcPackage.eINSTANCE.getRole_Task();
		Command cmd = SetCommand.create(instance.getEditingDomain(), role, feature, newTaskList);
		instance.getEditingDomain().getCommandStack().execute(cmd);
	}

	/**
	 * Enable the initial values for a new task
	 */
	private void initializeContentWidget() {
		setEnableContentWidget(true);
		
		/* Start editing a new task */
		newTask = true;
		
		/* Clear all controls */
		mNameWidget.setText("");
//		mIsMessageDrivenWidget.setText(Boolean.FALSE.toString());
		mIsMessageDrivenWidget.deselectAll();
		mMEPWidget.deselectAll();
		mInOperationWidget.setText("");
		mDeliveryTypeWidget.deselectAll();
		mOutOperationWidget.setText("");
		
		// Result messages
		populateResultData(null);
		
		// Transformation file list
		mTransformationWidget.select(0);
		mEditTransformationWidget.setText(TRANSFORMATION_BUTTON_STATE_CREATE);
		
		// Source messages
		populateSourceData(null);
		
		// Render InMsgGroup & OutMsgGroup properly based on MEP value
		renderMEP();
		
		// Enable task edit button
		mEditTaskWidget.setText(BUTTON_STATE_SAVE);
		mEditTaskWidget.setVisible(true);
	}
	
	/**
	 * Enable or disable content widgets
	 * @param enabled
	 */
	private void setEnableContentWidget(Boolean enabled) {
		// General properties
		mNameWidget.setEnabled(enabled);
		mIsMessageDrivenWidget.setEnabled(enabled);
		mMEPWidget.setEnabled(enabled);
		
		// InMsg properties
		setEnableInMsgGroup(enabled);
		
		// OutMsg properties
		setEnableOutMsgGroup(enabled);
	}
	
	/**
	 * Enable or disable InMsg group
	 * @param enabled
	 */
	private void setEnableInMsgGroup(Boolean enabled) {
		mInMsgGroup.setEnabled(enabled);
		mInOperationWidget.setEnabled(enabled);
		mResultWidget.setEnabled(enabled);		
	}
	
	/**
	 * Enable or disable OutMsg group
	 * @param enabled
	 */
	private void setEnableOutMsgGroup(Boolean enabled) {
		mOutMsgGroup.setEnabled(enabled);
		mDeliveryTypeWidget.setEnabled(enabled);
		mOutOperationWidget.setEnabled(enabled);
		mTransformationWidget.setEnabled(enabled);
		mEditTransformationWidget.setEnabled(enabled);
		mSourceWidget.setEnabled(enabled);		
	}
	
	/**
	 * Initialise data for result messages for the given Task
	 * @param task null if this is the new Task 
	 */
	private void populateResultData(Task task) {
		mResultData = new ResultData(task);		
		mResultWidget.setItems(mResultData.toArray());
		mResultWidget.select(0);
	}
	
	/**
	 * Redisplay result message list since there has been update on mResultData
	 */
	private void rePopulateResultData() {
		mResultWidget.setItems(mResultData.toArray());
		mResultWidget.select(0);
	}
	
	/**
	 * Redisplay source message list since there has been update on mSourceData
	 */
	private void rePopulateSourceData() {
		mSourceWidget.setItems(mSourceData.toArray());
		mSourceWidget.select(0);
	}
	
	/**
	 * Initialise data for transformation files
	 */
	private void populateTransformationData() {
		mTransformationData = new ArrayList<String>();
		mTransformationData.add("<<New>>");
		IProject project = this.instance.getProject();
		try {
			IResource[] transformationFolder = project.getFolder(PROJECT_PATH_TRANSFORMATION).members();
			for (int i=0; i < transformationFolder.length; i++) {
				if ((transformationFolder[i] instanceof IFile) && transformationFolder[i].getName().endsWith(TRANSFORMATION_FILE_EXTENSION)) {
					mTransformationData.add(transformationFolder[i].getName());
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		mTransformationWidget.setItems(mTransformationData.toArray(new String[0]));
	}
	
	/**
	 * Initialise data for source messages for the given Task
	 * @param task null if this is the new Task 
	 */
	private void populateSourceData(Task task) {		
		mSourceData = new SourceData(task);		
		mSourceWidget.setItems(mSourceData.toArray());
		mSourceWidget.select(0);

	}
	
	/**
	 * Display dialog for entering transformation file name
	 * @param x horizontal position
	 * @param y vertical position
	 */
	void createSetGetDialog(Combo widget, Button button, int x, int y) {

		mTransformationFileDialog = new Shell(shell, SWT.DIALOG_TRIM | SWT.MODELESS);
		mTransformationFileDialog.setLayout(new GridLayout(2, false));
		mTransformationFileDialog.setText("Enter transformation file name");
		mTransformationFileDialog.setSize(300, 100);

		// Create text box for filename
		mTransformationFileName = new Text(mTransformationFileDialog, SWT.BORDER | SWT.FILL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		mTransformationFileName.setLayoutData(data);

		// Create default filename
		String defaultFileName = getDefaultTransformationFileName();
		mTransformationFileName.setText(defaultFileName);

		// Create buttons
		mTransformationCreateButton = new Button(mTransformationFileDialog, SWT.PUSH);
		mTransformationCreateButton.setText("Create File");
		mTransformationCreateButton.addSelectionListener(new MySelectionAdapter(widget, button) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				createTransformationFile(getWidget(), getButton(), mTransformationFileName.getText());
			}
		});

		mTransformationCancelButton = new Button(mTransformationFileDialog, SWT.PUSH);
		mTransformationCancelButton.setText("Cancel");
		mTransformationCancelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mTransformationFileDialog.close();
			}
		});

		mTransformationFileDialog.setLocation(x, y);
		mTransformationFileDialog.open();
	}

	String getDefaultTransformationFileName() {
		String input = mNameWidget.getText();
		if (input == null || input.length() == 0) {
			int i = 0;
			IProject project = this.instance.getProject();
			while (true) {
				IFile file = project.getFile(PROJECT_PATH_TRANSFORMATION + "transformation" + i
						+ TRANSFORMATION_FILE_EXTENSION);
				if (!file.exists())
					break;
				i++;
			}
			input = "transformation" + i;
		} else
			input = input.replace(" ", "");

		return input + TRANSFORMATION_FILE_EXTENSION;
	}

	/**
	 * Create transformation file within the transformation folder
	 * @param fileName specified file name
	 */
	void createTransformationFile(Combo widget, Button button, String fileName) {
		if (fileName == null || fileName.length() == 0) {
			MessageDialog.openError(mTransformationFileDialog, "Error",
					"Transformation filename is not specified");
			return;
		}

		if (!fileName.endsWith(TRANSFORMATION_FILE_EXTENSION)) {
			MessageDialog.openError(mTransformationFileDialog, "Error",
					"Transformation file needs to have " + TRANSFORMATION_FILE_EXTENSION + " extension");
			return;
		}

		IProject project = this.instance.getProject();
		IFile file = project.getFile(PROJECT_PATH_TRANSFORMATION + fileName);

		if (file.exists()) {
			MessageDialog
					.openError(mTransformationFileDialog, "Error", "Transformation file already exists");
			return;
		}

		// Create a new file
		try {
			String contents = "";
			InputStream source = new ByteArrayInputStream(contents.getBytes());
			file.create(source, false, null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		// update transformation widget
		setTransformationFile(widget, button, fileName);

		// Close the dialog
		mTransformationFileDialog.close();
	}

	/**
	 * Update transformation widget
	 * @param transformationFile
	 */
	void setTransformationFile(Combo widget, Button button, String transformationFile) {
		// Update the transformation widget
		mTransformationData.add(transformationFile);
		widget.setItems(mTransformationData.toArray(new String[0]));
		widget.select(mTransformationData.size()-1);
		
		// Change the corresponding button
		updateTransformationWidget(widget, button);
	}

	/**
	 * Validate input data for a new task. Store parsed mInOperation & mOutOperation if success
	 * Checking points
	 *   1. Task name needs to be set
	 *   2. Task name should not be the same as existing ones
	 *   3. Formats for operations are correct
	 * @return
	 */
	private boolean validateTask() {
		
		/* Name not null */
		if (mNameWidget.getText() == null || mNameWidget.getText().length()==0) {
			MessageDialog.openError(shell, "Incorrect input", "Task name needs to be set");
			return false;
		}
		
		/* No name conflict */
		if (newTask) {
			Role role = this.instance.getRole();
			java.util.List<Task> tasks = role.getTask();
			
			for (int i=0; i<tasks.size(); i++) {
				if (tasks.get(i).getId().equalsIgnoreCase(mNameWidget.getText())) {
					MessageDialog.openError(shell, "Incorrect input", "The same task name is in use");
					return false;
				}
			}			
		}
		
		/* Well-formed operation format */
		mInOperation = null;
		mOutOperation = null;
		if ((mInOperationWidget.getText() != null) && (mInOperationWidget.getText().length() != 0)) {
			try {
				mInOperation = parseOperationString(mInOperationWidget.getText());
			}
			catch (Exception e) {
				MessageDialog.openError(shell, "Incorrect input", "Operation format for InMsg is incorrect. " +
						  "Example of a well-formed operation:\n" +
						  "returnType operationName (\n" +
						  "  paramType paramName,\n"+
						  "  paramType paramName \n" +
						  ")");
				return false;
			}
		}
		
		if ((mOutOperationWidget.getText() != null) && (mOutOperationWidget.getText().length() != 0)) {
			try {
				mOutOperation = parseOperationString(mOutOperationWidget.getText());
			}
			catch (Exception e) {
				MessageDialog.openError(shell, "Incorrect input", "Operation format for OutMsg is incorrect. " +
						  "Example of a well-formed operation:\n" +
						  "returnType operationName (\n" +
						  "  paramType paramName,\n"+
						  "  paramType paramName \n" +
						  ")");
				return false;
			}
		}
				
		return true;
	}
	
	/**
	 * Save a new task to this corresponding role
	 */
	private boolean taskSaved() {
		
		// Validate the inputs
		if (!validateTask()) return false;
		
		Role role = this.instance.getRole();
		java.util.List<Task> tasks = role.getTask();
		java.util.List<Task> newTaskList = new ArrayList<Task>();
		
		// Check if we add a new task or modify an existing task
		// Task name is used as unique identifier
		Task task = null;
		Boolean overwriteTask = false;
		for (int i=0; i<tasks.size(); i++) {
			task = tasks.get(i);			
			if (task.getId().equalsIgnoreCase(mNameWidget.getText())) {
				task = createNewTask();
				overwriteTask = true;
			}
			
			newTaskList.add(task);
		}
		
		if (!overwriteTask) {
			task = createNewTask();
			newTaskList.add(task);
		}	

		EReference feature = SmcPackage.eINSTANCE.getRole_Task();
		Command cmd = SetCommand.create(instance.getEditingDomain(), role, feature, newTaskList);
		instance.getEditingDomain().getCommandStack().execute(cmd);
		
		return true;
	}
	
	private Task createNewTask() {
		Task task = SmcFactory.eINSTANCE.createTask();

		/* Id */
		task.setId(mNameWidget.getText());
		
		/* isMsgDriven */
		if (mIsMessageDrivenWidget.getText().equalsIgnoreCase(Boolean.TRUE.toString()))
			task.setIsMsgDriven(true);
		else
			task.setIsMsgDriven(false);

		/* InMsg & ResultMsg */
		if (mInMsgGroup.isEnabled()) {
			// InMsg
			if (mMEPWidget.getText().equalsIgnoreCase(MEP_OUT_IN) ||
				((mInOperationWidget.getText() != null) && (mInOperationWidget.getText().length() != 0))) {
				InMsg inMsg = SmcFactory.eINSTANCE.createInMsg();
				
				/* isResponse */
				if (mMEPWidget.getText().equalsIgnoreCase(MEP_OUT_IN)) 
					inMsg.setIsResponse(true);
				
				/* Operation */
				if (mInOperation != null) {
					EReference feature = SmcPackage.eINSTANCE.getInMsg_Operation();
					Command cmd = SetCommand.create(instance.getEditingDomain(), inMsg, feature, mInOperation);
					instance.getEditingDomain().getCommandStack().execute(cmd);					
				}				
				
				/* Add InMsg to Task */
				EReference feature = SmcPackage.eINSTANCE.getTask_In();
				Command cmd = SetCommand.create(instance.getEditingDomain(), task, feature, inMsg);
				instance.getEditingDomain().getCommandStack().execute(cmd);						
			}
			
			// ResultMsg is stored separately from its own UI
			if (!mResultData.isEmpty()) {
				EReference feature = SmcPackage.eINSTANCE.getTask_ResultMsg();
				Command cmd = SetCommand.create(instance.getEditingDomain(), task, feature, mResultData.getResultMsgs());
				instance.getEditingDomain().getCommandStack().execute(cmd);										
			}
		}
		
		/* OutMsg & SrcMsg */
		if (mOutMsgGroup.isEnabled()) {
			if (mMEPWidget.getText().equalsIgnoreCase(MEP_IN_OUT) ||
				mDeliveryTypeWidget.getSelectionIndex() != -1 ||
				((mOutOperationWidget.getText() != null) && (mOutOperationWidget.getText().length() != 0)) ||
				mTransformationWidget.getSelectionIndex() > 0) {
				
				OutMsg outMsg = SmcFactory.eINSTANCE.createOutMsg();
				
				/* isResponse */
				if (mMEPWidget.getText().equalsIgnoreCase(MEP_IN_OUT)) 
					outMsg.setIsResponse(true);
				
				// Delivery type
				if (mDeliveryTypeWidget.getText().equalsIgnoreCase(MessageType.PULL.toString()))
					outMsg.setDeliveryType(MessageType.PULL);
				else if (mDeliveryTypeWidget.getText().equalsIgnoreCase(MessageType.PUSH.toString()))
					outMsg.setDeliveryType(MessageType.PUSH);
				
				// Operation
				if (mOutOperation != null) {
					EReference feature = SmcPackage.eINSTANCE.getOutMsg_Operation();
					Command cmd = SetCommand.create(instance.getEditingDomain(), outMsg, feature, mOutOperation);
					instance.getEditingDomain().getCommandStack().execute(cmd);
				}
				
				// Transformation file
				if (mTransformationWidget.getSelectionIndex() > 0)
					outMsg.setTransformation(mTransformationWidget.getText());

				/* Add OutMsg to Task */
				EReference feature = SmcPackage.eINSTANCE.getTask_Out();
				Command cmd = SetCommand.create(instance.getEditingDomain(), task, feature, outMsg);
				instance.getEditingDomain().getCommandStack().execute(cmd);				
			}
			
			// SrcMsg is stored separately from its own UI
			if (!mSourceData.isEmpty()) {
				EReference feature = SmcPackage.eINSTANCE.getTask_SrcMsg();
				Command cmd = SetCommand.create(instance.getEditingDomain(), task, feature, mSourceData.getSourceMsgs());
				instance.getEditingDomain().getCommandStack().execute(cmd);										
			}
		}
		
		return task;
	}

	private Operation parseOperationString(String operationString) throws Exception {
		
		if (operationString == null || operationString.length() == 0) return null;
		
		Operation operation = SmcFactory.eINSTANCE.createOperation();
		
		/* Replace all line terminator with a space */
		String newOperationString = operationString.replace('\n', ' ');
		
		/* Return */
		String[] returns = newOperationString.trim().split(" +", 2);
		operation.setReturn(returns[0]);
		
		/* Name */
		String[] names = returns[1].split("\\(", 2);
		operation.setName(names[0].trim());
		
		/* Parameter */
		String parameterListString = names[1].split("\\)")[0].trim();
		if (parameterListString != null && parameterListString.length() > 0) {
			// Create a list of parameters
			String[] parameterList = parameterListString.split(",");
			java.util.List<Parameter> parameters = new ArrayList<Parameter>();
			for (int i=0; i<parameterList.length; i++) {
				String[] singleParameter = parameterList[i].trim().split(" +");
				if (singleParameter.length > 2) 
					throw new Exception("Incorrect parameter format for '" + parameterList[i] + "'");
				Parameter parameter = SmcFactory.eINSTANCE.createParameter();
				parameter.setType(singleParameter[0]);
				parameter.setName(singleParameter[1]);
				parameters.add(parameter);
			}
			
			// Add to operation
			EReference feature = SmcPackage.eINSTANCE.getOperation_Parameter();
			Command cmd = SetCommand.create(instance.getEditingDomain(), operation, feature, parameters);
			instance.getEditingDomain().getCommandStack().execute(cmd);														
		}	
		
		return operation;
	}
	
	private void rePopulateTableData() {
		mTableWidget.removeAll();
		populateTableData();
	}
	
	/**
	 * Grey out InMsg or OutMsg groups depending on selected MEP
	 */
	private void renderMEP() {
		setEnableInMsgGroup(mMEPWidget.getText().contains(MEP_IN));
		setEnableOutMsgGroup(mMEPWidget.getText().contains(MEP_OUT));
	}
	
	/**
	 * Update label of the button next to transformation widget (i.e. disable, 'Create', or 'Edit')
	 * depending on the value of the widget
	 */
	private void updateTransformationWidget(Combo widget, Button button) {
		if (widget.getSelectionIndex() < 1) {
			button.setText(TRANSFORMATION_BUTTON_STATE_CREATE);
			if (mTransformationWidget.getSelectionIndex() == -1)
				button.setEnabled(false);
			else 
				button.setEnabled(true);
		}
		else {
			button.setText(TRANSFORMATION_BUTTON_STATE_EDIT);
			button.setEnabled(true);
		}
	}
	
	/**
	 * Confirm and save the task before going to edit the transformation file
	 * @return
	 */
//	private boolean successfullySaved() {		
//		if (!taskSaved()) return false;		
//		return true;
//	}
	
	/**
	 * Open the specified transformation file
	 * @param fileName
	 */
	void openTransformationFile(String fileName) {
		// First, close the existing role editor
		shell.close();
		
		// Second, open the transformation file in the corresponding editor
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IProject project = this.instance.getProject();
		IFile file = project.getFile(PROJECT_PATH_TRANSFORMATION + fileName);

		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		try {
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	class ResultData {
		java.util.List<ResultMsg> mResultMsgs;
		
		ResultData(Task task) {
			mResultMsgs = new ArrayList<ResultMsg>();
			if (task != null) {
				for (ResultMsg resultMsg: task.getResultMsg())
					mResultMsgs.add(resultMsg);
			}
		}
		
		public boolean isEmpty() {
			return (mResultMsgs.size() == 0);
		}

		public void update(int index, ResultMsg resultMsg) {
			if (index == -1) mResultMsgs.add(resultMsg);
			else mResultMsgs.set(index, resultMsg);
		}

		public void remove(int index) {
			mResultMsgs.remove(index);
		}

		String[] toArray() {
			ArrayList<String> resultData = new ArrayList<String>();

			resultData.add("<<New>>");
			
			for (ResultMsg resultMsg: mResultMsgs) {
				if (resultMsg.getFactId() != null && resultMsg.getFactId().length() > 0)
					resultData.add(resultMsg.getFactId());
				else
					resultData.add(resultMsg.getContractId() + "_" + 
											   resultMsg.getTermId() + "_" +
											   Boolean.toString(resultMsg.isIsResponse()));
			}
			
			return resultData.toArray(new String[0]);
		}
		
		ResultMsg getResultMsg(int index) {
			if (index <0 || index >= mResultMsgs.size()) return null;
			return mResultMsgs.get(index);
		}
		
		java.util.List<ResultMsg> getResultMsgs() {
			return mResultMsgs;
		}
	}
	
	class SourceData {
		java.util.List<SrcMsg> mSourceMsgs;
		
		SourceData(Task task) {
			mSourceMsgs = new ArrayList<SrcMsg>();
			if (task != null) {
				for (SrcMsg sourceMsg: task.getSrcMsg())
					mSourceMsgs.add(sourceMsg);
			}
		}
		
		public boolean isEmpty() {
			return (mSourceMsgs.size() == 0);
		}

		public void update(int index, SrcMsg sourceMsg) {
			if (index == -1) mSourceMsgs.add(sourceMsg);
			else mSourceMsgs.set(index, sourceMsg);
		}

		public void remove(int index) {
			mSourceMsgs.remove(index);
		}

		String[] toArray() {
			ArrayList<String> sourceData = new ArrayList<String>();

			sourceData.add("<<New>>");
			
			for (SrcMsg sourceMsg: mSourceMsgs) {
				if (sourceMsg.getFactId() != null && sourceMsg.getFactId().length() > 0)
					sourceData.add(sourceMsg.getFactId());
				else
					sourceData.add(sourceMsg.getContractId() + "_" + 
											   sourceMsg.getTermId() + "_" +
											   Boolean.toString(sourceMsg.isIsResponse()));
			}
			
			return sourceData.toArray(new String[0]);
		}
		
		SrcMsg getSourceMsg(int index) {
			if (index <0 || index >= mSourceMsgs.size()) return null;
			return mSourceMsgs.get(index);
		}
		
		java.util.List<SrcMsg> getSourceMsgs() {
			return mSourceMsgs;
		}
	}
	
	class MySelectionAdapter extends SelectionAdapter {
		int index;
		Combo widget;
		Button button;
		
		public MySelectionAdapter(int i) {
			index = i;
		}
		
		public MySelectionAdapter(Combo c, Button b) {
			widget = c;
			button = b;
		}
		
		int getIndex() {
			return index;
		}
		
		Combo getWidget() {
			return widget;
		}
		
		Button getButton() {
			return button;
		}
	}
}
