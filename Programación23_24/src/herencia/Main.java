package herencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Animal a1 = new Marino(null, null, 0, 0);
		Marino tiburon = new Marino("tiburon", null, 0, 0);
		Terrestre gato = new Terrestre("gato", null, 0, 0);
		
		ArrayList<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(tiburon);
		listaAnimales.add(gato);

		System.out.println("Qué animales hay?");
		for(int i = 0; i < listaAnimales.size(); i++) {
			System.out.println(listaAnimales.get(i));
		}
		
		if (tiburon instanceof Marino) {
			System.out.println("Animal marino");
		}
		
		
	}

}
