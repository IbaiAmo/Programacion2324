package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 10 números y visualizar en pantalla el mayor y el menor.
		
		Scanner scan = new Scanner(System.in);
		
		int a= 0;    											  
		double c = Double.POSITIVE_INFINITY;	//He usado esto que nos crea una variable que guarda un número infinito para el número menor			
		double b = Double.NEGATIVE_INFINITY;		//Y este para el número mayor								
												
		while (a<10) {
			
			a++;
			System.out.print("Escribe un número: ");
			int i = scan.nextInt();
			
			if (i>b) {
				b = i;
			}
			if (i<c) {
				c = i;
			}
		}
		
		System.out.println("El número mayor introducido es: " + b);
		System.out.println("El número menor introducido es: " + c);
		
	}

}
