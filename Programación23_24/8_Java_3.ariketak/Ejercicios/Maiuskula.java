package Ejercicios;

import java.util.Scanner;

public class Maiuskula {

	public static void main(String[] args) {
		/*
		 * Programak erabiltzaileari bere izena eskatuko dio. Gero, pantailatik
		 * maiuskulaz erakutsiko du.
		 */
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Cómo te llamas? ");
		String nombre = sc.nextLine();
		
		
		System.out.println("Tu nombre en mayúsculas es " + nombre.toUpperCase());
		
		

	}

}
