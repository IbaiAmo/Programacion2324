package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa para que pida un número y muestre en pantalla el mismo número de asteriscos. (en distintas líneas).
		 
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b;
			System.out.print("Pon un número: ");	
			
			b = scan.nextInt();
			
			while (a < b) {
				a++;
				System.out.println("*");
				
			}
				
		
	
	}
}		
		
	


