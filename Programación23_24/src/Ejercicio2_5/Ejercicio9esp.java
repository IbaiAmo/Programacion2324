package Ejercicio2_5;

public class Ejercicio9esp {

	public static void main(String[] args) {
		/*
		 * Como dato de entrada tenemos la temperatura diaria de la semana en Cº. Como
		 * resultado queremos: Temperatura media semanal en °F. 
		 * El día más caluroso Y
		 * los nombres de los días que han superado la media.
		 */

		int[] temperaturas = { 20, 22, 25, 19, 23, 26, 21 };

		String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		float sum_Media = 0;
		int mayor = Integer.MIN_VALUE, dia = 0, dia_Media = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			sum_Media += temperaturas[i];

			if (temperaturas[i] > mayor) {
				mayor = temperaturas[i];
				dia = i;
			}

		}

		System.out.println("Temperatura media semanal en ªF: " + (((sum_Media / 7) * 9 / 5) + 32) + "°F ("+ (sum_Media / 7) + "°C)");
		System.out.println("El día más caluroso: " + diasSemana[dia] + " = " + mayor + "°C");
		System.out.println("Días que han superado la media:");

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > (sum_Media / 7)) {
				dia_Media = i;

				System.out.println("- " + diasSemana[dia_Media] + " (" + temperaturas[dia_Media] + "°C)");

			}

		}

	}

}
