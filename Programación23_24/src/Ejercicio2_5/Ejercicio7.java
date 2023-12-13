package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer el número n y definir la raya de esa longitud. Rellena con números
		// aleatorios del 1 al 10 y luego calcula el más alto.

		Scanner sc = new Scanner(System.in);

		System.out.print("Qué longitud quieres que tenga tu array? ");
		int n = sc.nextInt();

		int[] array = new int[n];
		int mayor = 0, posicion_mayor = -1;
		System.out.println("--------------------");

		for (int i = 0; i < array.length; i++) {

			int num = (int) Math.floor(Math.random() * 10 + 1);
			array[i] = num;
			System.out.println("array [" + i + "] = " + array[i]);

			if (array[i] > mayor) {
				mayor = array[i];
				posicion_mayor = i;
			}

		}

		System.out.println("--------------------");
		System.out.println("El valor más alto se encuentra en la variable nombres[" + posicion_mayor + "] = " + mayor);

	}

}
