package dbModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbClases.carta;

public class cartaFut {

	
	private static Connection conexion() {
		
		String url="jdbc:mysql://localhost:3306/futbol";
		String usuario="root";
		String password="";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, usuario, password);
		}catch(SQLException e) {
			System.err.println("Error al conectar con la base de datos");
		}
		
		return con;
		
	}
	
	public static ArrayList<carta> listaCartas(){
		ArrayList<carta>lista=new ArrayList<carta>();
		Connection con = conexion();
		
		try {
			Statement st = con.createStatement();
			String sql ="SELECT * FROM cartafutbolista";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String dni = rs.getString(1);
				int ritmo = rs.getInt(2);
				int tiro = rs.getInt(3);
				int pase = rs.getInt(4);
				int regate = rs.getInt(5);
				int defensa = rs.getInt(6);
				int fisico = rs.getInt(7);
				
				carta c = new carta(dni, ritmo, tiro, pase, regate, defensa, fisico);
				lista.add(c);
			}
		}catch(SQLException e) {
			System.err.println("Error en el statement");
		}
		
		return lista;
	}
	
	public static void insCarta(String dni, int ritmo, int tiro, int pase, int regate, int defensa, int fisico) {
		Connection con = conexion();
		
		try {
			Statement st = con.createStatement();
			String sql = "INSERT INTO cartafutbolista (dni,ritmo,tiro,pase,regate,defensa,fisico) VALUES"
					+ " ('"+ dni + "',"+ ritmo +"," + tiro +","+ pase +","+ regate +","+ defensa +"," + fisico + ")";
			st.execute(sql);
		}catch(SQLException e) {
			System.err.println("Error en el statement de insCarta().");
		}
	}
}
