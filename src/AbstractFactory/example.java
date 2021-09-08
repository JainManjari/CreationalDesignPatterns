package AbstractFactory;

import java.io.*;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class example {
	
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException
	{
		
		String xml="<documents><body><stock>API</stock></body></documents>";
		
		ByteArrayInputStream bias=new ByteArrayInputStream(xml.getBytes());
		
		System.out.println(bias);
		
		DocumentBuilderFactory abstractFactory=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder factory=abstractFactory.newDocumentBuilder();
		
		Document doc=factory.parse(bias);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
		
		
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());
	}

}
