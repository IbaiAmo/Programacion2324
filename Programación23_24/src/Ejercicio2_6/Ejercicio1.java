package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio1 {

	public static double pesetas(double euros) {
		return euros * 166.386;
	}

	public static void main(String[] args) {
		/*
		 * Crear un método para que convierta, la cantidad introducida en Euros a
		 * pesetas.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cantidad de Euros: ");
		double euros = sc.nextDouble();
		
		double result = pesetas(euros);
		System.out.println(euros + "€ son " + result + " pesetas");
	}

}
