package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		//Escribir un algoritmo para que nos diga si un número introducido es primo o no.
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int a = sc.nextInt();
		boolean primo=true;
		
		for (int i =a-1; i>1; i--) {     
			
			if (a % i == 0) {
				primo=false;				
			}
			
		}
		
		if (primo==true) {
			System.out.println("El introducido es primo");
			}
		else {System.out.println("El introducido NO es primo");
		}
		
		
		
	}

}
