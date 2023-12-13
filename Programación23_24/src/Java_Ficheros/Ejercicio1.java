package Java_Ficheros;

import java.io.*;

public class Ejercicio1 {
	

	public static void main(String[] args) throws IOException {
		// Crear un programa que lea las líneas de un fichero.  El programa debe ser capaz de leer cualquier fichero de texto (.txt).

		File f = new File("C:\\Users\\1AW3-2\\Desktop\\ENDE.txt"); //El fichero puede ser cualquiera.
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader (fr);
		
		String linea = "";
		
		while ((linea = br.readLine()) !=null) {	//Así es para que no aparezca null al final.
			System.out.println(linea);
		}
	
		
		
	}

}
