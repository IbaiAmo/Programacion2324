package Java_Ficheros;

import java.io.*;
import java.util.Scanner;

public class LecturaDeFicheros {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);

			File f = new File("src/Java_Ficheros/prueba.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader (fr);
			
			
			if (f.exists()) {
			System.out.println("Nombre del fichero: "+ f.getName());
			System.out.println("Ruta relativa "+ f.getPath());
			System.out.println("Ruta absoluta: "+ f.getAbsolutePath());
			System.out.println("Se puede leer: "+f.canRead());
			System.out.println("Se puede escribir: "+f.canWrite());
			System.out.println("Tamaño: "+f.length() + " kb");
			}
		
			String linea = "";
			
		while (linea !=null) {
			linea = br.readLine();
			System.out.println(linea);
		}

			
		
	}

}
