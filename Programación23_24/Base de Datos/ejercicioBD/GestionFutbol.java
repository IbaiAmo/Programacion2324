package ejercicioBD;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.db.Futbol;
import modelo.model.Futbolista;

public class GestionFutbol {
	
	public static Scanner sc = new Scanner(System.in);

	public static void Menu1() {
		ArrayList<Futbolista> futbolistas = Futbol.getFutbolistas();
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Futbolista> futbolistas = Futbol.getFutbolistas();
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
		
		
		
	}

}
