package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número y decir si esta entre 0 y 10 inclusive.
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		if (a>=0 && a<=10) {
			System.out.println(a + " está entre el 0 y el 10");
		} else {
			System.out.println(a + " no está entre el 0 y el 10");
		}
		
	}

}
