package au.edu.swin.ict.road.designer.smc.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import au.edu.swin.ict.road.designer.smc.diagram.part.SmcVisualIDRegistry;

/**
 * @generated
 */
public class SmcNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SmcNavigatorItem) {
			SmcNavigatorItem item = (SmcNavigatorItem) element;
			return SmcVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
