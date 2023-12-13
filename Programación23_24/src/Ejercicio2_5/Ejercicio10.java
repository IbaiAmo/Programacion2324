package Ejercicio2_5;



public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Tomando como dato el nombre y la edad del alumnado del aula, se pretende
		 * visualizar la siguiente información:
		 * 
		 * Número de alumnos/as de 20 o menos años.
		 * 
		 * Edad media de la clase.
		 * 
		 * El alumno más joven de la clase y su nombre
		 */
		
		String[] nombres = {
			    "Ana", "Luis", "Sofia", "Carlos", "Marta", "Alejandro", "Laura", "Diego",
			    "Paula", "Daniel", "Valeria", "Javier", "Isabel", "Juan", "Maria", "Alberto",
			    "Carla", "Ricardo", "Elena", "Miguel", "Patricia", "Pablo", "Raquel"
			};

			int[] edades = {
			    23, 20, 25, 19, 22, 24, 18, 28, 21, 26, 17, 27, 23, 25, 20, 18, 24, 22, 27, 19, 28, 21, 26
			};
			
			int num_Alumnos = 0, media= 0;
			int menor = Integer.MAX_VALUE;
			int menor_Alumno = 0;
			
			for (int i = 0; i < edades.length; i++) {
				
				if (edades[i] <= 20) {
					num_Alumnos++;
				}
				media += edades[i];
				
				if (edades[i]< menor) {
					menor = edades[i];
					menor_Alumno = i;
				}
				
			}
			
			System.out.println("Número de alumnos de 20 o menos años: " + num_Alumnos);
			System.out.println("Edad media de la clase: " + (media/edades.length));
			System.out.println("El alumno más joven de la clase: " + nombres[menor_Alumno] + " (" + menor + " años)");
			
			
			
	}

	}

