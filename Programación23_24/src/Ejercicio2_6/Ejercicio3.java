package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio3 {

	public static double procedimiento (double cantidad, String monedaIn, String monedaOut) {
		
		if (monedaIn.equalsIgnoreCase("e") && monedaOut.equalsIgnoreCase("d")) {
			return cantidad = cantidad * 1.09;
			
		}else if (monedaIn.equalsIgnoreCase("e") && monedaOut.equalsIgnoreCase("b")) {
			return cantidad = cantidad * 0.000030;
			
		}else if (monedaIn.equalsIgnoreCase("d") && monedaOut.equalsIgnoreCase("e")) {
			return cantidad = cantidad * 0.92;
			
		}else if (monedaIn.equalsIgnoreCase("d") && monedaOut.equalsIgnoreCase("b")) {
			return cantidad = cantidad * 0.000028;
			
		}else if (monedaIn.equalsIgnoreCase("b") && monedaOut.equalsIgnoreCase("e")) {
			return cantidad = cantidad * 33542.23;
			
		}else if (monedaIn.equalsIgnoreCase("b") && monedaOut.equalsIgnoreCase("d")) {
			return cantidad = cantidad * 36288.40;
			
		}
			
			return cantidad;
	}
	
	public static void main(String[] args) {
		/*
		 * Crear un método (procedimiento) que escriba en pantalla el cambio entre
		 * diferentes monedas. Recibirá 3 parámetros:
		 * 
		 * double cantidad
		 * 
		 * char monedaIn: posibles valores: E, D, B -> euro, dolar, bitcoin
		 * 
		 * char modedaOut: posibles valores: E, D, B -> euro, dolar, bitcoin
		 * 
		 * Deberá realizar el cambio de monedaIn a monedaOut y escribir en pantalla.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cambio de Monedas");
		System.out.println("-------------------");
		System.out.print("Qué moneda quieres usar? (E, D, B): ");
		String monedaIn = sc.next();
		
		System.out.print("Cantidad: ");
		double cantidad = sc.nextDouble();
		
		System.out.print("A qué moneda quieres cambiar? (E, D, B): ");
		String monedaOut = sc.next();
		
		System.out.println("Resultado: " + procedimiento(cantidad, monedaIn, monedaOut));
		           

	}
}


