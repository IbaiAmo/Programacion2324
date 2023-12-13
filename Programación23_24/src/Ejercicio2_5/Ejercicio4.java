package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Al 2º ejercicio añadir que los nombres salgan en la pantalla.

		Scanner sc = new Scanner(System.in);
		System.out.println("Completa la array de 5");
		String[] palabras = new String[5];

		for (int i = 0; i < palabras.length; i++) {
			System.out.print("introduce palabra [" + i + "] : ");
			String a = sc.nextLine();
			palabras[i] = a;
		}

		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " , ");

		}

	}

}
