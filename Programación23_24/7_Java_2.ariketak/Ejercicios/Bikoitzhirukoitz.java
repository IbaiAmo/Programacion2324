package Ejercicios;
import java.util.Scanner;

public class Bikoitzhirukoitz {

	public static void main(String[] args) {
		/*
		 * Erabiltzaileak sartutako zenbaki baten bikoitza eta hirukoitza agertuko da
		 * pantailan.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número: ");
		int num = sc.nextInt();
		
		System.out.println("El doble de " + num + " es " + (num*2));
		System.out.println("El triple de " + num + " es " + (num*3));

	}

}
