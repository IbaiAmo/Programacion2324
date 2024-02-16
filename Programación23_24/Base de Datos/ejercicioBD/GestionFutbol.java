package ejercicioBD;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.db.Futbol;
import modelo.db.equipoFutbol;
import modelo.model.Futbolista;

public class GestionFutbol {
	
	public static Scanner sc = new Scanner(System.in);

	public static void Menu1() {

		ArrayList<Futbolista> futbolistas = Futbol.getFutbolistas();
		for (Futbolista f : futbolistas) {
			System.out.println(f);
			
		}
	
		System.out.print("\n");
		}
	
	public static void Menu2() {
		equipoFutbol.verEquipos();
	}
	
	public static void Menu3() {
		
		System.out.print("DNI: ");
		String dni= sc.next();
		System.out.print("Nombre: ");
		String nombre= sc.next();
		System.out.print("Apellido: ");
		String apellido= sc.next();
		System.out.print("Salario: ");
		int salario= sc.nextInt();
		System.out.print("idEquipo: ");
		int idEquipo= sc.nextInt();
		
		Futbol.insFutbolista(dni, nombre, apellido, salario, idEquipo);

	}
	
	public static void Menu5() {
		System.out.print("Introduce el DNI del jugador: ");
		String edni = sc.next();
		
		Futbol.idFutbolista(edni);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opc = 0;
		do {
		
		System.out.println("==============MENU==============");
		System.out.println("1 - Ver todos los futbolistas.\r\n"
				+ "\r\n"
				+ "2- Ver todos los Equipos.\r\n"
				+ "\r\n"
				+ "3- Agregar un futbolista.\r\n"
				+ "\r\n"
				+ "4- Agregar un equipo.\r\n"
				+ "\r\n"
				+ "5- Visualizar un futbolista dado el ID.\r\n"
				+ "\r\n"
				+ "6- Visualizar un equipo dado el ID.\r\n"
				+ "\r\n"
				+ "7- SALIR.");
		System.out.println("================================");
		System.out.print("Elige una opción: ");
		opc = sc.nextInt();
		
		switch(opc) {
		
		
		case 1:
			System.out.println("================================");
			Menu1();
			
			
			break;
			
		case 2:
			System.out.println("================================");
			Menu2();
			break;
			
		case 3:
			System.out.println("================================");
			Menu3();
			break;
			
		case 4:
			System.out.println("================================");
			
			break;
			
		case 5:
			System.out.println("================================");
			Menu5();
			break;
			
		case 6:
			System.out.println("================================");
			
			break;
		
		case 7:
			System.out.println("================================");
			System.out.println("Fin del programa");
			
			break;
		
		}
		
		}while(opc != 7);
		
	}

}
