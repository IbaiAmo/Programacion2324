package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Introducir una frase por teclado ej.: “Bienvenido a Zornotza”, luego introducir la palabra que se 
		 * quiere sustituir (ej.: Zornotza) y luego la palabra con el que se va a sustituir (ej.: Amorebieta). Mostrar en 
		 * pantalla la frase con la palabra sustituida.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		
		System.out.print("Qué palabra quieres cambiar? ");
		String cambio = sc.nextLine();
		System.out.print("Qué palabra quieres poner? ");
		String p = sc.nextLine();
		
		String fCambiada=frase.replaceAll(cambio, p);
		System.out.println(fCambiada);
		
		
	}

}
