package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pedir un número y decir que nota le corresponde.
		○ Entre 1 y 4,9: suspenso
		○ Entre 5 y 5,9: suficiente
		○ Entre 6 y 6,9: bien
		○ Entre 7 y 8,9: muy bien
		○ Entre 9 y 10: sobresaliente
		○ Si no ERROR.
		 */
		Scanner scan = new Scanner(System.in);
		double a;
		System.out.print("Escribe la nota que hayas sacado: ");
		a = scan.nextDouble();
		if (a >=1 && a <=4.9) {
			System.out.println("suspenso");
			
		}if (a >=5 && a<=5.9) {
			System.out.println("suficiente");
			
		}if (a >=6 && a<=6.9) {
			System.out.println("bien");
				
				
		}if (a >=7 && a<=8.9) {
			System.out.println("muy bien");
		
		}if (a >=9 && a<=10) {
			System.out.println("sobresaliente");
			
		}else if (a<1 || a>10){
			System.out.println("ERROR");
		}
	}

}
