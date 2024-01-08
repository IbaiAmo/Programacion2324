package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Persona[] listaPersonas = new Persona[3];
		
		for (int i = 0; i < listaPersonas.length; i++) {
			System.out.println("Persona " + i);
			System.out.print("Introduce tu dni: ");
			String dni = sc.next();
			System.out.print("introduce tu nombre: ");
			String nombre = sc.next();
			System.out.print("introduce tu apellido: ");
			String apellido = sc.next();
			
			Persona p = new Persona (dni, nombre, apellido);
			listaPersonas[i] = p;
		}
		
//		ArrayList
//			ArrayList<Persona> listaPersonas1= new ArrayList<Persona>();
//			for (int i=0; i<3; i++) {
//				System.out.println("Persona "+i+":");
//				System.out.println("DNI:");
//				String dni=sc.next();
//				System.out.println("Nombre:");
//				String nombre=sc.next();
//				System.out.println("Apellido:");
//				String apellido=sc.next();
//				Persona p= new Persona(dni,nombre, apellido);
//				listaPersonas1.add(p);
//			}
//			System.out.println(listaPersonas);
//			for (int i = 0; i < listaPersonas1.size(); i++) {
//				System.out.println(listaPersonas1.get(i));
//			}
//		}
		
		
		for (int x = 0; x < listaPersonas.length; x++) {				
			System.out.println(listaPersonas[x]);
		}
		
		
	}

}
