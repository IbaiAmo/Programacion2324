package Ejercicio2_1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir al usuario que introduzca su nombre y  visualizar ese mensaje en pantalla.
		
		String nombre;
		Scanner scan = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		nombre = scan.nextLine();
		System.out.print(nombre);
	}

}
