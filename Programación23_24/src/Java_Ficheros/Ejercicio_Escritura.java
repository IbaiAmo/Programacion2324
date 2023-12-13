package Java_Ficheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio_Escritura {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader (new FileReader("src/Java_Ficheros/prueba.txt"));
		
		String nuevo = "";
		String linea = br.readLine();
		
		
		while (linea != null) {
			nuevo = nuevo + linea.replace("a", "*") + "\n";
			linea = br.readLine();
		}
		
		BufferedWriter bw = new BufferedWriter (new FileWriter("src/Java_Ficheros/prueba.txt")); //con true se añade el texto que pongas al anterior. de normal está en false.
		bw.write(nuevo);
		bw.flush();	
		bw.close();
		
		
		
	}

}
