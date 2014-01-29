package au.edu.swin.ict.road.designer.smc.diagram.extension;

import au.edu.swin.ict.road.designer.smc.Operation;
import au.edu.swin.ict.road.designer.smc.Parameter;

public class Utils {


	/**
	 * Convert an operation to a string representation
	 * @param operation
	 * @return
	 */
	public static String convertOperation(Operation operation) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(operation.getReturn() + " " + operation.getName() + " (\n");
		java.util.List<Parameter> parameters = operation.getParameter();
		for (int i=0; i < parameters.size(); i++) {
			buffer.append("\t" + parameters.get(i).getType() + " " + parameters.get(i).getName());
			if (i != parameters.size()-1) buffer.append(",\n");
			else buffer.append("\n)");
		}
		
		return buffer.toString();
	}
}
