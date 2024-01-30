package Animales_ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalesAPP {

	public static Scanner sc = new Scanner (System.in);
	
	public static void Menu1 (ArrayList<Animales> listaAnimales) {

		System.out.println("1- Mostrar dos aleatorios \n" + "2- Introduce manualmente");
		System.out.print("Elige una opción: ");
		int opc2 = sc.nextInt();
		
		while (opc2 < 1 || opc2 > 2) {
			System.out.print("Introduce un número válido: ");
			opc2 = sc.nextInt();
		}
		
		switch(opc2) {
		
		case 1:
			int aniAleatorio1, aniAleatorio2;
			
			aniAleatorio1 = (int) (Math.random()*3+0);
			aniAleatorio2 = (int) (Math.random()*3+0);
			
			while (aniAleatorio2 == aniAleatorio1) {
				aniAleatorio2 = (int) (Math.random()*3+0);
			}
			
			System.out.println(listaAnimales.get(aniAleatorio1).toString());
			System.out.println(listaAnimales.get(aniAleatorio2).toString());
		
		break;
		
		case 2:
			
			boolean enc = false, enc2 = false;
			int animal1 = 0, animal2 = 0;
			
			System.out.print("Introduce un animal: ");
			String animalBusc = sc.next();
			
			while (enc == false) {
				for (int i = 0; i < listaAnimales.size(); i++) {
					if (listaAnimales.get(i).getNombre().equalsIgnoreCase(animalBusc)) {
						enc = true;
						animal1 = i;
					}
				}
				if (enc == false) {
					System.out.print("Ese animal no existe, puede que lo hayas escrito mal: ");
					animalBusc = sc.next();
				}
			}
			System.out.print("Introduce otro animal: ");
			String animalBusc2 = sc.next();
			
			while (animalBusc2.equalsIgnoreCase(animalBusc)) {
				System.out.print("Has introducido el mismo animal, pon otro: ");
				animalBusc2 = sc.next();
			}
				
			while (enc2 == false) {
				for (int i = 0; i < listaAnimales.size(); i++) {
					if (listaAnimales.get(i).getNombre().equalsIgnoreCase(animalBusc2)) {
						enc2 = true;
						animal2 = i;
					}
						
				}
			}
			System.out.println(listaAnimales.get(animal1).toString());
			System.out.println(listaAnimales.get(animal2).toString());
				
			break;
			}
			
		
		}
	
	public static void Menu2 (ArrayList<Animales> listaAnimales) {

 		int numeroMayor = Integer.MIN_VALUE, animal = 0;
 		
 		for (int i = 0; i < listaAnimales.size(); i++) {
 			if (numeroMayor < listaAnimales.get(i).getEdad()) {
 				numeroMayor = listaAnimales.get(i).getEdad();
 				animal = i;
 			}
 		}
 		System.out.println("El animal que más vive es el " + listaAnimales.get(animal).getNombre() + ", que vive " + numeroMayor + " años.");
 		
 	}
	
		
 	public static void Menu3 (ArrayList<Animales> listaAnimales) {
		
		System.out.print("Introduce un animal: ");
		String animalBusc = sc.next();
		boolean enc = false;
		String habitatsTexto = "";
		
		while (enc == false) {
		for (int i = 0; i < listaAnimales.size(); i++) {
			if (listaAnimales.get(i).getNombre().equalsIgnoreCase(animalBusc)) {
				enc = true;
				for(int x = 0; x < listaAnimales.get(i).getHabitat().size(); x++) {
				habitatsTexto += listaAnimales.get(i).getHabitat().get(x);
				
				if (x == 0) {
					habitatsTexto += ", ";
				}else if (x == 1) {
					habitatsTexto += " y ";
				}
				}
				break;
			}
		}
		
		if (enc == false) {
			System.out.print("Ese animal no existe, puede que lo hayas escrito mal: ");
			animalBusc = sc.next();
		}else {
			System.out.println("el " + animalBusc + " puede vivir en " + habitatsTexto + ".");
		}
		
		}
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		ArrayList<Animales> listaAnimales = new ArrayList<Animales>();
		
		
		File f = new File("src/Animales_ejercicio/animales.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String lector = "";
		String[] partes;
		
		
		while ((lector = br.readLine()) != null) {
			
			partes = lector.split("::");
			ArrayList<String> habitats = new ArrayList<String>();
			habitats.add(partes[3]);
			habitats.add(partes[4]);
			habitats.add(partes[5]);
			
			Animales animal = new Animales(partes[0], partes[1],Integer.parseInt(partes[2]), habitats);
			listaAnimales.add(animal);
			
		}
		
		int opc = 4;
		
		do {
			
			System.out.println("==============MENU==============");
			System.out.println("1- Mostrar datos de 2 animales \n" + "2- Mostrar el animal que vive más \n" +
					"3- Mostrar el hábitat del animal \n" + "4- SALIR");
			System.out.println("================================");
			
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			
			
			switch (opc) {
			
			case 1:
				System.out.println("================================");
				Menu1 (listaAnimales);
				
				
				break;
				
				
			case 2:
				System.out.println("================================");
				Menu2 (listaAnimales);
				
				break;
				
				
			case 3:
				System.out.println("================================");
				Menu3 (listaAnimales);
				break;
				
			
			case 4:
				System.out.println("================================");
				System.out.println("Fin del programa");
				
				break;
			
			}
			
			
		}while (opc != 4);
		
		
		
		
	}

}
