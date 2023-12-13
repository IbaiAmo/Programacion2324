package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa para que pida un número y muestre en pantalla el mismo número de asteriscos. (en la misma línea)
		
		Scanner scan = new Scanner(System.in);
		
		int b;
			System.out.print("Pon un número: ");	
			
			b = scan.nextInt();
			String sum = "*";
			
		for (int i = 0; i < b; i++) {
			System.out.println(sum);
			sum = sum + "*";
			
		}
		
		
		
		
	}

}
