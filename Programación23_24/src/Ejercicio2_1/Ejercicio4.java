package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario dos números y visualizar la suma de ellos en pantalla.
		
		int a;
		int b;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Escribe un número: ");
		a = scan.nextInt();
		System.out.print("Escribe otro número: ");
		b = scan.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b));
		
	}

}
