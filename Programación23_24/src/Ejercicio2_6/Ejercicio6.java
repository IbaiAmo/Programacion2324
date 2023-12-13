package Ejercicio2_6;

import java.util.Scanner;

public class Ejercicio6 {
	
public static boolean esPrimo (boolean es, int num, String si) {
		
	for (int i = num -1; i > 1; i--) {
		
		if (num % i == 0) {
			es = false;
		}
		
	}
	if (es) {
		si = num + " es primo";
	}else {
		si = num + " NO es primo";
	}
	
		return es;
	}

	public static void main(String[] args) {
		//Crear una función llamada esPrimo: recibe un int y devuelve un booleano.
		
		Scanner sc = new Scanner(System.in);
		boolean es = true;
		String si ="";
		
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		
		System.out.println(esPrimo (es, num, si));
	}

}
