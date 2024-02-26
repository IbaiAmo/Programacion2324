package ejercicioBD;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.db.clientesModelo;
import modelo.db.pedidosModelo;
import modelo.db.productosModelo;
import modelo.model.Clientes;
import modelo.model.Pedidos;
import modelo.model.Productos;

public class GestionAlmacen {

	public static Scanner sc = new Scanner(System.in);
	
	public static void Menu1() {

		String[] bien = { "si", "no" };
		boolean enc = false;

		System.out.print("Quieres limitar los clientes que aparezcan? (si/no): ");
		String siono = sc.next();

		do {

			for (int i = 0; i < bien.length; i++) {
				if (bien[i].contentEquals(siono.toLowerCase())) {
					enc = true;
				}
			}

			if (enc == false) {
				System.out.print("Escribe si o no: ");
				siono = sc.next();
			}

		} while (enc == false);

		int cantidad = 0;

		if (siono.equalsIgnoreCase("si")) {
			System.out.print("Cuántos quieres que aparezcan? ");
			cantidad = sc.nextInt();
		}

		for (Clientes c : clientesModelo.mostrarClientes(siono, cantidad)) {
			System.out.println(c);
		}

	}

	public static void Menu2() {

		String[] bien = { "si", "no" };
		boolean enc = false;

		System.out.print("Quieres limitar los productos que aparezcan? (si/no): ");
		String siono = sc.next();

		do {

			for (int i = 0; i < bien.length; i++) {
				if (bien[i].contentEquals(siono.toLowerCase())) {
					enc = true;
				}
			}

			if (enc == false) {
				System.out.print("Escribe si o no: ");
				siono = sc.next();
			}

		} while (enc == false);

		int cantidad = 0;

		if (siono.equalsIgnoreCase("si")) {
			System.out.print("Cuántos quieres que aparezcan? ");
			cantidad = sc.nextInt();
		}
		
		for (Productos p : productosModelo.mostrarProductos(siono, cantidad)) {
			System.out.println(p);
		}
	}

	public static void Menu3() {

		String[] bien = { "si", "no" };
		boolean enc = false;

		System.out.print("Quieres limitar los pedidos que aparezcan? (si/no): ");
		String siono = sc.next();

		do {

			for (int i = 0; i < bien.length; i++) {
				if (bien[i].contentEquals(siono.toLowerCase())) {
					enc = true;
				}
			}

			if (enc == false) {
				System.out.print("Escribe si o no: ");
				siono = sc.next();
			}

		} while (enc == false);

		int cantidad = 0;

		if (siono.equalsIgnoreCase("si")) {
			System.out.print("Cuántos quieres que aparezcan? ");
			cantidad = sc.nextInt();
		}
		
		for (Pedidos p : pedidosModelo.mostrarPedidos(siono, cantidad)) {
			System.out.println(p);
		}
	}

	public static void Menu4() {
		
		String no = "";	//Esto es para que no haya problemas y aparezca la media tal cual.

		ArrayList<Productos> product = productosModelo.mostrarProductos(no, 0);

		double media = 0;

		for (int i = 0; i < product.size(); i++) {
			media += product.get(i).getPrecio();
		}
		media = media / product.size();

		System.out.println(media);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc = 0;

		do {
			System.out.println("============MENU============");
			System.out.println("1- Ver Los clientes.\r\n" + "2- Visualizar productos.\r\n"
					+ "3- Visualizar Pedidos.\r\n" + "4- Media de precio de los productos \r\n" + "5- Salir");
			System.out.println("============================");
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				System.out.println("============================");
				Menu1();
				break;

			case 2:
				System.out.println("============================");
				Menu2();
				break;

			case 3:
				System.out.println("============================");
				Menu3();
				break;

			case 4:
				System.out.println("============================");
				Menu4();
				break;

			case 5:
				System.out.println("============================");
				System.out.println("Programa finalizado");
				break;

			}

		} while (opc != 5);
	}

}
