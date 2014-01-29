package au.edu.swin.ict.road.designer.smc.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import au.edu.swin.ict.road.designer.smc.diagram.edit.policies.FactLinkItemSemanticEditPolicy;

/**
 * @generated
 */
public class FactLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public FactLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FactLinkItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new FactLinkSubscriberFigure();
	}

	/**
	 * @generated
	 */
	public FactLinkSubscriberFigure getPrimaryShape() {
		return (FactLinkSubscriberFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class FactLinkSubscriberFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public FactLinkSubscriberFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASH);

			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(1);
			return df;
		}

	}

}
