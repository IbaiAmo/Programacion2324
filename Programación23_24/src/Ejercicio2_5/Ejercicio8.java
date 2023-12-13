package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		/*
		 * Rellena la array de 10 con los números introducidos del teclado. Luego sacar
		 * el siguiente menú, desarrollando las opciones correspondientes:
		 * 
		 * 1.Calcular y visualizar la suma.
		 * 
		 * 2.Visualizar el número más alto.
		 * 
		 * 3.Visualizar el número más pequeño.
		 * 
		 * 4.Pedir un número y visualizar el número de veces que aparece en el remo.
		 */

		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		System.out.println("Rellena la array");

		for (int i = 0; i < 10; i++) {
			System.out.print("array [" + i + "] = ");
			int num = sc.nextInt();
			array[i] = num;
		}
		System.out.println("---------------------");
		System.out.println("Menu");
		System.out.println("1.Calcular y visualizar la suma.");
		System.out.println("2.Visualizar el número más alto.");
		System.out.println("3.Visualizar el número más pequeño.");
		System.out.println("4.Pedir un número y visualizar el número\n de veces que aparece en el array.");
		System.out.println("---------------------");
		System.out.print("Elige una opción (1,2,3 o 4): ");
		int opcion = sc.nextInt();

		switch (opcion) {

		case 1:
			System.out.println("---------------------");
			System.out.println("Calcular y visualizar la suma");
			int sum = 0;
			for (int i = 0; i < array.length; i++) {

				sum += array[i];
			}

			System.out.println("Suma de los valores de la array: " + sum);

			break;

		case 2:
			System.out.println("---------------------");
			System.out.println("Visualizar el número más alto");
			int mayor = Integer.MIN_VALUE, posicion_mayor = -1;

			for (int i = 0; i < array.length; i++) {

				if (array[i] > mayor) {
					mayor = array[i];
					posicion_mayor = i;
				}

			}

			System.out.println("El valor más alto se encuentra en la variable nombres[" + posicion_mayor + "] = " + mayor);

			break;

		case 3:
			System.out.println("---------------------");
			System.out.println("Visualizar el número más pequeño");
			int menor = Integer.MAX_VALUE, posicion_menor = -1;

			for (int i = 0; i < array.length; i++) {

				if (array[i] < menor) {
					menor = array[i];
					posicion_menor = i;
				}

			}

			System.out.println("El valor más pequeño se encuentra en la variable nombres[" + posicion_menor + "] = " + menor);

			break;

		case 4:
			System.out.println("---------------------");
			System.out.println("Pedir un número y visualizar el número de veces que aparece en el array.");
			System.out.print("Escribe un número: ");
			int numero = sc.nextInt();

			System.out.println("El " + numero + " está en las siguientes variables:");
			boolean no_esta = true;

			for (int i = 0; i < array.length; i++) {

				if (array[i] == numero) {
					no_esta = false;
					System.out.println("array [" + i + "] = " + array[i]);
				} 

			}

			if (no_esta) {
				System.out.println("El " + numero + " no está en el array");
			}
			
		

		}

	}

}
