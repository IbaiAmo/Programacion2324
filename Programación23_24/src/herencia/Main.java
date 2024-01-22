package herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void cantidadAnimal (ArrayList<Animal> listaAnimal) {
		
		int contadorMarino = 0;
		int contadorTerrestre = 0;
		
		for (int i = 0; i < listaAnimal.size(); i++) {
			if (listaAnimal.get(i) instanceof Marino) {
				
				contadorMarino++;
				
			}else if(listaAnimal.get(i) instanceof Terrestre) {
				contadorTerrestre++;
			}
		}
		
		System.out.println("Cantidad de Animales de cada tipo: ");
		System.out.println("Marinos: " + contadorMarino);
		System.out.println("Terrestres: " + contadorTerrestre);
		System.out.println("Total de animales: " + (contadorMarino + contadorTerrestre) + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Animal> listaAnimal = new ArrayList<>();
		
		int opc = 0;
		
		do {
		System.out.println("=======MENU=======");
		System.out.println("1. Crear un animal \n"+"2. Cantidad de animales \n" + "3 Salir");
		
		System.out.println("==================");
		System.out.print("Elige una opción: ");
		opc = sc.nextInt();
		
		switch (opc) {
		
		case 1:
			String [] tipos = {"marino" , "terrestre"};
			boolean encontrado = false;
			String animalElegir = "";
			
			System.out.println("==================");
			
			while(encontrado == false) {
			System.out.print("Qué animal quieres crear? (Marino o terrestre) ");
			animalElegir = sc.next();
				
			for (int i = 0; i < tipos.length; i++) {
				if (animalElegir.equalsIgnoreCase(tipos[i])) {
					encontrado = true;
					break;
				}
			}
			}
			
			System.out.print("Cuántos animales " + animalElegir + "s quieres crear? ");
			int cantidad = sc.nextInt();
			
			while (cantidad <= 0){
				System.out.print("Introduce una cantidad mayor a 0: ");
				cantidad = sc.nextInt();
			}
			
			
			for (int i = 0; i < cantidad; i++) {
				if (animalElegir.equalsIgnoreCase("marino")) {
					System.out.println("---Animal Marino " + (i+1) + "---");
					System.out.print("nombre del animal: ");
					String nombreAnimal = sc.next();
					
					Marino animalMar = new Marino(nombreAnimal, null, 0, 0);
					listaAnimal.add(animalMar);
					
					
				}else if (animalElegir.equalsIgnoreCase("terrestre")) {
					System.out.println("---Animal Terrestre " + (i+1) + "---");
					System.out.print("nombre del animal: ");
					String nombreAnimal = sc.next();
					
					Terrestre animalTer = new Terrestre(nombreAnimal, null, 0, 0);
					listaAnimal.add(animalTer);
					
				}
			}
			
			System.out.println("");
			
			break;
			
		case 2:
			System.out.println("==================");
			 cantidadAnimal (listaAnimal);
			
			
			break;
			
		case 3:
			System.out.println("==================");
			System.out.println("Fin del programa");
		
		}
		
		}while (opc !=3);
	}

}
