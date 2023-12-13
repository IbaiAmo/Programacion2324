package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio15esp {

	public static void main(String[] args) {
		/*
		 * Definir un array de 10, pedir al usuario diez números e ir rellenando
		 * introduciendo los números en la posición que corresponda para que el array
		 * quede ordenado ascendentemente.
		 */

		 Scanner sc = new Scanner(System.in);
	        int[] array = new int[10];

	        System.out.println("Introduce 10 números:");

	        for (int i = 0; i < 10; i++) {
	            int numero = sc.nextInt();
	            insertarEnOrden(array, i, numero);
	        }

	        System.out.println("Array ordenado ascendentemente:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(array[i] + " ");
	        }

	        sc.close();
	    }

	    public static void insertarEnOrden(int[] array, int tamano, int numero) {
	        int i = tamano - 1;

	        while (i >= 0 && array[i] > numero) {
	            array[i + 1] = array[i];
	            i--;
	        }

	        array[i + 1] = numero;
	    }
	
}



