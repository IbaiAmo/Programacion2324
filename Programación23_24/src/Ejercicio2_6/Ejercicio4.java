package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static double calcularAreaCirculo (int diametro, double radio, double area) {
		
		radio = (double) diametro/2;
		return area = Math.PI * (radio*radio);
	}
	

	public static void main(String[] args) {
		/*
		 * Crear un método llamado calcularAreaCirculo
		 * 
		 * Parámetros recibidos: int diámetro
		 * 
		 * Return: double area
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular área del círculo");
		System.out.println("--------------------");
		
		System.out.print("Introduce Diámetro: ");
		int diametro = sc.nextInt();
		double area = 0, radio = 0;
		
		
		System.out.println("Área del círculo: " + calcularAreaCirculo (diametro, radio, area) + " m2");

	}

}
