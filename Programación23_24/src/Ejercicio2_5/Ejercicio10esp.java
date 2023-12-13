package Ejercicio2_5;

import java.util.Scanner;

public class Ejercicio10esp {

	public static void main(String[] args) {
		/*
		 * Definir y rellenar un array de 10 (por programación). Pedir una cadena y en
		 * la pantalla tiene que aparecer los nombres que contengan la cadena. Es decir,
		 * realizar una especie de búsqueda.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		String[] nombres = {"María", "Juan", "Ana", "Luis", "Sofía", "Carlos", "Laura", "Diego", "Paula", "Daniel"};

		System.out.print("Escribe lo que quieres buscar: ");
		String busc = sc.nextLine();
		

		for (int i = 0; i < nombres.length; i++) {
			
			
			if (nombres[i].contains(busc)) {
					System.out.println(nombres[i]);
				}
					
			
		}
		
		
	}

}
