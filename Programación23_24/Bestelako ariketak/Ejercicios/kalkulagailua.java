package Ejercicios;
import java.util.Scanner;

public class kalkulagailua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Bienvenido " + nombre + " a la calculadora. Introduce los siguientes valores:");
		System.out.print("Primer número: ");
		int a = sc.nextInt();
		
		System.out.print("Segundo número: ");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " x " + b + " = " + (a*b));
		System.out.println(a + " : " + b + " = " + ((double) a/b));
		
		
	}

}
