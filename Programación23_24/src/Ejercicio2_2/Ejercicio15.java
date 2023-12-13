package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir tres números y visualizar en ordenados en orden ascendiente.
		
		int a , b , c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		System.out.print("Introduce un número: ");
		b = scan.nextInt();
		System.out.print("Introduce un número: ");
		c = scan.nextInt();
		if (a < b && b < c) {
			System.out.println(a + " , " + b + " , " + c);
		}
		if (a < b && b > c && a < c) {
			System.out.println(a + " , " + c + " , " + b);
		}
		if (b < a && a > c && b >c) {
			System.out.println(c + " , " + b + " , " + a);
		}
		if (b > a && b > c && a > c) {
			System.out.println(c + " , " + a + " , " + b);
		}
		if (c < a && b < c && a > b) {
			System.out.println(b + " , " + c + " , " + a);
		}
		if (c > a && b < c && a > b) {
			System.out.println(b + " , " + a + " , " + c);
		}
		
		
		
		
		
	}

}
