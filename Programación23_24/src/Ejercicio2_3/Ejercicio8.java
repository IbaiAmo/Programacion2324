package Ejercicio2_3;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa  que imprima la suma de los números impares que están entre 30 y 50.
		 */
		
		int a = 30;
		int i = 0;
		
		while (a <48) {
			a = a +1;
			if (a % 2 == 1) {
				System.out.print(a + " + ");   //Aquí hago que aparezcan los números impares para la suma
				i = a + i;
			}
			
			
		}
		while (a <50) {
			a = a +1;                  //y aquí hago la operación
			if (a % 2 == 1) {
				i = a + i;
			}
			
			
		}
		System.out.print("49 ");
		System.out.print("= " + i);
		
		
	}

}
