package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir el array de 5 longitudes y rellenarlo de nombres. Pedir un nombre al
		// usuario e indicarle si está en la array o no.

		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[5];
		nombres[0] = "ibai";
		nombres[1] = "Anton";
		nombres[2] = "Ismael";
		nombres[3] = "Aimar";
		nombres[4] = "Maria";

		boolean encontrado = false;

		System.out.print("Escribe un nombre y te digo si está en la array: ");
		String n = sc.nextLine();

		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].equalsIgnoreCase(n)) {

				encontrado = true;

			}

		}

		if (encontrado) {
			System.out.print(n + " sí está en la array");

		} else {
			System.out.print(n + " no está en la array");
		}
		
		
		
		
	}

}
