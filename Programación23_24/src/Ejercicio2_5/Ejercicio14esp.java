package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio14esp {

	public static void main(String[] args) {

		/*
		 * Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el
		 * nombre y el sueldo del empleado que más gana.
		 */
		
		
		Scanner sc = new Scanner (System.in);
		
		String [] Empleados = new String[20];
		double[] sueldo = new double[20];
		double max =  Double.MIN_VALUE; 
		int num_i = 0;
		
		for (int i = 0; i < sueldo.length; i++) {
			
			System.out.print("Empleado [" + i + "] = ");
			String emp = sc.next();
			Empleados[i] = emp;			
			
			
			System.out.print("Sueldo [" + i + "] = ");
			int dinero = sc.nextInt();
			sueldo[i] = dinero;
			
		
			
			if (max < sueldo[i]) {
				
				max = sueldo [i];
				num_i = i;
			}
			
			
		}
		
		System.out.println("El empleado que más gana es: " + Empleados[num_i] + " --> sueldo: " + max + "€");
		
	}
	
}
