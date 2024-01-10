package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10 ; i++) {
			System.out.print("Añade un número: ");
			int num = sc.nextInt();
			numeros.add(num);
			
		}
		
		System.out.print("Qué número quieres buscar? ");
		int busc = sc.nextInt();
		
		for (int x = 0; x < numeros.size(); x++) {
			
			if (numeros.get(x) == busc) {
				
				System.out.println("El " + busc + " se encuentra en el arraylist en la posición " + x);
				
			}
			
		}
		
	}

}
