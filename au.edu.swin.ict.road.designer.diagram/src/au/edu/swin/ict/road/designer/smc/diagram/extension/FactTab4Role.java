package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import au.edu.swin.ict.road.designer.smc.AcquisitionRegime;
import au.edu.swin.ict.road.designer.smc.ExternalFactLink;
import au.edu.swin.ict.road.designer.smc.Mode;
import au.edu.swin.ict.road.designer.smc.ProvisionRegime;
import au.edu.swin.ict.road.designer.smc.Role;
import au.edu.swin.ict.road.designer.smc.SmcFactory;
import au.edu.swin.ict.road.designer.smc.SmcPackage;

public class FactTab4Role extends Tab4Role {
	
	Group mFactPropertyGroup, mFactLinkPropertyGroup;

	Table mTableWidget;
	Text mNameWidget, mSourceWidget, mIdentifierWidget, mAttributeWidget;
	Combo mOnChangeWidget, mMonitorModeWidget, mProvideModeWidget;
	Button mMonitorWidget, mProvideWidget;
	Text mMonitorSyncIntervalWidget, mProvideSyncIntervalWidget;
	Group mMonitorGroup, mProvideGroup;
	Composite mMonitorLeftComposite, mMonitorRightComposite;
	Composite mProvideLeftComposite, mProvideRightComposite;
	Button mEditFactLinkWidget;
	
	public static final String BUTTON_STATE_EDIT = "Edit";
	public static final String BUTTON_STATE_SAVE = "Save";
	
	int mFactLinkIndex = -1;
	
	FactTab4Role(RoleEditorEditPolicy instance) {
		super(instance);
	}

	@Override
	String getTabText() {
		return "Facts";
	}
	
	@Override
	void createItemGroup() {
		super.createItemGroup();
		itemGroup.setText("Fact List");
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
				
				displayFact(index);
			}
		});
		
	}
	
	private void populateTableData() {
		Role role = this.instance.getRole();
		List<ExternalFactLink> factLinks = role.getExternalFactLink();
		
		// populate table items
		for (int i=0; i<factLinks.size(); i++) {
			ExternalFactLink factLink = factLinks.get(i);
			TableItem item = new TableItem(mTableWidget, SWT.NONE);
			item.setText(0, factLink.getFact().getName());
		}
	}
	
	private void displayFact(int index) {		
		EAttribute attribute;
		
		// Persist index for edit
		mFactLinkIndex = index;
		
		// Retrieve factLink
		Role role = this.instance.getRole();
		List<ExternalFactLink> factLinks = role.getExternalFactLink();
		ExternalFactLink factLink = factLinks.get(index);

		// Fact properties
		mNameWidget.setText(factLink.getFact().getName());
		mSourceWidget.setText(factLink.getFact().getSource());
		mIdentifierWidget.setText(factLink.getFact().getIdentifier());
		
		EList<String> attributes = factLink.getFact().getAttribute();
		StringBuffer buf = new StringBuffer();
		for (int i=0; i<attributes.size(); i++) {
			buf.append(attributes.get(i) + ",");
		}
		buf.deleteCharAt(buf.length()-1);
		mAttributeWidget.setText(buf.toString());
		
		// FactLink properties
		attribute = SmcPackage.eINSTANCE.getExternalFactLink_OnChange();
		if (factLink.eIsSet(attribute))
			mOnChangeWidget.setText(Boolean.toString(factLink.isOnChange()));
		else
			mOnChangeWidget.deselectAll();
		
		// Monitor group
		emptyMonitorGroup();
		if (factLink.getAcquisitionRegime() != null) {
			mMonitorWidget.setSelection(true);
			
			attribute = SmcPackage.eINSTANCE.getAcquisitionRegime_SyncInterval();
			if (factLink.getAcquisitionRegime().eIsSet(attribute))
				mMonitorSyncIntervalWidget.setText("" + factLink.getAcquisitionRegime().getSyncInterval());
			
			attribute = SmcPackage.eINSTANCE.getAcquisitionRegime_Mode();
			if (factLink.getAcquisitionRegime().eIsSet(attribute))
				mMonitorModeWidget.setText(factLink.getAcquisitionRegime().getMode().toString());
		}
		
		// Provide group
		emptyProvideGroup();
		if (factLink.getProvisionRegime() != null) {
			mProvideWidget.setSelection(true);
			
			attribute = SmcPackage.eINSTANCE.getProvisionRegime_SyncInterval();
			if (factLink.getProvisionRegime().eIsSet(attribute))
				mProvideSyncIntervalWidget.setText("" + factLink.getProvisionRegime().getSyncInterval());
			
			attribute = SmcPackage.eINSTANCE.getProvisionRegime_Mode();
			if (factLink.getProvisionRegime().eIsSet(attribute))
				mProvideModeWidget.setText(factLink.getProvisionRegime().getMode().toString());
		}
		
		// Display edit button
		mEditFactLinkWidget.setText(BUTTON_STATE_EDIT);
		mEditFactLinkWidget.setVisible(true);
	}
	
	// Clear data in provide group
	private void emptyProvideGroup() {
		mProvideWidget.setSelection(false);
		mProvideSyncIntervalWidget.setText("");
		mProvideModeWidget.deselectAll();
	}

	// Clear data in monitor group
	private void emptyMonitorGroup() {
		mMonitorWidget.setSelection(false);
		mMonitorSyncIntervalWidget.setText("");
		mMonitorModeWidget.deselectAll();
	}

	@Override
	void createContentWidgets() {
		super.createContentWidgets();
		
		/* Fact property group */
		mFactPropertyGroup = new Group (contentGroup, SWT.NONE);
		GridData factPropertyData = new GridData(SWT.FILL, SWT.FILL, false, false);
		factPropertyData.horizontalSpan=2;
		mFactPropertyGroup.setLayoutData (factPropertyData);
		mFactPropertyGroup.setLayout (new GridLayout (2, false));
		mFactPropertyGroup.setText ("Fact properties");
		
		GridData gridData = new GridData(200,20);

		/* Name */
		Label label = new Label(mFactPropertyGroup, SWT.WRAP);
		label.setText("Name");
		
		mNameWidget = new Text(mFactPropertyGroup, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		mNameWidget.setEnabled(false);
		mNameWidget.setLayoutData(gridData);
		
		/* Source */
		label = new Label(mFactPropertyGroup, SWT.WRAP);
		label.setText("Source");
		
		mSourceWidget = new Text(mFactPropertyGroup, SWT.MULTI | SWT.BORDER);
		mSourceWidget.setEnabled(false);
		mSourceWidget.setLayoutData(gridData);

		/* Identifier */
		label = new Label(mFactPropertyGroup, SWT.WRAP);
		label.setText("Identifier");
		
		mIdentifierWidget = new Text(mFactPropertyGroup, SWT.MULTI | SWT.BORDER);
		mIdentifierWidget.setEnabled(false);
		mIdentifierWidget.setLayoutData(gridData);

		/* Attribute */
		label = new Label(mFactPropertyGroup, SWT.WRAP);
		label.setText("Attributes");
		
		mAttributeWidget = new Text(mFactPropertyGroup, SWT.MULTI | SWT.BORDER);
		mAttributeWidget.setEnabled(false);
		mAttributeWidget.setLayoutData(gridData);		
		
		/* FactLink property group */
		mFactLinkPropertyGroup = new Group (contentGroup, SWT.NONE);
		GridData factLinkPropertyData = new GridData(SWT.FILL, SWT.FILL, false, false);
		factLinkPropertyData.horizontalSpan=2;
		mFactLinkPropertyGroup.setLayoutData (factLinkPropertyData);
		mFactLinkPropertyGroup.setLayout (new GridLayout (2, false));
		mFactLinkPropertyGroup.setText ("FactLink properties");
		
		/* OnChange */
		label = new Label(mFactLinkPropertyGroup, SWT.WRAP);
		label.setText("onChange");

		mOnChangeWidget = new Combo(mFactLinkPropertyGroup, SWT.READ_ONLY);
		mOnChangeWidget.setItems(new String[] {Boolean.TRUE.toString(), Boolean.FALSE.toString()});
		mOnChangeWidget.setEnabled(false);

		/* Monitor group */
		mMonitorGroup = new Group (mFactLinkPropertyGroup, SWT.NONE);
		GridData monitorGroupData = new GridData(SWT.FILL, SWT.FILL, false, false);
		monitorGroupData.horizontalSpan=2;
		mMonitorGroup.setLayoutData (monitorGroupData);
		mMonitorGroup.setLayout (new GridLayout (2, false));
		
		GridData subGridData = new GridData(100,20);

		/* Monitor left group */
		mMonitorLeftComposite = new Composite (mMonitorGroup, SWT.NONE);
		mMonitorLeftComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		mMonitorLeftComposite.setLayout(new GridLayout(2, false));
		
		/* Monitor check box */
		mMonitorWidget = new Button(mMonitorLeftComposite, SWT.CHECK);
		mMonitorWidget.setEnabled(false);
		
		label = new Label(mMonitorLeftComposite, SWT.WRAP);
		label.setText("Monitor");
		
		/* Event listener */
		mMonitorWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				emptyProvideGroup(); 
			}
		});
		
		/* Monitor right group */
		mMonitorRightComposite = new Composite (mMonitorGroup, SWT.NONE);
		mMonitorRightComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		mMonitorRightComposite.setLayout(new GridLayout(2, false));
		
		/* syncInterval */		
		label = new Label(mMonitorRightComposite, SWT.WRAP);
		label.setText("syncInterval");
		
		mMonitorSyncIntervalWidget = new Text(mMonitorRightComposite, SWT.MULTI | SWT.BORDER);
		mMonitorSyncIntervalWidget.setEnabled(false);
		mMonitorSyncIntervalWidget.setLayoutData(subGridData);
		
		/* mode */		
		label = new Label(mMonitorRightComposite, SWT.WRAP);
		label.setText("mode");
		
		mMonitorModeWidget = new Combo(mMonitorRightComposite, SWT.READ_ONLY);
		mMonitorModeWidget.setItems(new String[] {Mode.ACTIVE.toString(), Mode.PASSIVE.toString()});
		mMonitorModeWidget.setEnabled(false);

		/* Provide group */
		mProvideGroup = new Group (mFactLinkPropertyGroup, SWT.NONE);
		GridData provideGroupData = new GridData(SWT.FILL, SWT.FILL, false, false);
		provideGroupData.horizontalSpan=2;
		mProvideGroup.setLayoutData (provideGroupData);
		mProvideGroup.setLayout (new GridLayout (2, false));
		
		/* Provide left group */
		mProvideLeftComposite = new Composite (mProvideGroup, SWT.NONE);
		mProvideLeftComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		mProvideLeftComposite.setLayout(new GridLayout(2, false));
		
		/* Provide check box */
		mProvideWidget = new Button(mProvideLeftComposite, SWT.CHECK);
		mProvideWidget.setEnabled(false);
		
		label = new Label(mProvideLeftComposite, SWT.WRAP);
		label.setText("Provide");
		
		/* Event listener */
		mProvideWidget.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				emptyMonitorGroup();
			}
		});
		
		/* Provide right group */
		mProvideRightComposite = new Composite (mProvideGroup, SWT.NONE);
		mProvideRightComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		mProvideRightComposite.setLayout(new GridLayout(2, false));
		
		/* syncInterval */		
		label = new Label(mProvideRightComposite, SWT.WRAP);
		label.setText("syncInterval");
		
		mProvideSyncIntervalWidget = new Text(mProvideRightComposite, SWT.MULTI | SWT.BORDER);
		mProvideSyncIntervalWidget.setEnabled(false);
		mProvideSyncIntervalWidget.setLayoutData(subGridData);
		
		/* mode */		
		label = new Label(mProvideRightComposite, SWT.WRAP);
		label.setText("mode");
		
		mProvideModeWidget = new Combo(mProvideRightComposite, SWT.READ_ONLY);
		mProvideModeWidget.setItems(new String[] {Mode.ACTIVE.toString(), Mode.PASSIVE.toString()});
		mProvideModeWidget.setEnabled(false);		
		
		/* Edit Buttons */
		mEditFactLinkWidget = new Button(mFactLinkPropertyGroup, SWT.PUSH);
		GridData editButtonData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		editButtonData.horizontalSpan=2;
		mEditFactLinkWidget.setLayoutData(editButtonData);
		mEditFactLinkWidget.setVisible(false);
		
		/* Event Listener */
		mEditFactLinkWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (mEditFactLinkWidget.getText().equalsIgnoreCase(BUTTON_STATE_EDIT)) {
					mEditFactLinkWidget.setText(BUTTON_STATE_SAVE);
					setEnableContentWidget(true);
				}
				else if (mEditFactLinkWidget.getText().equalsIgnoreCase(BUTTON_STATE_SAVE)) {
					saveFactLink();					
					mEditFactLinkWidget.setText(BUTTON_STATE_EDIT);
					setEnableContentWidget(false);
				}
			}
		});
		
		setEnableContentWidget(false);

	}
	
	protected void saveFactLink() {
		Command cmd;
		EReference reference;
		EAttribute attribute;
		
		// Retrieve corresponding factLink
		if (mFactLinkIndex == -1) return;
		Role role = this.instance.getRole();
		ExternalFactLink factLink = role.getExternalFactLink().get(mFactLinkIndex);
		
		// onChange
		if (mOnChangeWidget.getText() != null && mOnChangeWidget.getText().length() > 0) {
			Boolean onChange = mOnChangeWidget.getText().equalsIgnoreCase(Boolean.TRUE.toString());
			attribute = SmcPackage.eINSTANCE.getExternalFactLink_OnChange();
			cmd = SetCommand.create(instance.getEditingDomain(), factLink, attribute, onChange);
			instance.getEditingDomain().getCommandStack().execute(cmd);			
		}
		
		// Monitor group
		if (mMonitorWidget.getSelection()) {
			AcquisitionRegime acquisitionRegime = SmcFactory.eINSTANCE.createAcquisitionRegime();
			if (mMonitorSyncIntervalWidget.getText() != null && mMonitorSyncIntervalWidget.getText().length() > 0)
				acquisitionRegime.setSyncInterval(Integer.parseInt(mMonitorSyncIntervalWidget.getText()));
			if (mMonitorModeWidget.getText() != null && mMonitorModeWidget.getText().length() > 0)
				acquisitionRegime.setMode(Mode.get(mMonitorModeWidget.getText()));
			
			/* Add AcquisitionRegime to ExternalFactLink */
			reference = SmcPackage.eINSTANCE.getExternalFactLink_AcquisitionRegime();
			cmd = SetCommand.create(instance.getEditingDomain(), factLink, reference, acquisitionRegime);
			instance.getEditingDomain().getCommandStack().execute(cmd);
			
			/* Remove ProvisionRegime from ExternalFactLink */
			reference = SmcPackage.eINSTANCE.getExternalFactLink_ProvisionRegime();
			cmd = SetCommand.create(instance.getEditingDomain(), factLink, reference, null);
			instance.getEditingDomain().getCommandStack().execute(cmd);
		}
		
		// Provide group
		if (mProvideWidget.getSelection()) {
			ProvisionRegime provisionRegime = SmcFactory.eINSTANCE.createProvisionRegime();
			if (mProvideSyncIntervalWidget.getText() != null && mProvideSyncIntervalWidget.getText().length() > 0)
				provisionRegime.setSyncInterval(Integer.parseInt(mProvideSyncIntervalWidget.getText()));
			if (mProvideModeWidget.getText() != null && mProvideModeWidget.getText().length() > 0)
				provisionRegime.setMode(Mode.get(mProvideModeWidget.getText()));
			
			/* Add ProvisionRegime to ExternalFactLink */
			reference = SmcPackage.eINSTANCE.getExternalFactLink_ProvisionRegime();
			cmd = SetCommand.create(instance.getEditingDomain(), factLink, reference, provisionRegime);
			instance.getEditingDomain().getCommandStack().execute(cmd);
			
			/* Remove AcquisitionRegime from ExternalFactLink */
			reference = SmcPackage.eINSTANCE.getExternalFactLink_AcquisitionRegime();
			cmd = SetCommand.create(instance.getEditingDomain(), factLink, reference, null);
			instance.getEditingDomain().getCommandStack().execute(cmd);
		}
	}

	/**
	 * Enable or disable content widgets
	 * @param enabled
	 */
	private void setEnableContentWidget(Boolean enabled) {
		// General properties
		mOnChangeWidget.setEnabled(enabled);
		
		// Monitor group
		mMonitorWidget.setEnabled(enabled);
		mMonitorSyncIntervalWidget.setEnabled(enabled);
		mMonitorModeWidget.setEnabled(enabled);
		
		// Provide group
		mProvideWidget.setEnabled(enabled);
		mProvideSyncIntervalWidget.setEnabled(enabled);
		mProvideModeWidget.setEnabled(enabled);
	}
	
}
