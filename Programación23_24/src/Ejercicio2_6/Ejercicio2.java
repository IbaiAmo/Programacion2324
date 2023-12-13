package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static double result (double cantidadDeCambio , String monedaDeCambio) {
		
		if (monedaDeCambio.equalsIgnoreCase("d")) {
			
			return cantidadDeCambio = cantidadDeCambio * 1.09;
			
		} else if (monedaDeCambio.equalsIgnoreCase("e")) {
			
			return cantidadDeCambio = cantidadDeCambio * 0.92;
			
			
		}
		return cantidadDeCambio;
		
	}
	
	public static String simbolo (String simb, String monedaDeCambio) {
		
	
		if (monedaDeCambio.equalsIgnoreCase("d")) {
			return simb = "$";
			
		} else if (monedaDeCambio.equalsIgnoreCase("e")) {
			return simb = "€";
		}
		return simb;
	}

	public static void main(String[] args) {

		/*
		 * Crear un método (función) que reciba un double “cantidadDeDinero” y un char
		 * “monedaDeCambio”
		 * 
		 * Si recibe una D quiere decir que la cantidadEsta en Euros y tiene que
		 * devolver en Dólares. Tiene que funcionar con “monedaDeCambio” mayúsculas y
		 * minúsculas.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		String simb = "";
		
		System.out.print("Introduce una letra (D o E): ");
		String monedaDeCambio = sc.next();
		
		System.out.print("Escribe la cantidad de dinero: ");
		double cantidadDeCambio = sc.nextDouble();
		
		System.out.println(result(cantidadDeCambio, monedaDeCambio) + simbolo (simb, monedaDeCambio));
	}

}
