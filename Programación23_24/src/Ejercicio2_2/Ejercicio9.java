package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pedir el usuario y la contraseña y decir si el login está bien. (usuario: ikaslea contraseña: ik1920)
		 */
		
		String a , b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el usuario: ");
		a = scan.next();
		System.out.print("Introduce la contraseña: ");
		b = scan.next();
		if (a.equals("ikaslea")){
			System.out.println("El usuario es correcto");

		}else if ((!(a.equals("ikaslea")))){
			System.out.println("Ese no es el usuario");
		}
		if (b.equals("ik1920")) {
			System.out.println("La contraseña es correcta");
	
		} else if ((!(b.equals("ik1920")))){
			System.out.println("Esa no es la contraseña");
		}
		
		
		
		
	}

}
