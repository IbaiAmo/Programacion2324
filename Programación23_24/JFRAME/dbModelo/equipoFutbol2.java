package dbModelo;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbClases.Equipo2;

public class equipoFutbol2 {

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
	
	
	public static ArrayList<Equipo2> verEquipos() {
		
		ArrayList<Equipo2> equipos = new ArrayList<Equipo2>();
		Connection con = conexion();
		Equipo2 equipo = null;
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM equipos";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int idEquipo = rs.getInt("idEquipo");
				String nombre = rs.getString("nombre");
				String ciudad = rs.getString("ciudad");
				equipo = new Equipo2(idEquipo, nombre, ciudad);
				equipos.add(equipo);
			}

		}catch (SQLException e) {
			System.err.println("Error en el Statement de verEquipos(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return equipos;
		
	}
	
	public static void insEquipo(String nombre, String ciudad) {
		
		ArrayList<Equipo2> equipos2 = verEquipos();
		Connection con = conexion();
		
		try {
			Statement st = con.createStatement();
			String sql = "INSERT INTO equipos (idEquipo,nombre,ciudad) VALUES (" + (equipos2.size()+1) + ",'" + nombre + "','" + ciudad + "')";
			st.execute(sql);
			
		}catch (SQLException e) {
			System.err.println("Error en el Statement de insEquipo(nombre, ciudad). No se ha podido conseguir el ejecutable del sql");
		}
		
		
		
	}
	
	public static String verEquipoxid(int eid) {
		
		Connection con = conexion();
		Equipo2 equipo = null;
		String texto = null;
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM equipos WHERE idEquipo= " + eid;
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				int idEquipo = rs.getInt("idEquipo");
				String nombre = rs.getString("nombre");
				String ciudad = rs.getString("ciudad");
				equipo = new Equipo2(idEquipo ,nombre, ciudad);		
			}
			texto = equipo.toString();

			
		}catch (SQLException e) {
			System.err.println("Error en el Statement de verEquipoxid(eid). No se ha podido conseguir el ejecutable del sql");
		}
		return texto;
	}
	
	
	
}
