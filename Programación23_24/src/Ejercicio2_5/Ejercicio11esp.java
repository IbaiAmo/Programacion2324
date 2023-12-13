package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio11esp {

	public static void main(String[] args) {
		/*
		 * Programa que lee por teclado la nota de los alumnos de una clase y calcula la
		 * nota media del grupo. También muestra los alumnos con notas superiores a la
		 * media. El número de alumnos se lee por teclado.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Cuántos alumnos hay en clase? ");
		int num_Alumnos = sc.nextInt();

		float[] notas = new float[num_Alumnos];
		float media = 0;
		int nota, mayor = Integer.MIN_VALUE;

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota de alumno " + (i + 1) + " = ");
			nota = sc.nextInt();
			media += nota;
			notas[i] = nota;

		}

		System.out.println("Nota Media de la clase: " + (media / notas.length));
		System.out.println("Alumnos que han superado la media: ");

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > (media / notas.length)) {

				System.out.println("Alumno " + (i + 1) + " = " + notas[i]);

			}

		}

	}

}
