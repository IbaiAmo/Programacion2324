package Ejercicios;

import java.util.Scanner;

public class Nagusia {

	public static void main(String[] args) {
		/*Programak erabiltzaileari bere izena eta bere adina eskatuko dizkio. 
		 * i. 18 urte edo gutxiago baditu mezu hau erakutsiko du: EZIN ZARA SISTEMAN SARTU!
		 * ii. 18 urte baino gehiago baditu mezu hau erakutsiko du: Kaixo, IZENA MAIUSKULAZ, ongi etorri. 
		 * Zer egin nahi duzu? 
		 * 1- Zenbakiak gehitu 
		 * 2- Hitz bat minuskulara pasatu 
		 * 3- Lauki baten azalera kalkulatu
		 */

		Scanner sc = new Scanner (System.in);
		Scanner leer = new Scanner (System.in);
		
		System.out.print("Cómo te llamas? ");
		String nombre = sc.nextLine();
		
		System.out.print("Edad: ");
		int edad = sc.nextInt();
		
		while (edad < 0 || edad > 100) {
			System.out.println("No puedes tener esa edad");
			System.out.println("Introduce bien tu edad: ");
			edad = sc.nextInt();
		}
		
		if (edad < 18) {
			System.out.println("No puedes entrar en el sistema!");
			
		} else {
			System.out.println("Hola, " + nombre.toUpperCase() + ", bienvenido.");
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Sumar números.");
			System.out.println("2. Pasar una palabra a minúsculas.");
			System.out.println("3. Calcular el área de un cuadrado.");
			System.out.print("Elige (1, 2, 3): ");
			int num = sc.nextInt();
			
			switch (num) {
			
			case 1:
			
				System.out.println("------------------");
				System.out.println("SUMAR NÚMEROS");
				int suma = 0;
				int[] sum_num = new int[2];
				
				for (int i = 0; i < 2; i++) {
					
					System.out.print("Número (" + (i+1) + "): ");
					sum_num[i] = sc.nextInt();
					suma += sum_num[i];
				}
				System.out.println(sum_num[0] + " + " + sum_num[1] + " = " + suma);
				
				sc.close();
				break;
				
			case 2:
				
				System.out.println("------------------");
				System.out.println("PASAR UNA PALABRA A MINÚSCULAS");
				System.out.print("Escribe una palabra en MAYÚSCULAS: ");
				
				
				String pal = leer.nextLine();
				System.out.println(pal + " en minúsculas es " + pal.toLowerCase());
				
				break;
				
			case 3:
				
				System.out.println("------------------");
				System.out.println("CALCULAR EL ÁREA DE UN CUADRADO");
				System.out.print("Lados del cuadrado: ");
				int cuadrado = leer.nextInt();
				System.out.println("Área: " + (cuadrado*2) + "m^2");
				leer.close();
				break;
			
				
			}
			
		}
		
		
	}

}
