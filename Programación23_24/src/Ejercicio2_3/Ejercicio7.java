package Ejercicio2_3;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa  que imprima la suma de los números que están entre 30 y 50.
		*/
		int a = 0;
		int i = 29;
		
		while (i<=48) {
			i++;
			System.out.print(i + " + ");
		}
		for (i = 30; i<=50; i++) {
			a = a + i;
		}
		System.out.print("50");
		System.out.print(" = " +a);
	}

}
