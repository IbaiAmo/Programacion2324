package modelo.model;

public class Equipo {

	private int idEquipo;
	private String nombre;
	private String ciudad;
	
	public Equipo(int idEquipo, String nombre, String ciudad) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
	
	
	
}
