package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.model.Empleado;
import modelo.model.Futbolista;

public class Futbol {

	
private static Connection conexion() {
		
		String URI="jdbc:mysql://localhost:3306/futbol";
		String usuario="root";
		String contrasenya= "";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URI, usuario, contrasenya);
		} catch (SQLException e) {
			System.err.println("Error al conectarse a la base de datos");	
		}
		
		return con;
	}

public static ArrayList<Futbolista> getFutbolistas(){
	ArrayList<Futbolista> futbolistas=new ArrayList<Futbolista>();
	Connection con=conexion();
	
	try {
		Statement st=con.createStatement();
		String sql = "SELECT * FROM futbolistas";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			String dni = rs.getString("dni");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			int salario = rs.getInt("salario");
			int idEquipo = rs.getInt("idEquipo");
			Futbolista f = new Futbolista(dni, nombre, apellido, salario, idEquipo);
			futbolistas.add(f);
		}
		
	} catch (SQLException e) {
		System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
	}
	
	return futbolistas;
}
	
	
	
	
}
