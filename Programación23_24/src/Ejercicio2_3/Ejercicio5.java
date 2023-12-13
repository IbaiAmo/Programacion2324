package Ejercicio2_3;



public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que imprima los números pares positivos 
		 * menores o iguales que 20 en orden descendiente. (Utilizando for y while)
		 */
		
		int i = 20;
		System.out.print("20 ");
		while (i >= 0) {
			i = i - 1;
			if (i % 2 == 0) {
				System.out.print(i + " ");
				
			}
		}
		
		
		
	}

}
