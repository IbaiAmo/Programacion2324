package Java_Ficheros;

import java.io.*;

public class Ejercicio4 {
	
	public static void main(String[] args) throws IOException{
		/*
		 * Implementa un programa que realiza las siguientes tareas utilizando métodos:
		 * Lee la información del archivo “pokemons.csv”, carga la información en arrays
		 * (nombres, tipos, niveles, ataques, defensas, velocidades). 
		 * Cambia el nombre del pokemon 0 y lo llama “PICACHU” (en mayúsculas). 
		 * Aumenta el nivel de ataque del pokemon 3 en 5. 
		 * Guarda la información de los arrays en el archivo.
		 * Por lo tanto, los métodos son: CargarDatos, ModificarDatos y GuardarDatos.
		 */

		File f = new File ("src/Java_Ficheros/pokemons.csv");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		String [] Partes;
		String linea = "";
		String [] nombres = new String [20];
		String [] tipos = new String [20];
		int [] niveles = new int [20];
		int [] ataques = new int [20];
		int [] defensas = new int [20];
		int [] velocidades = new int [20];
		int i = 0;
		
		
		while ((linea = br.readLine()) != null) {
			
			Partes = linea.split(",");
			nombres[i] = Partes[0];
			tipos [i] = Partes[1];
			niveles[i] = Integer.parseInt (Partes[2]);
			ataques [i] = Integer.parseInt (Partes[3]);
			defensas[i] = Integer.parseInt (Partes[4]);
			velocidades [i] = Integer.parseInt (Partes[5]);
			i++;
			
		}
		
		
	
		
		
		
		
	}

}
