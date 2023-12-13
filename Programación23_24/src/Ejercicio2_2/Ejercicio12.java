package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calcular la potencia del coche, si nos da en KW calcularemos en CV, sino al revés.
		 * (1 kW = 1,35 CV). Pedir un valor “K” o “C”, si el valor introducido es K el resultado será en
		 * CV y sino al revés.
		 */
		
		Scanner scan = new Scanner(System.in);
		String m;
		float k , c;
		System.out.print("Escribe la unidad que quieras cambiar (k(KW) a C (CV)) o al revés: ");
		m = scan.nextLine();
		if (m.equalsIgnoreCase("k")) {
			System.out.print("Escribe la potencia y te la paso a CV: ");
			k = scan.nextFloat();
			System.out.println(k + "KW son " + k * 1.35 + "CV");
			
		} if (m.equalsIgnoreCase("c")) {
			System.out.print("Escribe la potencia y te la paso a KW: ");
			c = scan.nextFloat();
			System.out.println(c + "CV son " + c / 1.35 + "KW");
		
		}
		
	}

}
