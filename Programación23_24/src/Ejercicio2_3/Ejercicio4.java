package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que imprima los números pares que hay entre 
		 * los 20 primeros números enteros empezando por el cero. (Utilizando for y while)
		 */
		
		int i = 0;
		while (i <= 20) {
			i = i + 1;
			if (i % 2 == 0) {
				System.out.print(i + " ");
				
			}
		}
		
		
	}

}
