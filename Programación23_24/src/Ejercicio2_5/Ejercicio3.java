package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número n y definir un array, de longitud n y rellenarlo con los
		// números creados aleatoriamente del 1 al 10.

		Scanner sc = new Scanner(System.in);
		System.out.print("Qué longitud quieres que tenga tu array? ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			int num = (int) Math.floor(Math.random() * 10 + 1);
			array[i] = num;
			System.out.println("array [" + i + "] = " + array[i]);
		}

	}

}
