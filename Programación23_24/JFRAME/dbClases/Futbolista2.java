package dbClases;

public class Futbolista2 {

	private String dni;
	private String nombre;
	private String apellido;
	private int salario;
	private int idEquipo;
	
	public Futbolista2(String dni, String nombre, String apellido, int salario, int idEquipo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.idEquipo = idEquipo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", idEquipo=" + idEquipo + "]";
	}
	
	
	
	
	
	
}
