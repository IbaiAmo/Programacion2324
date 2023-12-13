package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio12esp {

	public static void main(String[] args) {
		/*
		 * Programa Java que guarda en un array 10 números enteros que se leen por
		 * teclado. A continuación se recorre el array y calcula cuántos números son
		 * positivos, cuántos negativos y cuántos ceros.
		 */

		Scanner sc = new Scanner (System.in);
		
		int[] arrNum = new int[10];
		int pos = 0, neg = 0, ceros = 0;
		
		for (int i = 0; i < arrNum.length; i++) {
			
			System.out.print("Número " + (i+1) + " = ");
			int num = sc.nextInt();
			arrNum[i] = num;
			
			if (num < 0) {
				neg++;			
				
			} else if (num > 0) {
				pos++;
				
			} else {
				ceros++;
			}
			
		}
		
		System.out.println("Cantidad de números positivos: " + pos);
		System.out.println("Cantidad de números negativos: " + neg);
		System.out.println("Cantidad de números cero: " + ceros);
		
		
	}

}
