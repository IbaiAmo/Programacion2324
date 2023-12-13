package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Como dato tenemos la temperatura en el aula en ºC.
		 * Queremos saber su equivalente en ºF. (ºF = ºC * 1.8 + 32). 
		 * La temperatura en el aula se introducirá desde el teclado.
		 */
		 int c;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Introduce la temperatura que hace en tu clase: ");
		 c = scan.nextInt();
		 System.out.println(c + "º son: " + (c*1.8+32) + "º fahrenheit");
		 
		
	}

}
