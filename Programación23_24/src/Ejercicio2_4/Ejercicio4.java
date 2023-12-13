package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decir si una palabra es palíndroma o no.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String frase = sc.nextLine();
		char a = 0;
		
		String palabra = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			a = frase.charAt(i);
			palabra = palabra + a;
			
		}
		if (palabra.equals(frase)) {
			System.out.println(frase + " es una palabra palíndroma");
		} else {
			System.out.println(frase + " no es una palabra palíndroma");
		}

		
		
		
	}

}
