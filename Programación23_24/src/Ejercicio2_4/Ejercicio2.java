package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir por teclado una frase y sacar por pantalla un carácter por cada línea.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		
		//String car= frase.replaceAll("\\s",""); esto es si lo quieres hacer sin espacios entre las palabras
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(i));
			
		}
		
		
		
	}

}
