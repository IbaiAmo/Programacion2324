package herencia;

public class Terrestre extends Animal{
	private int km;

	public Terrestre(String nombre, String descripcion, int edad, int km) {
		super(nombre, descripcion, edad);
		this.km = km;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Terrestre [km=" + km + ", getNombre()=" + getNombre() + ", getDescripcion()=" + getDescripcion()
				+ ", getEdad()=" + getEdad() + "]";
	}

	
	

}
