package au.edu.swin.ict.road.designer.smc.diagram.extension;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;

abstract class SingleColumnTab extends Tab4Contract {

	public SingleColumnTab(ContractEditorEditPolicy instance) {
		super(instance);
	}
	
	@Override
	Composite createTabFolderPage(TabFolder tabFolder) {
		/* Cache the shell and display. */
		shell = tabFolder.getShell ();
		display = shell.getDisplay ();
		
		/* Create a two column page. */
		tabFolderPage = new Composite (tabFolder, SWT.NONE);
		tabFolderPage.setLayout (new GridLayout ());

		/* Create item group */
		createItemGroup();

		/* Create and initialize item widgets */
		createItemWidgets();

		return tabFolderPage;
	}
}
