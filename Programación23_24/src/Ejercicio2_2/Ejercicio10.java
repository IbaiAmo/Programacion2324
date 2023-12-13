package Ejercicio2_2;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir tres números, una mayor que otra, si el usuario introduce menor o igual
		/*visualizar mensaje de ERROR.
		/*/
		
		int a , b , c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		System.out.print("Introduce un número mayor: ");
		b = scan.nextInt();
		System.out.print("Introduce un número mayor: ");
		c = scan.nextInt();
		if (a < b && b < c){
			System.out.println("Bien hecho: " + a + " , " + b + " , " + c);
		 
	} else {
		System.out.println("ERROR");
	}

}
}