package Usuarios;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	private String nombreUsuario;
	private String contraseña;
	private boolean activo;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nombre, String apellido, String nombreUsuario, String contraseña, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.activo = activo;
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

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nombreUsuario="
				+ nombreUsuario + ", contraseña=" + contraseña + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
