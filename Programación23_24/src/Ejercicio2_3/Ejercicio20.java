package Ejercicio2_3;


public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Visualizar los 10 primeros números de la serie Fibonacci. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
		
		int n = 10; // Número de términos de la serie Fibonacci que quieres generar
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");    //Escribimos los dos primeros números

        for (int i = 2; i < n; i++) {        //La variable "i" es 2 porque ya hemos puesto los dos primeros números
            c = a + b;                        //La variable "c" va a guardar la suma de las dos variables
            System.out.print(c + " ");			//Y aquí escribimos la suma
            a = b;
            b = c;
        }
		
		
	}

}
