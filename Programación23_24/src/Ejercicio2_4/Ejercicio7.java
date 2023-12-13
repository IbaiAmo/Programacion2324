package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir en tres líneas una dirección web.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String web = sc.nextLine();
		
		
		for (int i = 0; i < web.length();i++) {
			
			char a = web.charAt(i);
			
			
			if (a != '.') {
				System.out.print(a);
				
				
			}else {
				System.out.println(" ");
			}
			
		}
		
		
		
		
	}

}
