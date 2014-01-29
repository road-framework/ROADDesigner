package au.edu.swin.ict.road.designer.smc.diagram.providers;

import au.edu.swin.ict.road.designer.smc.FactLink;
import au.edu.swin.ict.road.designer.smc.SmcPackage;
import au.edu.swin.ict.road.designer.smc.diagram.expressions.SmcOCLFactory;
import au.edu.swin.ict.road.designer.smc.diagram.part.SmcDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	/**
	 * @generated
	 */
	public static void init_FactLink_4003(FactLink instance) {
		try {
			Object value_0 = SmcOCLFactory.getExpression("true",
					SmcPackage.eINSTANCE.getFactLink()).evaluate(instance);
			instance.setMonitorFact(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_FactLink_4006(FactLink instance) {
		try {
			Object value_0 = SmcOCLFactory.getExpression("not true",
					SmcPackage.eINSTANCE.getFactLink()).evaluate(instance);
			instance.setMonitorFact(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			SmcDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
