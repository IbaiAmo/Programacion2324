package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir un una letra y comprobar si es S(si) o N(no), si el valor introducido es S o N,
		 * visualizar en pantalla “BIEN” sino, “ERROR”
		 */
		
		String a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce una letra: ");
		a = scan.next();
		if (a.equalsIgnoreCase("S") || a.equalsIgnoreCase("N")) {
			System.out.println("BIEN");
		} else {
			System.out.println("ERROR");
		}
		
		
	}

}
