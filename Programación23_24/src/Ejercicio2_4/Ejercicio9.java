package Ejercicio2_4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Transforma los caracteres del String: “ABCD” a ASCII. Utilizar char

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		
		//Todo esto es para sacar el código ASCII de los carácteres
		
		byte[] arrai_byte=frase.getBytes(); 			
		System.out.println("Código ASCII para cada carácter");
		for (int i=0; i <arrai_byte.length; i++){
			System.out.print(arrai_byte[i]+" "); 
			}
		
		
	}

}
