package polarextract;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Profiles {
	public static int NAME = 0;
	public static int PDD_DIRECTORY_PATH = 1;

	private File file = null;
	private Document document = null;
	public Profiles() {
		file = new File("resources/profiles.xml");
		if (file.exists()) {
			document = getDocument();
		} else {
			document = createEmptyProfileXML();
		}
	}

	private Document createEmptyProfileXML() {
		// Create XML DOM document (Memory consuming).
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;

		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e2) {
			e2.printStackTrace();
			System.exit(-1);
		}

		DOMImplementation impl = builder.getDOMImplementation();
		return impl.createDocument(null, "profiles", null);
	}

	public String[] getProfile(String name) {
		Node node = getProfileNode(name);
		HashMap values = new HashMap();
		
		if (node == null) return null;
		node = node.getFirstChild();
		String nodeName;

		while (node != null) {
			nodeName = node.getNodeName();
			if (nodeName.equals("name")) {
				values.put("name", node.getFirstChild().getNodeValue());
			} else if (nodeName.equals("pdd_directory_path")){
				values.put("pdd_directory_path", node.getFirstChild().getNodeValue());
			}
			node = node.getNextSibling();
		}
		
		Iterator iter = values.entrySet().iterator();
		String key, value;
		String[] profile = new String[values.size()];
			
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			key   = (String) entry.getKey();
			value = (String) entry.getValue();
			
			profile[NAME] = (String)values.get("name");
			profile[PDD_DIRECTORY_PATH] = (String)values.get("pdd_directory_path");
		}
		
		return profile;
	}

	public String[] listProfileNames() {
		NodeList nodeList = document.getElementsByTagName("name");
		String[] profileNames = new String[nodeList.getLength()];
		for (int i=0;i<nodeList.getLength();i++) {
			profileNames[i] = nodeList.item(i).getFirstChild().getNodeValue();
		}
		
		return profileNames;
	}

	public void addProfile(String name, String path) {
		Node node = getProfileNode(name);
		
		if (node == null) {
			Element e = null;
			Node n = null;
	
			Element root = document.getDocumentElement();
	
			Element profileElement = document.createElementNS(null, "profile");
			root.appendChild(profileElement);
	
			e = document.createElementNS(null, "name");
			n = document.createTextNode(name);
			e.appendChild(n);
			profileElement.appendChild(e);
	
			e = document.createElementNS(null, "pdd_directory_path");
			n = document.createTextNode(path);
			e.appendChild(n);
			profileElement.appendChild(e);
		} else {
			node = node.getFirstChild();
			String nodeName;

			while (node != null) {
				nodeName = node.getNodeName();
				if (nodeName.equals("name")) {
					node.getFirstChild().setNodeValue(name);
				} else if (nodeName.equals("pdd_directory_path")){
					node.getFirstChild().setNodeValue(path);
				}
				node = node.getNextSibling();
			}
		}

		write();
	}

	private Node getProfileNode(String name) {
		NodeList nodeList = document.getElementsByTagName("name");
		String value;
		for (int i=0;i<nodeList.getLength();i++) {
			value = nodeList.item(i).getFirstChild().getNodeValue();
			if (value.equals(name)) return nodeList.item(i).getParentNode(); 
		}
		
		return null;
	}

	private Document getDocument() {
		DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
		Document document = null;
		try {
			document = dfactory.newDocumentBuilder().parse(file);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		return document;
	}

	private void write() {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
		
		// Serialisation through Tranform.
		DOMSource domSource = new DOMSource(document);
		StreamResult streamResult = new StreamResult(file);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer serializer = null;

		try {
			serializer = tf.newTransformer();
		} catch (TransformerConfigurationException e1) {
			e1.printStackTrace();
			System.exit(-1);
		}

		serializer.setOutputProperty(OutputKeys.ENCODING,"ISO-8859-1");
//		serializer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,"profiles.dtd");
		serializer.setOutputProperty(OutputKeys.INDENT,"yes");

		try {
			serializer.transform(domSource, streamResult);
		} catch (TransformerException e1) {
			e1.printStackTrace();
			System.exit(-1);
		} 
	}
}
