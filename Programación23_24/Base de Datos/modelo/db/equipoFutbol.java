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
	
	
	public static ArrayList<Equipo> verEquipos() {
		
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

		}catch (SQLException e) {
			System.err.println("Error en el Statement de verEquipos(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return equipos;
		
	}
	
	public static void insEquipo(String nombre, String ciudad) {
		
		ArrayList<Equipo> equipos2 = verEquipos();
		Connection con = conexion();
		
		try {
			Statement st = con.createStatement();
			String sql = "INSERT INTO equipos (idEquipo,nombre,ciudad) VALUES (" + equipos2.size()+1 + ",'" + nombre + "','" + ciudad + "')";
			st.execute(sql);
			
		}catch (SQLException e) {
			System.err.println("Error en el Statement de insEquipo(nombre, ciudad). No se ha podido conseguir el ejecutable del sql");
		}
		
		
		
	}
	
	public static void verEquipoxid(int eid) {
		
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		Connection con = conexion();
		Equipo equipo = null;
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM equipos WHERE idEquipo= " + eid;
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				int idEquipo = rs.getInt("idEquipo");
				String nombre = rs.getString("nombre");
				String ciudad = rs.getString("ciudad");
				equipo = new Equipo(idEquipo ,nombre, ciudad);
				equipos.add(equipo);
			}
			
			for (int i = 0; i < equipos.size();i++) {
				System.out.println(equipos.get(i));
			}
			
		}catch (SQLException e) {
			System.err.println("Error en el Statement de verEquipoxid(eid). No se ha podido conseguir el ejecutable del sql");
		}
	}
	
	
	
}
