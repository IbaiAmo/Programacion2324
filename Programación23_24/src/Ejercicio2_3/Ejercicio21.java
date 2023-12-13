package Ejercicio2_3;

import java.util.Scanner;


public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Visualizar el factorial de 5 números que introduce el usuario.
		
		Scanner scan = new Scanner(System.in);		
		
		float a , b = 0 , v = 0;
		
		
		for (int x = 5; x >0 ; x--) {      //Esto es para pedir 5 veces los números
			System.out.print("Pon un número: ");
			a = scan.nextInt();
			v = a;
			
			for (float i = a-1; i >0; i--) {     //Operación para hacer el factorial
				b = i * a;
				a = b;
				
			}
			
			System.out.println("El factorial de " + v + "! es: " + b);
		}
		
		
			
			
		
		
			
			
		
		
	
	}

}
