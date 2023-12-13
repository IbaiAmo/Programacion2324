package Ejercicio2_5;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Crear dos arrays arrHile y arrLitr. En el primero hay que guardar los meses
		 * de enero a mayo. Litros de lluvia en el segundo (123, 333,180,211,90). Por
		 * ejemplo: arrHile [0] -- enero
		 * 
		 * arrLitr [0] -- 123
		 * 
		 * Visualizar la cantidad de litros de lluvia que ha llovido cada mes.
		 * 
		 * Calcule cuál ha sido el mes más lluvioso. Visualizar mes y litros.
		 */

		String[] arrHile = { "Enero", "Febrero", "Marzo", "Abril", "Mayo" };
		int[] arrLitr = { 123, 333, 180, 211, 90 };
		int mayor = 0, mes = 0;

		for (int i = 0; i < arrHile.length; i++) {

			System.out.println("Litros de agua caídos en " + arrHile[i] + " : " + arrLitr[i] + " L");
			if (arrLitr[i] > mayor) {
				mayor = arrLitr[i];
				mes = i;

			}
		}
		System.out.println("-----------------------------------------");
		System.out.println("El mes más lluvioso es " + arrHile[mes] + ": " + mayor + " L");

	}

}
