package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir 10 números y visualizar en pantalla el mayor.
		
		Scanner scan = new Scanner(System.in);
		
		int i , b = 0;      //Pongo dos variables, una para los números que se introduzcan y la otra para guardar el mayor
		int a = 0;
		
		while (a<10) {
			a++;
			System.out.print("Escribe un número: ");
			i = scan.nextInt();
			if (i>b) {
				b = i;
			}
	
		}
		
		System.out.println("El número mayor introducido es: " + b);
		
		
		
		
	}

}
