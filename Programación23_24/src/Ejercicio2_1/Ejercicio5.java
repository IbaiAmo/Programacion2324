package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario tres números y visualizar la multiplicación de ellos en pantalla.
		
		Scanner scan = new Scanner (System.in);
		int a , b , c;
		System.out.print("Escribe un número: ");
		a = scan.nextInt();
		System.out.print("Escribe otro número: ");
		b = scan.nextInt();
		System.out.print("Escribe otro número: ");
		c = scan.nextInt();
		System.out.println(a + " x " + b + " x " + c + " = " + (a*b*c));
		
	}

}
