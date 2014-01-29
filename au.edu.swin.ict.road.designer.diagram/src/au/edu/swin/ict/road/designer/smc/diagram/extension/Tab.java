package au.edu.swin.ict.road.designer.smc.diagram.extension;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;

public abstract class Tab {
	Shell shell;
	Display display;
	
	/* Common groups and composites */
	Composite tabFolderPage;
	Group itemGroup, contentGroup;

//	ContractEditorEditPolicy instance;
	
	/**
	 * Creates the Tab within a given instance of ControlExample.
	 */
//	Tab(ContractEditorEditPolicy instance) {
//		this.instance = instance;
//	}

	/**
	 * Gets the text for the tab folder item.
	 *
	 * @return the text for the tab item
	 */
	String getTabText () {
		return "";
	}
	
	/**
	 * Creates the tab folder page.
	 *
	 * @param tabFolder org.eclipse.swt.widgets.TabFolder
	 * @return the new page for the tab folder
	 */
	Composite createTabFolderPage (TabFolder tabFolder) {
		/* Cache the shell and display. */
		shell = tabFolder.getShell ();
		display = shell.getDisplay ();
		
		/* Create a two column page. */
		tabFolderPage = new Composite (tabFolder, SWT.NONE);
		tabFolderPage.setLayout (new GridLayout (2, false));

		/* Create item and content groups */
		createItemGroup();
		createContentGroup();
		
		/* Create and initialize item and content widgets */
		createItemWidgets();
		createContentWidgets();
		
		return tabFolderPage;
	}
	
	void createItemGroup() {	
		itemGroup = new Group (tabFolderPage, SWT.NONE);
		itemGroup.setLayout (new GridLayout (2, false));
		itemGroup.setLayoutData (new GridData (SWT.FILL, SWT.FILL, true, true));
	}
	
	void createContentGroup() {
		contentGroup = new Group (tabFolderPage, SWT.NONE);
		contentGroup.setLayout (new GridLayout (2, false));
		contentGroup.setLayoutData (new GridData(SWT.FILL, SWT.FILL, false, false));
		contentGroup.setText ("Content");
	}
	
	void createItemWidgets() {
		// Do nothing
	}
	
	void createContentWidgets() {
		// Do nothing
	}
}
