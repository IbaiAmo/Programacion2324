package Ejercicios;
import java.util.Scanner;

public class konparatu {

	public static void main(String[] args) {
		/*
		 * Programak pantailatik atera behar duena: 
		 * i. Aldagai oso bat deklaratu 
		 * ii.Erabiltzaileari zenbaki bat eskatu 
		 * iii.3 if ezberdin erabili jakiteko erabiltzaileak sartu duen zenbakia 5 baino handiagoa, txikiagoa edo berdina den.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escribe un número: ");
		int num = sc.nextInt();
		
		if (num < 5) {
			System.out.println(num + " es menor que 5");
		} else if (num == 5) {
			System.out.println(num + " es igual que 5");
		}else {
			System.out.println(num + " es mayor que 5");
		}
		
		

	}

}
