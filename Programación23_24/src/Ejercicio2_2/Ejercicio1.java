package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer un número y decir si es aprobado o suspendido.
		
		float a;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Introduce la nota y te digo si has aprobado: ");
		 a = scan.nextFloat();
		 if (a<5) {
			 System.out.println("Has suspendido: " + a);
			 
			 
		 } else {
			 System.out.println("Has aprobado: " + a);
			 
		 }
		
		
		
		
		
	}

}
