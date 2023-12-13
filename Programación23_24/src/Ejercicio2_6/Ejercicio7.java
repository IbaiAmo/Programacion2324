package Ejercicio2_6;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// En un main utilizar esPrimo para visualizar en pantalla todos los número primos del 1 al 500 en una línea.

		
//		boolean es = true;
//		int num = 0;
//		
//		for (int i = 500; i > 1; i--) {
//			
//		num += 1;
//			
//		
//			if (num % i == 0) {
//				es = false;
//			}
//			
//		}
		
		
		imprimirPrimosHasta500();
	     
	    }

	    public static void imprimirPrimosHasta500() {
	        for (int i = 2; i <= 500; i++) {
	            if (esPrimo(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static boolean esPrimo(int numero) {
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}