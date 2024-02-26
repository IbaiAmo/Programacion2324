package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import modelo.model.Pedidos;

public class pedidosModelo {

	public static Connection conexion() {
		
		String URI= "jdbc:mysql://localhost:3306/almacen";
		String usuario="root";
		String contrasenya="";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URI, usuario, contrasenya);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("No se ha podido conectar a la base de datos almacen");
		}
		
		
		return con;
	}
	
	
	public static ArrayList<Pedidos> mostrarPedidos (String yes, int cant){
		
		ArrayList<Pedidos>listaPedidos = new ArrayList<Pedidos>();
		Connection con = conexion();
		
		try {
			String sql= "";
			if (yes.equalsIgnoreCase("si")) {
				sql= "SELECT * FROM pedidos LIMIT " + cant;
			}else {
				sql= "SELECT * FROM pedidos";
			}
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String idCliente = rs.getString("idCliente");
				Date fecha = rs.getDate("fecha");
				String codPostal = rs.getString("codPostal");
				
				Pedidos pedido = new Pedidos(id, idCliente, fecha, codPostal);
				listaPedidos.add(pedido);		
			}
			
		}catch(SQLException e) {
			System.err.println("Error en el statement de listaPedidos().");
		}
		
		
		return listaPedidos;
	}
	
	
}
