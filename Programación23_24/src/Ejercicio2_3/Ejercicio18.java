package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir números hasta que el usuario introduzca 0 y visualizar la media de los números introducidos.
		
		Scanner scan = new Scanner(System.in);
		
		//Todas estas variables tienen su función
		
		float a;		  //Aquí guardamos los números que pongamos
		float b = 0;      //Esto es para guardar la suma de los números que pongamos
		int c = 0;		  //esta es para la saber la cantidad de números que hay para luego hacer la media
		float p = 1;	  //esta es para entrar y luego salir del bucle while
		float l = 0;	  //Esta es para guardar los números y hacer la suma para luego pasarlo a la variable "b"
		while (p!=0) {
			
			System.out.print("Pon un número: ");
			a = scan.nextFloat();
			
			if (a!= 0) {
				l = l + a;			//Si la variable "a" no es 0 se suma y se guarda en la variable "l"
				b = l;				//Luego la paso a la variable "b"
				c++;				//Aquí sumo la variable "c" y sé la cantidad de números que se meten hasta que pongamos 0
			}
			
			if (a==0) {
				p = a;
			}
		}
		
		System.out.println("La media de los números es: " + (b/c));
		
	}

}
