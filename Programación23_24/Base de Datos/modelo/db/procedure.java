package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.model.alumnos;

public class procedure {

	
	private static Connection conexion() {
		
		String url="jdbc:mysql://localhost:3306/instituto";
		String user="root";
		String password="";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos","error", JOptionPane.ERROR_MESSAGE);
		}
		
		return con;
	}
	
	
//	public static ArrayList<alumnos> listaAlumnos(){
//		
//	}
	
}
