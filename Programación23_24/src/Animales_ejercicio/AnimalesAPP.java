package Animales_ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalesAPP {
	
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Animales> listaAnimales = new ArrayList<Animales>();
		
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> especies = new ArrayList<String>();
		ArrayList<Integer> edad = new ArrayList<Integer>();
		ArrayList<String> habitat = new ArrayList<String>();
		
		
		
		
		
		int opc = 4;
		
		do {
			
			System.out.println("==============MENU==============");
			System.out.println("1- Mostrar datos de 2 animales \n" + "2- Mostrar el animal que vive más \n" +
					"3- Mostrar el hábitat del animal \n" + "4- SALIR");
			System.out.println("================================");
			
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			
			
			switch (opc) {
			
			case 1:
				System.out.println("================================");
				
				
				
				break;
				
				
			case 2:
				System.out.println("================================");
				
				
				break;
				
				
			case 3:
				System.out.println("================================");
				
				break;
				
			
			case 4:
				System.out.println("================================");
				System.out.println("Fin del programa");
				
				break;
			
			}
			
			
		}while (opc != 4);
		
		
		
		
	}

}
