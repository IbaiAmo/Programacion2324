package ejercicios;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ejercicio1 {

	private static DocumentBuilderFactory documentBuilderFactory;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		documentBuilderFactory.setNamespaceAware(false);
		documentBuilderFactory.setValidating(false);
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		File archivo = new File("C:\\Users\\1AW3-2\\git\\Programacion2324\\Programación23_24\\ManipulacionXML\\xml\\libros.xml");
		Document documento = documentBuilder.parse(archivo);
		documento.getDocumentElement().normalize();
		}catch (Exception e) {
			
		}
	}

}
