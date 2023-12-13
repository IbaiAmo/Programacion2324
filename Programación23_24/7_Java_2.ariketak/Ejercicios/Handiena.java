package Ejercicios;
import java.util.Scanner;

public class Handiena {

	public static void main(String[] args) {
		/*
		 * Erabiltzaileak sartutako bi zenbakietatik handiena zein den adierazten duen
		 * programa kodifikatu.
		 */

		
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número: ");
		int num = sc.nextInt();
		
		System.out.print("Escribe un número: ");
		int num2 = sc.nextInt();
		
		if (num < num2) {
			System.out.println(num2 + " es el más grande");
		} else if (num == num2) {
			System.out.println("Los dos números son iguales");
		}else {
			System.out.println(num + " es el más grande");
		}
		
	}

}
