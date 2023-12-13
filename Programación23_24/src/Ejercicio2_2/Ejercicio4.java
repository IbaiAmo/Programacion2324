package Ejercicio2_2;

import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número y decir si es par o impar.

		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		if (a %2 == 0) {
			System.out.println(a + " es par");
		} else {
			System.out.println(a + " es impar");
		}
		
		
	}

}
