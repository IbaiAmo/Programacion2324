package Usuarios;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionUsuarios {
	
	public static Scanner sc = new Scanner (System.in);
	
	public static void Guardar (ArrayList<Usuario> userList) throws IOException{
		
		BufferedWriter bw = new BufferedWriter (new FileWriter ("src/Usuarios/usuarios.txt"));
		
		int active = 0;
		
		for (int i = 0; i < userList.size(); i++) {
			
			if (userList.get(i).isActivo() == false) {
				active = 0;
			}else {
				active = 1;
			}
			
			bw.write(userList.get(i).getId() + ":" + userList.get(i).getNombre() + ":" + userList.get(i).getApellido() +
					":" + userList.get(i).getContraseña() + ":" + active + "\n");
		}
		
		bw.flush();
		bw.close();
		
		
	}
	
	public static void Menu1 (ArrayList<Usuario> userList) {
		
		for (int i = 0; i < userList.size(); i++){
			System.out.println(userList.get(i).toString());
		}
		
	}
	
	public static void Menu2 (ArrayList<Usuario> userList) throws IOException{
		
		boolean enc = false;
		int listBusc = 0;
		
		System.out.print("Escribe el nombre de usuario: ");
		String nombUsu = sc.next();
		
		do {
			
		for (int i = 0; i < userList.size(); i++) {
			if (nombUsu.equalsIgnoreCase(userList.get(i).getNombreUsuario())) {
				enc = true;
				listBusc = i;
			}
		}
		
		if (enc == false) {
			System.out.print("Ese usuario no existe, vuelve a escribirlo: ");
			nombUsu = sc.next();
		}
		
		}while (enc == false);
		
		
		System.out.print("Escribe la contraseña: ");
		String contra = sc.next();
		
		while (!userList.get(listBusc).getContraseña().equals(contra)) {
			System.out.print("Contraseña incorrecta, vuelve a introducirla boludo: ");
			contra = sc.next();
		}
		
		userList.remove(listBusc);
		
		Guardar (userList);
		
	}
	
	public static void Menu3 (ArrayList<Usuario> userList) throws IOException{
		
		String [] active = {"si", "no"};
		boolean sionoBien = false;
		
		System.out.print("Escribe tu nombre: ");
		String nombre = sc.next();
		
		System.out.print("Escribe tu apellido: ");
		String apellido = sc.next();
		
		System.out.print("Escribe tu contraseña: ");
		String contraseña = sc.next();
		
		boolean contraseñaNum = false;
		do {
			
			if (contraseña.length() >= 5) {
				System.out.print("La contraseña solo puede tener 4 carácteres: ");
				contraseña = sc.next();
				
			}else if (contraseña.length() <= 4){
				contraseñaNum = true;
			}
			
		}while (contraseñaNum == false);
		
		System.out.print("Estás activo? ");
		String siono = sc.next();
		
		do {
		for (int i = 0; i < active.length; i++) {
			if (siono.equalsIgnoreCase(active[i])) {
				sionoBien = true;
			}
		}
		
		if (sionoBien == false) {
			System.out.print("Pon si o no: ");
			siono = sc.next();
		}
		
		}while (sionoBien == false);
		
		if (siono.equalsIgnoreCase("si")) {
			sionoBien = true;
		}else {
			sionoBien = false;
		}		
		
		Usuario usuario = new Usuario(userList.getLast().getId()+1, nombre, apellido, nombre+apellido, contraseña, sionoBien);
		userList.add(usuario);
		
		Guardar (userList);
	}

	public static void Menu4 (ArrayList<Usuario> userList) throws IOException{
		
		boolean idEnc = false;
		int usuarioPos = 0;
		
		System.out.print("Escribe tu id: ");
		int id = sc.nextInt();
		
		do {
		for (int i = 0; i < userList.size(); i++) {
			if (id == userList.get(i).getId()) {
				idEnc = true;
				usuarioPos = i;
			}
		}
		
		if (idEnc == false) {
			System.out.print("No se ha encontrado el id, vuelve a escribirlo: ");
			id = sc.nextInt();
		}
		}while (idEnc == false);
		
		System.out.println("Escribe la contraseña");
		String contraseña = sc.next();
		
		while (!contraseña.equals(userList.get(usuarioPos).getContraseña())) {
			
		}
		
	
	}
	
	public static void main(String[] args) throws IOException{
		
		File f = new File ("src/Usuarios/usuarios.txt");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<Usuario> userList = new ArrayList<Usuario>();
		
		String lector = "";
		String [] partes = new String[5];
		boolean activo = false;

		
		while ((lector = br.readLine()) != null) {
			
			partes = lector.split(":");
			
			if (Integer.parseInt(partes[4]) == 0) {
				activo = false;
				
			}else {
				activo = true;
			}
			
			Usuario usuario = new Usuario(Integer.parseInt(partes[0]), partes[1], partes[2], partes[1]+partes[2], partes[3], activo);		
			userList.add(usuario);
		}
		
		
		int opc = 0;
		
		do {
			
			
			System.out.println("=========MENÚ=========");
			System.out.println("1- Mostrar usuarios \n" + "2- Eliminar un usuario \n" + 
			"3- Crear un usuario \n" + "4- Editar un usuario \n" + "5- SALIR");
			System.out.println("======================");
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			

			switch (opc) {
			
			case 1:
				System.out.println("======================");
				Menu1 (userList);
			
			break;
			
			case 2:
				System.out.println("======================");
				Menu2 (userList);
				
				break;
			
			case 3:
				System.out.println("======================");
				Menu3 (userList);
				
				break;
			
			case 4:
				System.out.println("======================");
				
				
				break;
				
			case 5:
				System.out.println("======================");
				System.out.println("Fin del programa");
				
				break;
			
			}
			
			
		}while (opc != 5);
		
	}

}
