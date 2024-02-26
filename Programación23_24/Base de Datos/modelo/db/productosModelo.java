package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.model.Productos;

public class productosModelo {

	public static Connection conexion() {
		
		String URI= "jdbc:mysql://localhost:3306/almacen";
		String usuarion="root";
		String contrasenya="";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URI, usuarion, contrasenya);
		}catch(SQLException e) {
			System.err.println("Error al conectarse a la Base de datos");
		}

		return con;
	}
	
	
	public static ArrayList<Productos> mostrarProductos(String yes, int cant) {
		
		ArrayList<Productos>listaProductos = new ArrayList<Productos>();
		
		Connection con = conexion();
		
		try {
			String sql= "SELECT * FROM productos";
			if (yes.equalsIgnoreCase("si")) {
				sql= "SELECT * FROM productos LIMIT " + cant;
			}
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String proveedor = rs.getString("proveedor");
				double precio = rs.getDouble("precio");
				int existencias = rs.getInt("existencias");
				
				Productos p = new Productos(id, nombre, proveedor, precio, existencias);
				listaProductos.add(p);	
			}
			
		}catch(SQLException e) {
			System.err.println("Error en el Statement de mostrarProductos().");
		}
		
		return listaProductos;
	}
	
	
}
