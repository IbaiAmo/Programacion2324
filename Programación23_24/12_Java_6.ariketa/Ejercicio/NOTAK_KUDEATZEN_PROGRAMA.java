package Ejercicio;

import java.util.Scanner;

public class NOTAK_KUDEATZEN_PROGRAMA {

	public static void main(String[] args) {
		/*
		 * Programak erabiltzailea eta pasahitza eskatuko ditu. Pasahitzean “e” letra
		 * badago ERROR mezua erakutsiko da eta berriro erabiltzailea eta pasahitza
		 * eskatuko dira “e” letra pasahitzetik desagertu arte. (Erabili indexOf eta
		 * maiuskulak eta minuskulak kontutan izan)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu usuario: ");
		String usuario = sc.nextLine();

		System.out.print("Introduce tu contraseña: ");
		String cont = sc.nextLine();

		while (cont.contains("e") || cont.contains("E")) {

			System.out.println("ERROR, en la contraseña no puede haber \"e\", vuelve a escribirla.");
			System.out.print("Introduce tu contraseña: ");
			cont = sc.nextLine();

		}

		/* 1.- Notak sartu. Ikaslearen datuak (izena eta abizena) eskatuko ditu.
		 * Ondoren, nota finala kalkulatuko du formula hau erabiliz: 
		 * ● Hiru azterketa partzialen batez bestekoaren % 55a. 
		 * ● Azken azterketan lortutako notaren %30a. 
		 * ● Azken lanean lortutako notaren % 15a.
		 */

		System.out.println("------------------");
		System.out.print("Nombre y apellido: ");
		String nombre = sc.nextLine();
		
		double media_por = 0;
		
		for (int i = 1; i <=3; i++) {
			
			System.out.print("Nota del " + i + ". examen: ");
			double nota = sc.nextDouble();
			
			
			if(nota < 0 || nota > 10) {
				
				while (nota < 0 || nota > 10) {
					
					System.out.println("ERROR! La nota debe ser del 0 al 10.");
					System.out.print("Nota del " + i + ". examen: ");
					nota = sc.nextDouble();
				}
				
			}else {
				media_por = media_por + (nota*0.55);
			}
			
		}
		media_por = media_por / 3;
		
		System.out.print("Nota del examen final: ");
		double nota_final = sc.nextDouble();
		
		while (nota_final < 0 || nota_final > 10) {
			
			System.out.println("ERROR! La nota debe ser del 0 al 10.");
			System.out.println("Nota del examen final: ");
			nota_final = sc.nextDouble();
			
		}
		
		media_por += (nota_final*0.3);
		
		System.out.print("Nota del trabajo: ");
		double trabajo = sc.nextDouble();
		
		while (trabajo < 0 || trabajo > 10) {
			
			System.out.println("ERROR! La nota debe ser del 0 al 10.");
			System.out.println("Nota del trabajo: ");
			trabajo = sc.nextDouble();
			
		}
		
		media_por += trabajo*0.15;
		
		if (media_por >= 0 && media_por < 5) {
			
			System.out.println("La nota del alumno " + nombre + " es un " + (int) media_por + " --> Insuficiente");
			
		}else if (media_por >= 5 && media_por < 6) {
			
			System.out.println("La nota del alumno " + nombre + " es un " + (int) media_por + " --> Suficiente");
			
		}else if (media_por >= 6 && media_por < 7) {
			
			System.out.println("La nota del alumno " + nombre + " es un " + (int) media_por + " --> Bien");
			
		}else if (media_por >= 7 && media_por < 9) {
			
			System.out.println("La nota del alumno " + nombre + " es un " + (int) media_por + " --> Notable");
			
		}else if (media_por >= 9 && media_por <= 10) {
			
			System.out.println("La nota del alumno " + nombre + " es un " + (int) media_por + " --> Sobresaliente");
		}
		
		System.out.println("Muchas gracias! Hasta luego");
		
	}

}
