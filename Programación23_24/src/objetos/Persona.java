package objetos;

public class Persona {
	private String Dni;
	private String nombre;
	private String apellido;

	public Persona(String dni, String nombre, String apellido) {
		super();
		Dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	public String toString() {
		return "Persona [Dni=" + Dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
}
