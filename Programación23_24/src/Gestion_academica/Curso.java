package Gestion_academica;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
	
	private String titulo;
	private String descripcion;
	private String profesor;
	private ArrayList<String> listaAlumnos=new ArrayList();
	
	public Curso() {
	}

//	public Curso(String titulo, String descripcion) {
//		this.titulo = titulo;
//		this.descripcion = descripcion;
//	}
//
//	public Curso(String titulo, String descripcion, String profesor, ArrayList<String> listaAlumnos) {
//		this.titulo = titulo;
//		this.descripcion = descripcion;
//		this.profesor = profesor;
//		this.listaAlumnos = listaAlumnos;
//	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<String> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<String> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descripcion=" + descripcion + ", profesor=" + profesor + ", listaAlumnos="
				+ listaAlumnos + "]";
	}
	
	
	public void anyadirAlumno () {
		Scanner sc = new Scanner(System.in);
		System.out.print("A qué alumno quieres meter en el curso? ");
		String alumno = sc.next();
		this.listaAlumnos.add(alumno);
	}
	
	
	
	
	
	
}
