package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.DeonticType;
import au.edu.swin.ict.road.designer.smc.DirectionType;
import au.edu.swin.ict.road.designer.smc.MessageType;
import au.edu.swin.ict.road.designer.smc.Operation;
import au.edu.swin.ict.road.designer.smc.Parameter;
import au.edu.swin.ict.road.designer.smc.SmcFactory;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.Term;

public class TermTab extends Tab4Contract {
	
	Table mTableWidget;
	Text mNameWidget, mDescriptionWidget, mOperationWidget;
	Combo mMessageTypeWidget, mDeonticTypeWidget, mDirectionWidget;
	Button mEditWidget, mAddWidget, mRemoveWidget;
	Operation mOperation;
	
	public static final String BUTTON_STATE_EDIT = "Edit";
	public static final String BUTTON_STATE_SAVE = "Save";
	
	TermTab(ContractEditorEditPolicy instance) {
		super(instance);
	}

	@Override
	String getTabText() {
		return "Terms";
	}
	
	@Override
	void createItemGroup() {
		super.createItemGroup();
		itemGroup.setText("Interaction Terms");
	}
	
	@Override
	void createItemWidgets() {
		super.createItemWidgets();
		
		// Create table
		mTableWidget = new Table (itemGroup, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan = 2;
		mTableWidget.setLayoutData(data);
		mTableWidget.setLinesVisible (true);
		mTableWidget.setHeaderVisible (true);

		// Set header
		TableColumn nameColumn = new TableColumn(mTableWidget, SWT.NONE);
		nameColumn.setText("Name");
		nameColumn.setWidth(150);

		TableColumn descriptionColumn = new TableColumn(mTableWidget, SWT.FILL);
		descriptionColumn.setText("Description");
		descriptionColumn.setWidth(400);
		
		// Populate data
		populateTableData();
		
		// Add event listener
		mTableWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = mTableWidget.getSelectionIndex();
				if (index == -1) return;
				
				displayTerm(index);
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
				removeTerms(indices);
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
	
	private void populateTableData() {
		Contract contract = this.instance.getContract();
		List<Term> terms = contract.getTerm();
		
		for (int i=0; i<terms.size(); i++) {
			Term term = terms.get(i);
			TableItem item = new TableItem(mTableWidget, SWT.NONE);
			item.setText(0, term.getName());
			item.setText(1, term.getDescription());
		}
	}
	
	private void rePopulateTableData() {
		mTableWidget.removeAll();
		populateTableData();
	}
	
	private void displayTerm(int index) {
		Contract contract = this.instance.getContract();
		List<Term> terms = contract.getTerm();
		Term term = terms.get(index);
		Operation operation = term.getOperation().get(0);
		
		mNameWidget.setText(term.getName());
		mDescriptionWidget.setText(term.getDescription());
		mMessageTypeWidget.setText(term.getMessageType().toString());
		mDeonticTypeWidget.setText(term.getDeonticType().toString());
		mDirectionWidget.setText(term.getDirection().toString());
		mOperationWidget.setText(Utils.convertOperation(operation));
		
		// Make all fields read-only
		mEditWidget.setText(BUTTON_STATE_EDIT);
		mEditWidget.setVisible(true);
		setEnableContentWidget(false);
	}
	
	@Override
	void createContentWidgets() {
		super.createContentWidgets();
		
		/* Name */
		Label label = new Label(contentGroup, SWT.WRAP);
		label.setText("Name");
		
		mNameWidget = new Text(contentGroup, SWT.SINGLE | SWT.BORDER);
		GridData nameData = new GridData(200,20);
		mNameWidget.setLayoutData(nameData);
		
		/* Description */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Description");
			
		mDescriptionWidget = new Text(contentGroup, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData descriptionData = new GridData(200,100);
		mDescriptionWidget.setLayoutData(descriptionData);
		
		/* messageType */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Message Type");
			
		mMessageTypeWidget = new Combo(contentGroup, SWT.READ_ONLY);
		mMessageTypeWidget.setItems(new String[] {MessageType.PUSH.toString(), MessageType.PULL.toString()});
		
		/* deonticType */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Deontic Type");
			
		mDeonticTypeWidget = new Combo(contentGroup, SWT.READ_ONLY);
		mDeonticTypeWidget.setItems(new String[] {DeonticType.PERMISSION.toString(), DeonticType.OBLIGATION.toString()});
		
		/* direction */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Direction");
			
		mDirectionWidget = new Combo(contentGroup, SWT.READ_ONLY);
		mDirectionWidget.setItems(new String[] {DirectionType.ATO_B.toString(), DirectionType.BTO_A.toString()});
		
		/* operation */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Operation");
			
		mOperationWidget = new Text(contentGroup, SWT.BORDER | SWT.MULTI);
		GridData operationData = new GridData(200, 120);
		mOperationWidget.setLayoutData(operationData);
		
		/* Edit Buttons */
		mEditWidget = new Button(contentGroup, SWT.PUSH);
		GridData editButtonData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		editButtonData.horizontalSpan=2;
		mEditWidget.setLayoutData(editButtonData);
		mEditWidget.setVisible(false);
		
		/* Event Listener */
		mEditWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (mEditWidget.getText().equalsIgnoreCase(BUTTON_STATE_EDIT)) {
					setEnableContentWidget(true);
					mEditWidget.setText(BUTTON_STATE_SAVE);
				}
				else if (mEditWidget.getText().equalsIgnoreCase(BUTTON_STATE_SAVE)) {
					if (!validateTerm()) return;
					setEnableContentWidget(false);
					mEditWidget.setText(BUTTON_STATE_EDIT);
					saveTerm();
					rePopulateTableData();
				}
			}
		});
		
		setEnableContentWidget(false);
	}
	
	private void initializeContentWidget() {
		setEnableContentWidget(true);
		mMessageTypeWidget.setText(mMessageTypeWidget.getItem(0));
		mDeonticTypeWidget.setText(mDeonticTypeWidget.getItem(0));
		mDirectionWidget.setText(mDirectionWidget.getItem(0));
		mEditWidget.setText(BUTTON_STATE_SAVE);
		mEditWidget.setVisible(true);
	}
	
	private boolean validateTerm() {
		if (mNameWidget.getText() == null || mNameWidget.getText().length()==0) {
			MessageDialog.openError(shell, "Incorrect input", "Term name needs to be set");
			return false;
		}
		
		/* Well-formed operation format */
		mOperation = null;
		if ((mOperationWidget.getText() != null) && (mOperationWidget.getText().length() != 0)) {
			try {
				mOperation = parseOperationString(mOperationWidget.getText());
			}
			catch (Exception e) {
				MessageDialog.openError(shell, "Incorrect input", "The format of Operation is incorrect. " +
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
	
	private void setEnableContentWidget(Boolean enabled) {
		mNameWidget.setEnabled(enabled);
		mDescriptionWidget.setEnabled(enabled);
		mMessageTypeWidget.setEnabled(enabled);
		mDeonticTypeWidget.setEnabled(enabled);
		mDirectionWidget.setEnabled(enabled);
		mOperationWidget.setEnabled(enabled);
	}
	
	private void removeTerms(int[] indices) {		
		Contract contract = this.instance.getContract();
		List<Term> terms = contract.getTerm();
		List<Term> newTermList = new ArrayList<Term>();
		List<Term> removeTerms = new ArrayList<Term>();

		// Create a copy of term list
		for (int i=0; i<terms.size(); i++) {
			newTermList.add(terms.get(i));
		}
		
		// Create a list of terms to be removed
		for (int i=0; i<indices.length; i++)
			removeTerms.add(terms.get(indices[i]));
		
		// Remove terms
		newTermList.removeAll(removeTerms);

		// Update model
		EReference feature = SmcPackage.eINSTANCE.getContract_Term();
		Command cmd = SetCommand.create(instance.getEditingDomain(), contract, feature, newTermList);
		instance.getEditingDomain().getCommandStack().execute(cmd);
	}
	
	private void saveTerm() {
		Contract contract = this.instance.getContract();
		List<Term> terms = contract.getTerm();
		List<Term> newTermList = new ArrayList<Term>();
		
		// Check if we add a new term or modify an existing term
		// Term name is used as unique identifier
		Term term = null;
		Boolean newTerm = true;
		for (int i=0; i<terms.size(); i++) {
			term = terms.get(i);			
			if (term.getName().equalsIgnoreCase(mNameWidget.getText())) {
//				term = createNewTerm(term);
				term = createNewTerm(null);
				newTerm = false;
			}
			
			newTermList.add(term);
		}
		
		if (newTerm) {
			term = createNewTerm(null);
			newTermList.add(term);
		}	

		EReference feature = SmcPackage.eINSTANCE.getContract_Term();
		Command cmd = SetCommand.create(instance.getEditingDomain(), contract, feature, newTermList);
		instance.getEditingDomain().getCommandStack().execute(cmd);
	}
	
	private Term createNewTerm(Term term) {
		if (term == null)
			term = SmcFactory.eINSTANCE.createTerm();

		term.setName(mNameWidget.getText());
		term.setDescription(mDescriptionWidget.getText());
		
		if (mMessageTypeWidget.getText().equalsIgnoreCase(MessageType.PULL.toString()))
			term.setMessageType(MessageType.PULL);
		else
			term.setMessageType(MessageType.PUSH);
		if (mDeonticTypeWidget.getText().equalsIgnoreCase(DeonticType.OBLIGATION.toString()))
			term.setDeonticType(DeonticType.OBLIGATION);
		else
			term.setDeonticType(DeonticType.PERMISSION);
		if (mDirectionWidget.getText().equalsIgnoreCase(DirectionType.ATO_B.toString()))
			term.setDirection(DirectionType.ATO_B);
		else
			term.setDirection(DirectionType.BTO_A);
		
		List<Operation> operationList = new ArrayList<Operation>();
		if (mOperation != null)
			operationList.add(mOperation);
		
		EReference feature = SmcPackage.eINSTANCE.getTerm_Operation();
		Command cmd = SetCommand.create(instance.getEditingDomain(), term, feature, operationList);
		instance.getEditingDomain().getCommandStack().execute(cmd);		
		
		return term;
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

}
