package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.model.Equipo;

public class equipoFutbol {

	public static Connection conexion() {
		
		String URI = "jdbc:mysql://localhost:3306/futbol";
		String usuario = "root";
		String contrasenya = "";
		Connection con =null;
		
		try {
			con = DriverManager.getConnection(URI, usuario, contrasenya);
		}catch (SQLException e) {
			System.err.println("Error al conectarse a la base de datos");
		}
		
		return con;
	}
	
	
	public static void verEquipos() {
		
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		Connection con = conexion();
		Equipo equipo = null;
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM equipos";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int idEquipo = rs.getInt("idEquipo");
				String nombre = rs.getString("nombre");
				String ciudad = rs.getString("ciudad");
				equipo = new Equipo(idEquipo, nombre, ciudad);
				equipos.add(equipo);
			}
			for (int i = 0; i < equipos.size(); i++) {
				System.out.println(equipos.get(i));
			}
			System.out.print("\n");
		}catch (SQLException e) {
			System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
		}
		
		
	}
	
	
	
	
	
}
