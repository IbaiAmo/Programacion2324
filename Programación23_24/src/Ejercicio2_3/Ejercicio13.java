package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que escriba de 0 a un número introducido por el usuario.
		
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("Pon un número: ");
		a = scan.nextInt();
		
		for (int i = 0; i<a;i++) {
			System.out.print(i + " , ");
		}
		System.out.println(a);
		
	}

}
