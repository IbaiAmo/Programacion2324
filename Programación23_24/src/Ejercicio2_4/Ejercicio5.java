package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir la frase introducida sin espacios vacíos.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		String a = frase.replaceAll("\\s", "");
		System.out.println(a);
		
		
		
	}

}
