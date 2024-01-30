package Animales_ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Animales {

	private String nombre;
	private String especie;
	private int edad;
	private ArrayList<String> habitat = new ArrayList<String>();
	
	public Animales(String nombre, String especie, int edad, ArrayList<String> habitat) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.habitat = habitat;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<String> getHabitat() {
		return habitat;
	}
	public void setHabitat(ArrayList<String> habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", habitat=" + habitat + "]";
	}
	
	
	
	
	
	
	
	
	
}
