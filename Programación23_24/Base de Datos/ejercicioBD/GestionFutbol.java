package ejercicioBD;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.db.Futbol;
import modelo.db.equipoFutbol;
import modelo.model.Equipo;
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
		ArrayList<Equipo> equipos1 = equipoFutbol.verEquipos();

		for (Equipo e : equipos1) {
			System.out.println(e);
		}
	}

	public static void Menu3() {

		ArrayList<Equipo> equipos3 = equipoFutbol.verEquipos();
		boolean enc = false;

		System.out.print("DNI: ");
		String dni = sc.next();
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		String apellido = sc.next();
		System.out.print("Salario: ");
		int salario = sc.nextInt();
		System.out.print("idEquipo: ");
		int idEquipo = sc.nextInt();

		do {
			for (int i = 0; i < equipos3.size(); i++) {
				if (equipos3.get(i).getIdEquipo() == idEquipo) {
					enc = true;
				}
			}
			if (enc == false) {
				System.out.print("Ese id no existe, pon otro que exista: ");
				idEquipo = sc.nextInt();
			}
		} while (enc == false);

		Futbol.insFutbolista(dni, nombre, apellido, salario, idEquipo);

	}

	public static void Menu4() {
		ArrayList<Equipo> equipo = equipoFutbol.verEquipos();
		System.out.println("El id del equipo nuevo se autoincrementará a " + (equipo.size() + 1));
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.print("Ciudad: ");
		String ciudad = sc.nextLine();
		ciudad = sc.nextLine();
		equipoFutbol.insEquipo(nombre, ciudad);
	}

	public static void Menu5() {

		ArrayList<Futbolista> fut = Futbol.getFutbolistas();
		boolean enc = false;

		System.out.print("Introduce el DNI del jugador: ");
		String edni = sc.next();

		do {
			for (int i = 0; i < fut.size(); i++) {
				if (fut.get(i).getDni().equalsIgnoreCase(edni)) {
					enc = true;
				}
			}
			if (enc == false) {
				System.out.print("Ese DNI no existe, pon otro que exista: ");
				edni = sc.next();
			}
		} while (enc == false);

		Futbol.dniFutbolista(edni);
	}

	public static void Menu6() {

		ArrayList<Equipo> equipos3 = equipoFutbol.verEquipos();
		boolean enc = false;

		System.out.print("Introduce el id del equipo: ");
		int id = sc.nextInt();

		do {
			for (int i = 0; i < equipos3.size(); i++) {
				if (equipos3.get(i).getIdEquipo() == id) {
					enc = true;
				}
			}
			if (enc == false) {
				System.out.print("Ese id no existe, pon otro que exista: ");
				id = sc.nextInt();
			}
		} while (enc == false);

		equipoFutbol.verEquipoxid(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc = 0;
		do {

			System.out.println("==============MENU==============");
			System.out.println("1- Ver todos los futbolistas.\r\n" + "\r\n" 
					+ "2- Ver todos los Equipos.\r\n" + "\r\n"
					+ "3- Agregar un futbolista.\r\n" + "\r\n" 
					+ "4- Agregar un equipo.\r\n" + "\r\n"
					+ "5- Visualizar un futbolista dado el ID.\r\n" + "\r\n" 
					+ "6- Visualizar un equipo dado el ID.\r\n"
					+ "\r\n" 
					+ "7- SALIR.");
			System.out.println("================================");
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();

			switch (opc) {

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
				Menu4();
				break;

			case 5:
				System.out.println("================================");
				Menu5();
				break;

			case 6:
				System.out.println("================================");
				Menu6();
				break;

			case 7:
				System.out.println("================================");
				System.out.println("Fin del programa");
				break;

			}

		} while (opc != 7);

	}

}
