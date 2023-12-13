package Ejercicio2_1;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario que introduzca su nombre y  visualizar en pantalla “Tu nombre es: nombre”.
		
		String nombre;
		Scanner scan = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		nombre = scan.nextLine();
		System.out.print("Tu nombre es: " + nombre);
		
		
	}

}
