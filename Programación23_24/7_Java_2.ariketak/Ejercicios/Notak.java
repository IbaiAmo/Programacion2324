package Ejercicios;
import java.util.Scanner;

public class Notak {

	public static void main(String[] args) {
		/*
		 * Erabiltzaileak ikaslearen nota sartuko du. Nota hori gutxi, nahiko, ondo, oso
		 * ondo edo bikain den adieraziko du programak.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe tu nota: ");
		int num = sc.nextInt();
		
		if (num >= 0 && num < 5) {
			System.out.println("Gutxi");
			
		}else if (num >= 5 && num <6){
			System.out.println("Nahiko");
			
		}else if (num >= 6 && num < 7){
			System.out.println("Ondo");
			
		}else if (num >= 7 && num <9){
			System.out.println("Oso ondo");
			
		}else if (num >= 9 && num <= 10){
			System.out.println("Bikain");
		}else {
			System.out.println("ERROR");
		}
		
		
	}

}
