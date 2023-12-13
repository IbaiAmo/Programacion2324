package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Visualizar un menú, con las opciones 1,2,3 , si el usuario introduce 4 terminar programa visualizando “ADIOS”, 
		 * sino visualizar un mensaje diciendo la opción que ha seleccionado el usuario.
		 */

		Scanner scan = new Scanner(System.in);		
		
		int a;
		System.out.println("MENÚ DE OPCIONES");
		System.out.println("1. Múltiplo de 3");
		System.out.println("2. Fibonacci");
		System.out.println("3. Factorial");
		System.out.println("4. Terminar");
		System.out.print("Introduce un número: ");
		a = scan.nextInt();
		
		while (a < 1 || a > 4) {
			System.out.print("Introduce bien el número: ");
			a = scan.nextInt();
		}
		
		switch (a) {
		
		case 1:
			System.out.println("---------------------");
			System.out.println("Múltiplo de 3");
			System.out.print("Introduce un número y te digo si es múltiplo de 3: ");
			int b = scan.nextInt();
			if (b %3 == 0) {
				System.out.println(b + " sí es múltiplo de 3");
			}else {
				System.out.println(b + " no es múltiplo de 3");
			}
			
			break;
			
		case 2:
			System.out.println("---------------------");
			System.out.println("Fibonacci");
			System.out.println("Escribe la cantidad de números que quieras que");
			System.out.print("aparezcan de la serie de fibonacci: ");
			int n = scan.nextInt();			
	        int z = 0;
	        int p = 1;
	        int c;

	        System.out.print(z + " " + p + " ");    

	        for (int i = 2; i < n; i++) {       
	            c = z + p;                        
	            System.out.print(c + " ");			
	            z = p;
	            p = c;
	        }
			
			break;
			
			
		case 3:
			System.out.println("---------------------");
			System.out.println("Factorial");
			int num , fact = 0;
			System.out.print("Pon un número: ");
			num = scan.nextInt();
			int v = num;
			for (int i = num-1; i >0; i--) {
				fact = i * num;
				num = fact;
			}
			
				System.out.println("El factorial de " + v + "! es: " + fact);
			
			break;
	
	
		case 4:
			System.out.println("ADIÓS");
	
			break;
		
		
		
		
		
		}
		
		
	}

}


