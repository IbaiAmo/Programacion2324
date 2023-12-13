package Ejercicio2_3;



public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que imprima la suma de todos los números pares que están entre 1 y 100 e imprima cuántos hay.
		
		int a = 0;
		int b = 0;
		int s = 0;
		for (int i = 1; i <=100; i++) {      //Esto es la operación para la suma de los números pares
			
			if (i %2 == 0) {
				
				s++;
				a = i + a;
			}
			
		}
		while (b < 99) {      //Esto es solo para que aparezcan los números pares en forma de suma
			b++;
			if (b % 2 == 0) {
				System.out.print(b + " + ");
			}
		}
		
		System.out.print("100 = ");
		System.out.println(a);
		System.out.println("Números pares que hay: " + s);
		
	}

}
