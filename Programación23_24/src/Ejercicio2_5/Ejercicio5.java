package Ejercicio2_5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definir el array de 5 longitudes y rellenarlo con los nombres. Luego, sacar de la pantalla los nombres que empiezan por la a.

		String[] nombres = new String[5];
		nombres[0]= "ibai";
		nombres[1]= "Anton";
		nombres[2]= "Ismael";
		nombres[3]= "Aimar";
		nombres[4]= "ayer";
		
		
		
		for (int i = 0; i < nombres.length ; i++) {
			
			
			if (nombres[i].toLowerCase().charAt(0) == 'a') {    //Como no se puede usar el IgnoreCase he puesto asi, dos igualaciones
				System.out.println(nombres[i]);
			}
			
		}
		
		
		
	}

}
