package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.model.Clientes;

public class clientesModelo {

	
	public static Connection conexion() {
		
		String URI= "jdbc:mysql://localhost:3306/almacen";
		String usuario="root";
		String contrasenya = "";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URI, usuario, contrasenya);
		} catch (SQLException e) {
			System.err.println("Error al conectarse a la base de datos");
		}
		
		return con;
	}
	
	
	public static ArrayList<Clientes> mostrarClientes(String yes, int cant) {
		ArrayList<Clientes>listaClientes = new ArrayList<Clientes>();
		Connection con = conexion();
		
		try {
			String sql= "";
			if (yes.equalsIgnoreCase("si")) {
				sql= "SELECT * FROM clientes LIMIT " + cant;
			}else {
				sql= "SELECT * FROM clientes";
			}
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String codPostal = rs.getString("codPostal");
				String telefono = rs.getString("telefono");
				
				Clientes c = new Clientes(id, nombre, direccion, codPostal, telefono);
				listaClientes.add(c);
			}
			
		}catch(SQLException e) {
			System.err.println("La Sentencia no se ha podido ejecutar");
		}
		
		
		return listaClientes;
	}
	
	
	
	
	
	
}
