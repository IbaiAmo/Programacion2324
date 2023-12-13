package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Definir una variable con un valor aleatorio entre 0 y 100 utilizando la ver aquí,  si no abajo:

		*(int)Math.floor(Math.random() * (max - min + 1) + min)

 		*Decirle al usuario que diga cuál es el número. Pedir números hasta que acierte, pero hay que darle pistas, diciendo si el número introducido 
 		*es mayor o menor que el que tiene que acertar. Visualizar el número de veces que ha necesitado para adivinar el número.
 		*/
		
		Scanner scan = new Scanner(System.in);
		
		int a = (int) Math.floor(Math.random() * (100 - 0 + 1)) + 0;
		int b, c = 1;
		System.out.println("Adivina el número entre el 0 y 100");
		System.out.print("Introduce el número: ");
		b = scan.nextInt();
		while (b != a) {
			c=c + 1;
			
			if (b < a) {
				System.out.print("Introduce un número más alto: ");
				b = scan.nextInt();
			}
			if (b>a) {
				System.out.print("Introduce un número más bajo: ");
				b = scan.nextInt();
			}
			
			
		}
		
		System.out.println("Has acertado el número: "+ a);
		System.out.println("Número de intentos: " + (c+1));
		
	}

}
