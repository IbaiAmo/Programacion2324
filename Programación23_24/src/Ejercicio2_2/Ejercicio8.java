package Ejercicio2_2;
import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir una letra y decir y es vocal o no.
		
		String a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce una letra: ");
		a = scan.next();
		if (a.equalsIgnoreCase("a")|| a.equalsIgnoreCase("e")|| a.equalsIgnoreCase("i")|| a.equalsIgnoreCase("o")|| 
				a.equalsIgnoreCase("u")){
			System.out.println(a + " es una vocal");
		}else {
			System.out.println(a + " es una consonante");
		}
		
		
		
	}

}
