package Ejercicio2_3;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa, que pida un número, y visualice la tabla de multiplicación correspondiente de 1 a 10.
		
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Pon un número: ");
		a = scan.nextInt();
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println(i + " x " + a + " = " + i*a);
			
		}
		
		
	}

}
