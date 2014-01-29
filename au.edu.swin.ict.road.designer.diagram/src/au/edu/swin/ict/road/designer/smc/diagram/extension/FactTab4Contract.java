package au.edu.swin.ict.road.designer.smc.diagram.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import au.edu.swin.ict.road.designer.smc.Contract;
import au.edu.swin.ict.road.designer.smc.Fact;
import au.edu.swin.ict.road.designer.smc.FactLink;

public class FactTab4Contract extends Tab4Contract {

	Group mReadGroup, mWriteGroup;	
	Table mReadTableWidget, mWriteTableWidget;
	Text mNameWidget, mSourceWidget, mIdentifierWidget, mAttributeWidget;
	
	List<FactLink> readFactLinkList, writeFactLinkList;
	
	FactTab4Contract(ContractEditorEditPolicy instance) {
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
		
		// Read group
		mReadGroup = new Group(itemGroup, SWT.NONE);
		GridData readData = new GridData(SWT.FILL, SWT.FILL, true, true);
		readData.horizontalSpan = 2;
		mReadGroup.setLayoutData(readData);
		mReadGroup.setLayout(new GridLayout());
		mReadGroup.setText("Monitor Facts");
		
		// Read table
		mReadTableWidget = new Table(mReadGroup, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		TableColumn column = new TableColumn(mReadTableWidget, SWT.NONE);
		column.setText("Name");
		column.setWidth(500);
		populateReadTableData();
		
		// Event listener
		mReadTableWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = mReadTableWidget.getSelectionIndex();
				
				if (index == -1) return;
				displayFact(readFactLinkList.get(index).getFact());
			}
		});
		
		// Write group
		mWriteGroup = new Group(itemGroup, SWT.NONE);
		readData = new GridData(SWT.FILL, SWT.FILL, true, true);
		readData.horizontalSpan = 2;
		mWriteGroup.setLayoutData(readData);
		mWriteGroup.setLayout(new GridLayout());
		mWriteGroup.setText("Provide Facts");
		
		// Read table
		mWriteTableWidget = new Table(mWriteGroup, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		column = new TableColumn(mWriteTableWidget, SWT.NONE);
		column.setText("Name");
		column.setWidth(500);
		populateWriteTableData();
		
		// Event listener
		mWriteTableWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = mWriteTableWidget.getSelectionIndex();
				
				if (index == -1) return;
				displayFact(writeFactLinkList.get(index).getFact());
			}
		});
	}
	
	private void populateReadTableData() {
		Contract contract = this.instance.getContract();
		List<FactLink> factLinkList = contract.getFactLink();
		readFactLinkList = new ArrayList<FactLink>();
		
		// get list of monitor facts
		for (int i=0; i<factLinkList.size(); i++) {
			if (factLinkList.get(i).isMonitorFact())
				readFactLinkList.add(factLinkList.get(i));
		}
		
		// populate table items
		TableItem item;
		Fact fact;
		for (int i=0; i<readFactLinkList.size(); i++) {
			item = new TableItem(mReadTableWidget, SWT.NONE);
			fact = readFactLinkList.get(i).getFact();
			item.setText(fact.getName());
		}
	}
	
	private void populateWriteTableData() {
		Contract contract = this.instance.getContract();
		List<FactLink> factLinkList = contract.getFactLink();
		writeFactLinkList = new ArrayList<FactLink>();
		
		// get list of monitor facts
		for (int i=0; i<factLinkList.size(); i++) {
			if (!factLinkList.get(i).isMonitorFact())
				writeFactLinkList.add(factLinkList.get(i));
		}
		
		// populate table items
		TableItem item;
		Fact fact;
		for (int i=0; i<writeFactLinkList.size(); i++) {
			item = new TableItem(mWriteTableWidget, SWT.NONE);
			fact = writeFactLinkList.get(i).getFact();
			item.setText(fact.getName());
		}
	}
	
	private void displayFact(Fact fact) {
		mNameWidget.setText(fact.getName());
		mSourceWidget.setText(fact.getSource());
		mIdentifierWidget.setText(fact.getIdentifier());
		
		EList<String> attributes = fact.getAttribute();
		System.out.println("Size = " + attributes.size());
		StringBuffer buf = new StringBuffer();
		for (int i=0; i<attributes.size(); i++) {
			System.out.println(attributes.get(i));
			buf.append(attributes.get(i) + ",");
		}
		buf.deleteCharAt(buf.length()-1);
		mAttributeWidget.setText(buf.toString());
	}
	
	@Override
	void createContentWidgets() {
		super.createContentWidgets();
		
		GridData gridData = new GridData(200,20);

		/* Name */
		Label label = new Label(contentGroup, SWT.WRAP);
		label.setText("Name");
		
		mNameWidget = new Text(contentGroup, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		mNameWidget.setEnabled(false);
		mNameWidget.setLayoutData(gridData);
		
		/* Source */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Source");
		
		mSourceWidget = new Text(contentGroup, SWT.MULTI | SWT.BORDER);
		mSourceWidget.setEnabled(false);
		mSourceWidget.setLayoutData(gridData);

		/* Identifier */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Identifier");
		
		mIdentifierWidget = new Text(contentGroup, SWT.MULTI | SWT.BORDER);
		mIdentifierWidget.setEnabled(false);
		mIdentifierWidget.setLayoutData(gridData);

		/* Attribute */
		label = new Label(contentGroup, SWT.WRAP);
		label.setText("Attribute");
		
		mAttributeWidget = new Text(contentGroup, SWT.MULTI | SWT.BORDER);
		mAttributeWidget.setEnabled(false);
		mAttributeWidget.setLayoutData(gridData);
	}
}
