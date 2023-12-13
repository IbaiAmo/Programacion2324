package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer dos números y decir cuál es el mayor. ¿Qué pasa si los números introducidos son del mismo valor?
		int a;
		int b;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Escribe un número: ");
		a = scan.nextInt();
		System.out.print("Escribe otro número: ");
		b = scan.nextInt();
		if (a<b) {
			System.out.println("El número mayor es: " + b);
		} if (a>b) {
			System.out.println("El número mayor es: "  + a);
		} if (a==b) {
			System.out.println("Los dos números son iguales: " + a);
		}
		
		
		
	}

}
