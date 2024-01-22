package herencia;

public class Marino extends Animal{
	
	private int distanciaNadar;

	public Marino(String nombre, String descripcion, int edad, int distanciaNadar) {
		super(nombre, descripcion, edad);
		this.distanciaNadar = distanciaNadar;
	}

	public int getDistanciaNadar() {
		return distanciaNadar;
	}

	public void setDistanciaNadar(int distanciaNadar) {
		this.distanciaNadar = distanciaNadar;
	}

	@Override
	public String toString() {
		return "Marino [distanciaNadar=" + distanciaNadar + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", getEdad()=" + getEdad() + "]";
	}




	
	

}
