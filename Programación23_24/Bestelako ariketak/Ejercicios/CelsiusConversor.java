package Ejercicios;
import java.util.Scanner;

public class CelsiusConversor {

	public static void main(String[] args) {
		/*
		 * Programa honetan temperatura Celsius graduetan eskatuko zaio erabiltzaileari
		 * eta pantailatik Kelvin eta Fahrenheit graduetan erakutsiko da.
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Temperatura ºC: ");
		int temp = sc.nextInt();
		System.out.println("Temperatura en ºF: " + ((float)(temp * 9 / 5) + 32) + "ºF");
		System.out.println("Temperatura en ºK: " + (temp + 273.15) + "ºK");
	}

}
