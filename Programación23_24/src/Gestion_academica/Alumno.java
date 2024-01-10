package Gestion_academica;

public class Alumno {

	private String nombre;
	private int edad;
	private String curso;
	
	public Alumno(String nombre, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
	
	
	
	
	
}
