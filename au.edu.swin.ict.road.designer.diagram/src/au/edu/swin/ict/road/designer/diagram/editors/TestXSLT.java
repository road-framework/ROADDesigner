package au.edu.swin.ict.road.designer.diagram.editors;

import java.io.FileNotFoundException;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

public class TestXSLT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 1. Instantiate a TransformerFactory.
			javax.xml.transform.TransformerFactory tFactory = javax.xml.transform.TransformerFactory
					.newInstance();

			// 2. Use the TransformerFactory to process the stylesheet Source
			// and
			// generate a Transformer.
			javax.xml.transform.Transformer transformer;
			transformer = tFactory
					.newTransformer(new javax.xml.transform.stream.StreamSource(
							"files/transform.xsl"));

			// 3. Use the Transformer to transform an XML Source and send the
			// output to a Result object.
			transformer.transform(new javax.xml.transform.stream.StreamSource(
					"files/ROAD4RaaS.road"), new javax.xml.transform.stream.StreamResult(
					new java.io.FileOutputStream("files/ROAD4RaaS.xml")));
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
