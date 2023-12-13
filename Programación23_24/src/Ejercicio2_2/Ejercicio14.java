package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir tres números y decir si ha introducido en orden ascendiente o no.
		int a , b , c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		System.out.print("Introduce un número: ");
		b = scan.nextInt();
		System.out.print("Introduce un número: ");
		c = scan.nextInt();
		if (a < b && b < c) {
			System.out.println("Los números están en orden ascendiente: " + a + " , " + b + " , " + c);
		} else {
			System.out.println("Los números no están en orden ascendiente: "  + a + " , "  + b + " , "  + c);
		}
		
		
	}

}
