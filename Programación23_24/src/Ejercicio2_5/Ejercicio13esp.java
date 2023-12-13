package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio13esp {

	public static void main(String[] args) {
		/*
		 * Programa Java que llene un array con 10 números enteros que se leen por
		 * teclado. A continuación calcula y muestra la media de los valores positivos y
		 * la de los valores negativos del array.
		 */

		Scanner sc = new Scanner(System.in);

		int[] arrNum = new int[10];
		int pos = 0, neg = 0, med_pos = 0, med_neg = 0;

		for (int i = 0; i < arrNum.length; i++) {

			System.out.print("arrNum [" + i + "] = ");
			int num = sc.nextInt();
			arrNum[i] = num;

			if (num >= 0) {
				pos++;
				med_pos += num;

			} else {
				neg++;
				med_neg += num;

			}

		}

		System.out.println("Media de los Números positivos: " + ((double) med_pos / pos));
		System.out.println("Media de los Números negativos: " + ((double) med_neg / neg));

	}

}
