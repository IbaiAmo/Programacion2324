package modelo.model;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private String departamento;
	private double salario;

	public Empleado(int id, String nombre, String apellido, String departamento, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}

}
