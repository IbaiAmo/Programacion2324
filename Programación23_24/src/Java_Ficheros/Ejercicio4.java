package Java_Ficheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static String cambiaNombre (String[] nombres) {
		
		nombres[0]= "PIKACHU";
		System.out.println(nombres[0]);
		
		return "";
	}
	
	public static String subirAtaque (int[] ataques) {
		
		System.out.println(ataques[3] + "----> " + (ataques[3] + 5));
		ataques[3] += 5;
		
		return "";
	}
	
	public static String cambiar (String [] nombres, int[] niveles, int[] ataques, int[] defensas, int[] velocidades) {
		Scanner sc = new Scanner (System.in);
		int num = 0;
		System.out.print("Qué pokemon quieres cambiar? ");
		String pokemon = sc.next();
		for (int x = 0; x < nombres.length; x++) {
			
			if (nombres[x].equalsIgnoreCase(pokemon)) {
				num = x;
			}
		}
		System.out.println("----Modificar datos----");
		System.out.println(nombres[num]);
		
		System.out.print(niveles[num] + "---->");
		int nivelNuevo = sc.nextInt();
		niveles[num] = nivelNuevo;
		
		System.out.print(ataques[num] + "---->");
		int ataqueNuevo = sc.nextInt();
		ataques[num] = ataqueNuevo;
		
		System.out.print(defensas[num] + "----> ");
		int defNueva = sc.nextInt();
		defensas[num] = defNueva;
		
		System.out.print(velocidades[num] + "----> ");
		int velo_nueva = sc.nextInt();
		velocidades[num] = velo_nueva;
		
		return "";
	}
	
	public static String buscar (String[] nombres, String[] tipos, int[] niveles, int[] ataques, int[] defensas, int[] velocidades) {
		
		Scanner sc = new Scanner (System.in);
		int num = 0;
		System.out.print("Qué pokemon quieres ver? ");
		String pokemon = sc.next();
		for (int x = 0; x < nombres.length; x++) {
			
			if (nombres[x].equalsIgnoreCase(pokemon)) {
				num = x;
				
			}
		}
		
		System.out.println("----" + nombres[num] + "----");
		System.out.println("tipo: " + tipos[num]);
		System.out.println("nivel: " + niveles[num]);
		System.out.println("ataque: " + ataques[num]);
		System.out.println("defensa: " + defensas[num]);
		System.out.println("velocidad: " + velocidades[num]);
		
		return "";
	}

	public static void main(String[] args) throws IOException {

		File f = new File("src/Java_Ficheros/pokemons.csv");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		Scanner sc = new Scanner (System.in);
		
		String[] Partes;
		String linea = "";
		String[] nombres = new String[20];
		String[] tipos = new String[20];
		int[] niveles = new int[20];
		int[] ataques = new int[20];
		int[] defensas = new int[20];
		int[] velocidades = new int[20];
		int i = 0;
		

		while ((linea = br.readLine()) != null) {

			Partes = linea.split(",");
			nombres[i] = Partes[0];
			tipos[i] = Partes[1];
			niveles[i] = Integer.parseInt(Partes[2]);
			ataques[i] = Integer.parseInt(Partes[3]);
			defensas[i] = Integer.parseInt(Partes[4]);
			velocidades[i] = Integer.parseInt(Partes[5]);
			i++;

		}

		int opc = 0;
		
		do {
			
		System.out.println("----------MENU----------");
		System.out.println("1. Lee la información del archivo “pokemons.csv”");
		System.out.println("2. Cambia el nombre del Pokémon 0 y lo llama “PICACHU”");
		System.out.println("3. Aumenta el nivel de ataque del Pokémon 3 en 5.");
		System.out.println("4. Cambiar: se pedirá el nombre de un Pokémon, se visualizará su información y se solicitará la modificación de los datos");
		System.out.println("5. Buscar por nombre");
		System.out.println("6. Los más rápidos");
		System.out.println("7. Enumerar por tipo");
		System.out.println("8. Lucha1");
		System.out.println("9. Lucha2");
		System.out.println("10. Salir");
		System.out.println("------------------------");
		System.out.print("Elige una opción: ");
		opc = sc.nextInt();
		
		
		switch (opc) {
		
		case 1:
			System.out.println("------------------------");
			System.out.println("Ya se ha leído la información");
			
			break;
		
		case 2:
			System.out.println("------------------------");
			cambiaNombre(nombres);
		
			break;
			
		case 3:
			System.out.println("------------------------");
			subirAtaque (ataques);
			
			break;
			
		case 4:
			System.out.println("------------------------");
			cambiar (nombres, niveles, ataques, defensas, velocidades);
			
			break;
			
		case 5:
			System.out.println("------------------------");
			buscar (nombres,tipos, niveles, ataques, defensas, velocidades);
			
			
			break;
		
		
		
		
		}
		

		}while (opc != 10);
			
	}

}
