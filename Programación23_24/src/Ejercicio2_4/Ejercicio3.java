package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir la palabra introducida invertida.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String frase = sc.nextLine();
		
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
		
		
		
	}
	

}
