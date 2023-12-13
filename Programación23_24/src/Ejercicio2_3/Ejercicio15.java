package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que visualice los múltiplos del número que especifique el usuario que están entre 0 y 100.
		
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Escribe un número: ");
		a = scan.nextInt();
		
		for (int i = 0; i <= 100; i++) {
			
			if (i %a == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
