package Gestion_academica;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Curso> listacursos = new ArrayList<Curso>();
		ArrayList<Alumno> nombresAlumnos = new ArrayList<Alumno>();
		
		int opc;
		
		do{
			System.out.println("----------MENU----------");
			System.out.println("1. Crear un nuevo estudiante");
			System.out.println("2. Crear un nuevo Curso");
			System.out.println("3. Mostrar información del Estudiante");
			System.out.println("4. Mostrar información del Curso");
			System.out.println("5. Guardar información");
			System.out.println("6. Salir");
			System.out.println("------------------------");
			
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			
			switch (opc) {
			
			case 1:
				System.out.println("------------------------");
				
				System.out.print("Cómo se llama el alumno? ");
				String nombre = sc.next();
				System.out.println("Cuántos años tiene?");
				int edad = sc.nextInt();
				
				Alumno alumno = new Alumno(nombre, edad ,"");
				nombresAlumnos.add(alumno);	
				System.out.println(nombresAlumnos.toString());
				
				break;
				
			case 2:
				System.out.println("------------------------");
				
				break;
				
			case 3:
				System.out.println("------------------------");
	
				break;
	
			case 4:
				System.out.println("------------------------");
	
				break;
	
			case 5:
				System.out.println("------------------------");
	
				break;
	
			case 6:
				System.out.println("------------------------");
				System.out.println("Fin del programa");
				
				break;
			
			
			}
			
			
		}while (opc != 6);
		
		
	}

	

}
