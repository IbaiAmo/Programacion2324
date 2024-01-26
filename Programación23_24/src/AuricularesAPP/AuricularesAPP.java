package AuricularesAPP;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AuricularesAPP {

	public static Scanner sc = new Scanner(System.in);

	public static void aumentarPrecio(ArrayList<Auricular> listaAuriculares) {

		boolean marcaEnc = false, modeloEnc = false;
		int cambio = 0;

		System.out.print("Introduce la Marca: ");
		String intrMarca = sc.next();

		while (marcaEnc == false) {
			for (int i = 0; i < listaAuriculares.size(); i++) {
				if (listaAuriculares.get(i).getMarca().equalsIgnoreCase(intrMarca)) {
					marcaEnc = true;
				}
			}
			if (marcaEnc == false) {
				System.out.print("No existe esa marca, escribe otra vez: ");
				intrMarca = sc.next();
			}
		}

		System.out.print("Introduce el modelo: ");
		String intrModelo = sc.next();

		while (modeloEnc == false) {
			for (int x = 0; x < listaAuriculares.size(); x++) {

				if (listaAuriculares.get(x).getModelo().equalsIgnoreCase(intrModelo)) {
					modeloEnc = true;
					cambio = x;
				}
			}

			if (modeloEnc == false) {
				System.out.print("No existe ese modelo, escribe otra vez: ");
				intrModelo = sc.next();
			}

		}

		System.out.println("Se ha sumado 10€ al modelo " + listaAuriculares.get(cambio).getModelo() + " de la marca "
				+ listaAuriculares.get(cambio).getMarca() + ".");
		System.out.println(listaAuriculares.get(cambio).getPrecio() + " -----> "
				+ (listaAuriculares.get(cambio).getPrecio() + 10));

		listaAuriculares.get(cambio).setPrecio(listaAuriculares.get(cambio).getPrecio() + 10);
	}

	public static void Guardar(ArrayList<Auricular> listaAuriculares) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("src/AuricularesAPP/auriculares.txt"));

		for (int i = 0; i < listaAuriculares.size(); i++) {
			bw.write(listaAuriculares.get(i).getModelo() + ";" + listaAuriculares.get(i).getMarca() + ";"
					+ listaAuriculares.get(i).getPrecio() + ";" + listaAuriculares.get(i).getStock() + "\n");
		}

		bw.flush();
		bw.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("src/AuricularesAPP/auriculares.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String lector = "";
		String[] Partes;
		ArrayList<Auricular> listaAuriculares = new ArrayList<Auricular>();

		while ((lector = br.readLine()) != null) {
			Auricular auricular = new Auricular();

			Partes = lector.split(";");
			auricular.setModelo(Partes[0]);
			auricular.setMarca(Partes[1]);
			auricular.setPrecio(Math.round(Double.parseDouble(Partes[2])));
			auricular.setStock(Integer.parseInt(Partes[3]));

			listaAuriculares.add(auricular);
		}

		int opc = 0;

		do {
			System.out.println("===========MENU===========");
			System.out.println("1. Aumentar el precio 10€ \n" + "2. Guardar los datos en un archivo \n" + "3. Salir");

			System.out.println("==========================");
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();

			while (opc < 1 || opc > 3) {
				System.out.print("Introduce un valor permitido (1 ,2,3): ");
				opc = sc.nextInt();
			}

			switch (opc) {

			case 1:
				System.out.println("==========================");
				aumentarPrecio(listaAuriculares);

				break;

			case 2:
				System.out.println("==========================");
				Guardar(listaAuriculares);

				break;

			case 3:
				System.out.println("==========================");
				System.out.println("Programa Finalizado");

				break;

			}

		} while (opc != 3);

	}

}
