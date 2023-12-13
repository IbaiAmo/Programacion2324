package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número y decir si es negativo, positivo o cero.
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		if (a<0) {
			System.out.println(a + " es un número negativo");
		} if (a==0){
			System.out.println("Tu número es 0");
		} if (a>0) {
			System.out.println(a + " es positivo");
		}
		
		
		
	}

}
