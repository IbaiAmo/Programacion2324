package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número entre 1 y 7, después visualizar el día de la semana correspondiente.
		
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		
		
		switch (a) {
		
		case 1:
			System.out.print("Lúnes");
			break;
			
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miércoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Sábado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		
			default:
				System.out.println("ERROR");
		}
		
	}

}
