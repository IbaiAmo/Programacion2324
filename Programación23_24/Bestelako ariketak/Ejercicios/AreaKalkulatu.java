package Ejercicios;
import java.util.Scanner;

public class AreaKalkulatu {

	public static void main(String[] args) {
		/*Programa honetan areak kalkulatuko dira (zirkulua, karratua, lauki zuzena eta
		 * laukia). Horretarako erabiltzaileari beharrezkoak diren datuak eskatuko
		 * zaizkio.
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Circulo");
		System.out.print("Introduce el radio: ");
		int a = sc.nextInt();
		System.out.println("Área: " + ((a*a) *Math.PI)+ " m2");
		System.out.println("*****************************");
		
		System.out.println("Cuadrado");
		System.out.print("Introduce el valor del lado: ");
		int b = sc.nextInt();
		System.out.println("Área: " + (b*b) + " m2");
		System.out.println("*****************************");
		
		System.out.println("Rectángulo");
		System.out.print("Introduce el valor del lado corto: ");
		int c = sc.nextInt();
		System.out.print("Introduce el valor del lado largo: ");
		int c2 = sc.nextInt();
		System.out.println("Área: " + (c*c2)+ " m2");
		System.out.println("*****************************");
		
		System.out.println("Triángulo");
		System.out.print("Introduce el valor del suelo: ");
		int d = sc.nextInt();
		System.out.print("Introduce el valor de la altura: ");
		int d2 = sc.nextInt();
		System.out.println("Área: " + ((d*d2) /2)+ " m2");
		
		
	}

}
