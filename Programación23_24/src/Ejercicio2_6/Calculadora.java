package Ejercicio2_6;

import java.util.Scanner;

public class Calculadora {

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double div(double a, double b) {

		return a / b;	
	}

	public static void main(String[] args) {
		// Calculadora simple con métodos

		Scanner sc = new Scanner(System.in);

		System.out.print("Pon un número: ");
		double a = sc.nextDouble();

		System.out.print("Operación (+  -  *  /): ");
		String op = sc.next();

		do {
            System.out.print("Introduce una operación válida (+ - * /): ");
            op = sc.next();
        } while (!op.equals("+") || !op.equals("-") || !op.equals("*") || !op.equals("/"));
		

		double resultado;

		System.out.print("Pon otro número: ");
		double b = sc.nextDouble();

		switch (op) {

		case ("+"):

			resultado = suma(a, b);
			System.out.println("Resultado: " + resultado);

			break;

		case ("-"):

			resultado = resta(a, b);
			System.out.println("Resultado: " + resultado);

			break;

		case ("*"):

			resultado = mul(a, b);
			System.out.println("Resultado: " + resultado);

			break;

		case ("/"):

			resultado = div(a, b);
		if (b != 0) {
			
			System.out.println("Resultado: " + resultado);
		}else {
			System.out.println("Error, no se puede dividir entre cero");
		}
			

			break;

		}

	}

}
