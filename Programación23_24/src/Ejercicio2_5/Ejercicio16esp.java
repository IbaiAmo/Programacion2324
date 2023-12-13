package Ejercicio2_5;

public class Ejercicio16esp {

	public static void main(String[] args) {
		/* Primitiva, sacar 6 números diferentes aleatorios del 1 al 49. */
		
		System.out.println("PRIMITIVA");
		
		System.out.println("---------");
		System.out.print("Los números premiados son: ");
		
		for (int i = 0 ; i < 6 ; i++) {
			
			int loteria = (int) (Math.random()*49+1);
			System.out.print(loteria + " ");
			
			
		}

	}

}
