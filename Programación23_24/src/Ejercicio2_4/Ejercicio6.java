package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contar las vocales y los consonantes de una frase, los espacios en blanco no cuentan.
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		int consonantes = 0, vocales = 0;
		String esp = frase.replaceAll("\\s", "");     //Aqui quito los espacios a la frase y la guardo en "esp" (frase sin espacios)
		
		for (int i = 0; i < esp.length(); i++) {
			
			char a = esp.charAt(i);
			
			
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				vocales++;
				
			} else {
				consonantes++; 
			}
				
		}
		System.out.println("Hay " + vocales + " vocales y " + consonantes + " consonantes en la frase");
		
		
		
	}

}
