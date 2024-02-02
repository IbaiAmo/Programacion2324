package ejercicioBD;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.db.EmpleadoModelo;
import modelo.model.Empleado;

public class GestionEmpleado {
	private static Scanner sc = new Scanner (System.in);
	
	public static void Menu1() {
		ArrayList<Empleado> empleados=EmpleadoModelo.getEmpleados();
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}
	
	public static void Menu2() {
		
		System.out.print("Escribe el departamento: ");
		String escribirDep = sc.next();
		
		
		ArrayList<Empleado> empleados=EmpleadoModelo.getEmpleados1(escribirDep);
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}
	
	public static void Menu3() {
		
		System.out.print("Pon el salario apartir del cual quieres que salgan los empleados: ");
		int escribirSal = sc.nextInt();
		
		
		ArrayList<Empleado> empleados=EmpleadoModelo.getEmpleados2(escribirSal);
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}
	
	
	//Esta opción no funciona, es para escribir la sentencia entera.
	public static void Menu4() {
		
		System.out.println("Escribe la sentencia abajo:");
		String escribirSentencia = sc.next();
		
		
		ArrayList<Empleado> empleados=EmpleadoModelo.getEmpleados3(escribirSentencia);
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int opc =0;
		
		do {
			System.out.println("========MENU========");
			System.out.println("1- Ver todos los empleados \n" + "2- Ver empleados de cierto departamento \n" + "3- Ver empleados por salario \n" +
			"4- Escribir sentencia SQL \n" + "5- SALIR");
			System.out.println("====================");
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			
			switch (opc) {
			
			case 1:
				System.out.println("====================");
				Menu1();
				
				
				break;
				
				
			case 2:
				System.out.println("====================");
				Menu2();
				break;
				
				
			case 3:
				System.out.println("====================");
				Menu3();
				break;
				
				
			case 4:
				System.out.println("====================");
				Menu4();
				
				break;
				
			case 5:
				System.out.println("====================");
				System.out.println("Fin del programa");
				break;

			}
			
			
		}while(opc != 5);
		
		
	}

}