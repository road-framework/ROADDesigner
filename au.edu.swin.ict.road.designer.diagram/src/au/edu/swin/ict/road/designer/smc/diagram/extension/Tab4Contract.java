package au.edu.swin.ict.road.designer.smc.diagram.extension;

public abstract class Tab4Contract extends Tab {

	ContractEditorEditPolicy instance;

	/**
	 * Creates the Tab within a given instance of ControlExample.
	 */
	Tab4Contract(ContractEditorEditPolicy instance) {
		this.instance = instance;
	}
	
}
