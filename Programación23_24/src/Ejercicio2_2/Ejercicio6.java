package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer tres números y visualizar en pantalla la suma y la media.
		
		float a , b , c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextFloat();
		System.out.print("Introduce otro número: ");
		b = scan.nextFloat();
		System.out.print("Introduce otro número: ");
		c = scan.nextFloat();
		System.out.println("La suma de los números es: " + (a+b+c));
		System.out.println("La media de los números es: " + ((a+b+c)/3));
	}

}
