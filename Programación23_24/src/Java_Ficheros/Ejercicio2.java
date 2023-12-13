package Java_Ficheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// Crear un programa que escriba líneas en un fichero y que deje de escribir
		// cuando cuando se introduzca dos líneas vacías.

		 // con true se añade el
																								
		Scanner sc = new Scanner(System.in);
		String tx = "";

		System.out.print("Escribe lo que quieras añadir al texto: ");
		int cont=0;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/Java_Ficheros/ibai.txt"));
		while (cont<2) {
			tx = sc.nextLine();
			
			if(tx.equals("")) {
				cont++;
				
			}
			bw.write(tx + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
