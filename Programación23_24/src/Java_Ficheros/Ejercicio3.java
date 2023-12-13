package Java_Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static double retirarDinero (double[] saldo, int num) {
		
		Scanner sc = new Scanner (System.in);
		double dineroRestante = 0;
		
		System.out.print("Cuanto dinero quieres sacar? ");
		double retiro = sc.nextDouble();
		while (retiro < 0 || retiro > saldo[num]) {
			System.out.print("ERROR, introduce una cantidad que se pueda retirar: ");
			retiro = sc.nextDouble();
		}
		
		dineroRestante = saldo[num] - retiro;
		return Math.round(dineroRestante);
		
	}
	
	public static double depositarDinero(double[] saldo, int num) {
		
		Scanner sc = new Scanner (System.in);
		double dineroRestante = 0;
		
		System.out.print("Cuanto dinero quieres depositar? ");
		double deposito = sc.nextDouble();
		while (deposito <= 0) {
			System.out.print("ERROR, introduce una cantidad que se pueda depositar: ");
			deposito = sc.nextDouble();
		}
		
		dineroRestante = saldo[num] + deposito;
		return Math.round(dineroRestante);
		
		
	}
	
	public static String actualizar (int num, String[] nombre, String[] apellido) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cambia tu nombre:");
		System.out.println("-------------------");
		
			System.out.print(nombre[num] + " -----> ");
			String nom_nuevo = sc.next();
			nombre[num] = nom_nuevo;
			
			
			System.out.print(apellido[num] + " -----> ");
			String ape_nuevo = sc.next();
			apellido[num] = ape_nuevo;

		return "";
		
		
	}
	
	public static String guardar (String[] dni, String[] nombre, String[] apellido, double[] saldo) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/Java_Ficheros/bezeroak.txt"));
	
	
		
		for (int x = 0; x < dni.length; x++) {		
			
			bw.write(dni[x] +":" + nombre[x] + ":" +apellido[x] + ":" +saldo[x]+"\n");
			
		}
		
		bw.flush();
		bw.close();
		
		return "";
		
		
	}
	

	public static void main(String[] args) throws IOException{
		/*
		 * Tenemos información en un archivo con el formato 
		 * dni:nombre:apellido:saldo.
		 * Cargamos los datos de 5 clientes en 4 arrays diferentes y mostramos y
		 * desarrollamos un menú con las siguientes opciones (utilizando métodos para
		 * cada problema): 
		 * Retirar dinero: Pregunta al usuario cuánto dinero quiere retirar y actualiza la información del saldo. 
		 * Depositar dinero: Pregunta al usuario cuánto dinero quiere depositar y actualiza la información del saldo.
		 * Actualizar datos del usuario: Pide el nombre y apellido del usuario y actualiza la información del usuario. 
		 * Guardar: Guarda la información de los arrays en el archivo. 
		 * SALIR
		 */
		
		
		
		Scanner sc = new Scanner (System.in);
		
		File f = new File("src/Java_Ficheros/bezeroak.txt"); 
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader (fr);
		
		int i = 0;
		String[] partes;
		String linea ="";
		String [] dni = new String [5];
		String [] nombre = new String [5];
		String [] apellido = new String [5];
		double [] saldo = new double [5]; 
		while ((linea = br.readLine()) != null) {
			
			partes = linea.split(":");
			dni [i] = partes [0];
			nombre [i] = partes [1];
			apellido [i] = partes [2];
			saldo [i] = Double.parseDouble(partes [3]); //El parseDouble convierte el String en double si cumple con todo.
			i++;
			
		}
		
		
		
	
		
		int opc = 0;
		
		do {
			System.out.println("------MENU------");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Depositar dinero");
			System.out.println("3. Actualizar datos del usuario");
			System.out.println("4. Guardar");
			System.out.println("5. SALIR");
			
			
				
			System.out.print("Elige una opción: ");
			opc = sc.nextInt();
			
			while (opc < 1 || opc > 5) {
				System.out.print("pon un número entre 1-5: ");
				opc = sc.nextInt();
			}
			
			boolean enc = false;
			int num = 0;
			
			
			switch (opc) {

			case 1:
				System.out.println("------------------");	
				do {
					
					System.out.print("Pon tu DNI: ");
					String dni_user = sc.next();
					for (int x = 0; x < dni.length; x++) {
						
						if (dni[x].equals(dni_user)) {
							num = x;
							enc = true;
							break;
						}
						
					}
					
				}while (enc == false);
				saldo[num] = retirarDinero(saldo, num);
	            System.out.println("Nuevo saldo después de retirar dinero: " + saldo[num]);
//	            System.out.println(saldo[num]);      //Con esto podemos ver que se guarda en el array.
				
				break;

			case 2:
				System.out.println("------------------");
				do {
					
					System.out.print("Pon tu DNI: ");
					String dni_user = sc.next();
					for (int x = 0; x < dni.length; x++) {
						
						if (dni[x].equals(dni_user)) {
							num = x;
							enc = true;
							break;
						}
						
					}
					
				}while (enc == false);
				saldo[num] = depositarDinero(saldo, num);
	            System.out.println("Nuevo saldo después de depositar dinero: " + saldo[num]);
				
				break;

			case 3:
				
				System.out.println("------------------");	
				do {
					
					System.out.print("Pon tu DNI: ");
					String dni_user = sc.next();
					for (int x = 0; x < dni.length; x++) {
						
						if (dni[x].equals(dni_user)) {
							num = x;
							enc = true;
							break;
						}
						
					}
					
				}while (enc == false);
				actualizar (num, nombre, apellido);
				
				break;

			case 4:
				
				guardar (dni, nombre, apellido, saldo);
				
				
				break;
				
			case 5:
				System.out.println("-------------------");
				System.out.println("Fin del programa");
				
				break;
				
			}
			
			
		
		}while (opc != 5);
		
	}
}


