package Gestion_academica;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_ejercicio3 {
	
	public static void Menu1 (ArrayList<Alumno> nombresAlumnos) {


		Scanner sc = new Scanner (System.in);
		
		System.out.print("Cómo se llama el alumno? ");
		String nombre = sc.next();
		System.out.print("Cuántos años tiene? ");
		int edad = sc.nextInt();
		System.out.print("Curso: ");
		String curso = sc.next();
		
		Alumno alumno = new Alumno(nombre, edad , curso);
		nombresAlumnos.add(alumno);	
	}

	public static void Menu2 (ArrayList<Curso> listacursos , ArrayList<Alumno> nombresAlumnos) {
		
		Scanner sc = new Scanner (System.in);
		

		
		System.out.print("Curso: ");
		String curso = sc.next();
		System.out.print("Descripcion: ");
		String descripcion = sc.nextLine();
		descripcion = sc.nextLine();
		System.out.println("Profesor: ");
		String profesor = sc.next();
		

		
		Curso c = new Curso(curso, descripcion, profesor, nombresAlumnos);
		listacursos.add(c);	
		
	}
	
 	public static void Menu3 (ArrayList<Alumno> nombresAlumnos) {
		
 		Scanner sc = new Scanner (System.in);
		
		boolean identificador = false;
		int numInfo = 0;
		String nombInfo = "";
		
		do {
		System.out.print("Nombre del alumno: ");
		nombInfo = sc.next();
		
		for (int i = 0; i < nombresAlumnos.size(); i++) {
			
			if (nombresAlumnos.get(i).getNombre().equalsIgnoreCase(nombInfo)) {
				identificador = true;
				numInfo = i;
				
			}
		}
		
		if (identificador) {
			System.out.println(nombresAlumnos.get(numInfo).toString());
		}else {
			System.out.println("No hay ningún alumno con ese nombre");
		}
		
		}while (!nombresAlumnos.get(numInfo).getNombre().equalsIgnoreCase(nombInfo));
		

	}

 	public static void Menu4 (ArrayList<Curso> listacursos) {
 		
 		Scanner sc = new Scanner (System.in);
		
		boolean identificador = false;
		int numInfo = 0;
		String tituloInfo = "";
		
		do {
		System.out.print("Nombre del curso: ");
		tituloInfo = sc.next();
		
		for (int i = 0; i < listacursos.size(); i++) {
			
			if (listacursos.get(i).getTitulo().equalsIgnoreCase(tituloInfo)) {
				identificador = true;
				numInfo = i;
				
			}
		}
		
		if (identificador) {
			System.out.println(listacursos.get(numInfo).toString());
		}else {
			System.out.println("No hay ningún curso con ese nombre");
		}
		
		}while (!listacursos.get(numInfo).getTitulo().equalsIgnoreCase(tituloInfo));
 		
 		
 	}

 	public static void Menu5 (ArrayList<Curso> listacursos , ArrayList<Alumno> nombresAlumnos) {
 		
//		ArrayList<String> nombAlum = new ArrayList<String>();
 		
//		for (int i = 0; i <nombresAlumnos.size();i++) {
//			nombAlum.add(nombresAlumnos.get(i).getNombre());
//			
//		}
		
		
 		
 		
 	}
 	
	public static void main(String[] args) throws IOException{
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
			
			while (opc < 1 || opc > 6) {
				System.out.print("Elige una opción válida: ");
				opc = sc.nextInt();
			}
			
			switch (opc) {
			
			case 1:
				System.out.println("------------------------");
				Menu1 (nombresAlumnos);

				break;
				
			case 2:
				System.out.println("------------------------");
				Menu2 (listacursos , nombresAlumnos);
				
				break;
				
			case 3:
				System.out.println("------------------------");
				Menu3 (nombresAlumnos);
				
				break;
	
			case 4:
				System.out.println("------------------------");
				Menu4 (listacursos);
				
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
