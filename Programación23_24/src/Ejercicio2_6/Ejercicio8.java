package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static String binario (int numero) {
	
		String res="";
	while (numero!=0) {
		
		if (numero % 2 == 0) {
			res = "0"+ res;
		}else {
			res = "1"+ res;
		}
		
		numero = numero /2;
		
		
	} 

	return res;
	
	}
	

	public static void main(String[] args) {
		/*
		 * Crea una aplicación que nos convierta un número en base decimal a binario.
		 * Esto lo realizará un método al que le pasaremos el número como parámetro,
		 * devolverá un String con el número convertido a binario. Para convertir un
		 * número decimal a binario, debemos dividir entre 2 el número y el resultado de
		 * esa división se divide entre 2 de nuevo hasta que no se pueda dividir más, el
		 * resto que obtengamos de cada división formará el número binario, de abajo a
		 * arriba.
		 * 
		 * Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número y te lo paso a binario: ");
		int numero = sc.nextInt();
		
		System.out.println(binario(numero));
		
		


		
	}

}
