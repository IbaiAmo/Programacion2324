package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio5 {
	
public static double calcularAreaTriangulo (double base, double altura, double area) {
		
		return area = (base * altura) / 2;
	}
	
	

	public static void main(String[] args) {
		/*
		 * Crear una función calcularAreaTriangulo que reciba la base y la altura y
		 * escriba en pantalla su área.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular área del triángulo");
		System.out.println("--------------------");
		
		System.out.print("Introduce la base: ");
		double base = sc.nextInt();
		
		System.out.print("Introduce la altura: ");
		double altura = sc.nextInt();
		double area = 0;
		
		System.out.println("Área del triángulo: " + calcularAreaTriangulo (base,  altura, area) + " m2");
		

	}

}
