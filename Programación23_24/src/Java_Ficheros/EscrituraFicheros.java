package Java_Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraFicheros {

	public static void main(String[] args) throws IOException {
		// En este programa lo que escribas se va a añadir al archivo .txt 

		BufferedWriter bw = new BufferedWriter (new FileWriter("src/Java_Ficheros/prueba.txt",true)); //con true se añade el texto que pongas al anterior. de normal está en false.
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escribe lo que quieras añadir al texto: ");
		
		String tx = sc.nextLine();
		bw.write(tx);
		bw.flush();	
		bw.close();
		
		
		
		
	}

}
