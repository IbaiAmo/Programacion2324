package Usuarios;

import java.util.Scanner;

public class GestionUsuarios {
	
	public static Scanner sc = new Scanner (System.in);
	
	

	public static void main(String[] args) {
		
		
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
			
			
			break;
			
			case 2:
				System.out.println("======================");
				
				
				break;
			
			case 3:
				System.out.println("======================");
				
				
				break;
			
			case 4:
				System.out.println("======================");
				
				
				break;
				
			case 5:
				System.out.println("======================");
				
				
				break;
			
			}
			
			
		}while (opc != 5);
		
	}

}
