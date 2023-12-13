package Ejercicio2_6;

import java.util.Scanner;

public class Repaso {
	
	public static int sumaTodos (int[] arrayNum) {
		
		int resul = 0;
		for (int i = 0; i<arrayNum.length;i++) {
			resul += arrayNum[i];
		}
		
		return resul;
	}
	
	public static int sumaInpares (int[] arrayNum) {
		
		int resul = 0;
		for (int i = 0; i<arrayNum.length;i++) {
			if (arrayNum[i] %2==1) {
				resul+=arrayNum[i];
			}
		}
		
		return resul;
	}
	
	public static int sumaPares (int[] arrayNum) {
		
		int resul = 0;
		for (int i = 0; i<arrayNum.length;i++) {
			if (arrayNum[i] %2==0) {
				resul+=arrayNum[i];
			}
		}
		
		return resul;
	}
	
	public static int media (int[] arrayNum) {
		return sumaTodos(arrayNum)/arrayNum.length;
	}
	
	public static double mediaInp (int[] arrayNum) {
		
		int numInp = 0;
		
		for (int i = 0; i < arrayNum.length;i++) {
			if (arrayNum[i] %2 == 1) {
				numInp += 1;
			}
		}
		
		return (double) sumaInpares(arrayNum)/numInp;
	}
	
	public static double mediaPar (int[] arrayNum) {
		
		int numPar = 0;
		
		for (int i = 0; i < arrayNum.length;i++) {
			if (arrayNum[i] %2 == 0) {
				numPar += 1;
			}
		}
		
		return (double) sumaPares(arrayNum)/numPar;
	}
	
	public static String numeros (int[] arrayNum) {
		
		String nums = "";
		
		for (int i = 0; i < arrayNum.length;i++) {
			if (arrayNum[i] >=45 && arrayNum[i]<= 60) {
				nums += arrayNum[i] + " ";
			}
		}
		
		return nums;
	}
	
	public static int mult (int[] arrayNum) {
		
		int mult = 1;
		for (int i = 11; i < arrayNum.length;i++) {
			
			mult = mult * arrayNum[i];
			}
		
		
		return mult;
	}
	
	public static int mult2 (int[] arrayNum) {
		
		int mult = 1;
		for (int i = 10; i <= 20;i++) {
			
			mult = mult * arrayNum[i];
			}
		
		
		return mult;
	}
	
	
	

	public static void main(String[] args) {
		/*
		 * Visualizar el siguiente menú utilizando métodos para cada opción.
		 * 
		 * 
		 * Menú:
		 * 
		 * 1. Calcular la suma de todos los números del array.
		 * 
		 * 2. Calcular la suma de todos los números impares del array.
		 * 
		 * 3. Calcular la suma de todos los números pares del array.
		 * 
		 * 4. Calcular la media de todos los números del array.
		 * 
		 * 5. Calcular la media de todos los números impares del array.
		 * 
		 * 6. Calcular la media de todos los números pares del array.
		 * 
		 * 7. Visualizar los números que están entre 45 y 60.
		 * 
		 * 8. Calcular la multiplicación de los 10 últimos números.
		 * 
		 * 9. Calcular la multiplicación de los números de la posición 10-20.
		 * 
		 * 10. SALIR
		 */

		Scanner sc = new Scanner(System.in);

		int[] arrayNum = {2, 23, 43, 12, 6, 77, 80, 111, 56, 5, 80, 235, 55, 69, 9, 0, 71, 24, 124, 88, 67};

		System.out.println("     Menú");
		System.out.println("---------------");
		System.out.println("1. Calcular la suma de todos los números del array.");
		System.out.println("2. Calcular la suma de todos los números impares del array.");
		System.out.println("3. Calcular la suma de todos los números pares del array.");
		System.out.println("4. Calcular la media de todos los números del array.");
		System.out.println("5. Calcular la media de todos los números impares del array.");
		System.out.println("6. Calcular la media de todos los números pares del array.");
		System.out.println("7. Visualizar los números que están entre 45 y 60.");
		System.out.println("8. Calcular la multiplicación de los 10 últimos números.");
		System.out.println("9. Calcular la multiplicación de los números de la posición 10-20.");
		System.out.println("10. SALIR");
		
		
		System.out.print("Elige una opción: ");
		int opc = sc.nextInt();
		
		while(opc < 1 || opc > 10 ) {
			System.out.print("ERROR, elige bien (1-10): ");
			opc = sc.nextInt();
		}
		

		switch (opc) {

		case 1:
			System.out.println("----------------------");
			System.out.println("Calcular la suma de todos los números del array.");
			System.out.println("Resultado= " + sumaTodos(arrayNum));
			
			break;

		case 2:
			System.out.println("----------------------");
			System.out.println("Calcular la suma de todos los números impares del array.");
			System.out.println("Resultado= " + sumaInpares(arrayNum));
			break;

		case 3:
			System.out.println("----------------------");
			System.out.println("Calcular la suma de todos los números pares del array.");
			System.out.println("Resultado= " + sumaPares(arrayNum));
			
			break;

		case 4:
			System.out.println("----------------------");
			System.out.println("Calcular la media de todos los números del array.");
			
			System.out.println("Media= " + media(arrayNum));
			break;

		case 5:
			System.out.println("----------------------");
			System.out.println("Calcular la media de todos los números impares del array.");
			System.out.println("Media= " + mediaInp (arrayNum));
			break;

		case 6:
			System.out.println("----------------------");
			System.out.println("Calcular la media de todos los números pares del array.");
			System.out.println("Media= " + mediaPar (arrayNum) );
			break;

		case 7:
			System.out.println("----------------------");
			System.out.println("Visualizar los números que están entre 45 y 60.");
			System.out.println(numeros (arrayNum));
			
			
			break;

		case 8:
			System.out.println("----------------------");
			System.out.println("Calcular la multiplicación de los 10 últimos números.");
			System.out.println("Resultado= " + mult (arrayNum));
			break;

		case 9:
			System.out.println("----------------------");
			System.out.println("Calcular la multiplicación de los números de la posición 10-20.");
			System.out.println("Resultado= " + mult2 (arrayNum));
			break;

		case 10:
			System.out.println("----------------------");
			System.out.println("Fin del programa");
			
			break;
		}

	}

}
