package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.model.Empleado;

public class EmpleadoModelo {
	
	private static Connection conexion() {
		
		String URI="jdbc:mysql://localhost:3306/empresa";
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
	
	public static ArrayList<Empleado> getEmpleados(){
		ArrayList<Empleado> empleados=new ArrayList<Empleado>();
		Connection con=conexion();
		
		try {
			Statement st=con.createStatement();
			String sql = "SELECT * FROM empleados";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("first_name");
				String apellido = rs.getString("last_name");
				String departamento = rs.getString("department");
				double salario = rs.getDouble("salario");
				Empleado e = new Empleado(id, nombre, apellido, departamento, salario);
				empleados.add(e);
			}
			
		} catch (SQLException e) {
			System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return empleados;
	}
	
	public static ArrayList<Empleado> getEmpleados1(String escribirDep){
		ArrayList<Empleado> empleados=new ArrayList<Empleado>();
		Connection con=conexion();
		
		try {
			Statement st=con.createStatement();
			String sql = "SELECT * FROM empleados WHERE department='" + escribirDep + "'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("first_name");
				String apellido = rs.getString("last_name");
				String departamento = rs.getString("department");
				double salario = rs.getDouble("salario");
				Empleado e = new Empleado(id, nombre, apellido, departamento, salario);
				empleados.add(e);
			}
			
		} catch (SQLException e) {
			System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return empleados;
	}
	
	public static ArrayList<Empleado> getEmpleados2(int escribirSal){
		ArrayList<Empleado> empleados=new ArrayList<Empleado>();
		Connection con=conexion();
		
		try {
			Statement st=con.createStatement();
			String sql = "SELECT * FROM empleados WHERE salario>=" + escribirSal;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("first_name");
				String apellido = rs.getString("last_name");
				String departamento = rs.getString("department");
				double salario = rs.getDouble("salario");
				Empleado e = new Empleado(id, nombre, apellido, departamento, salario);
				empleados.add(e);
			}
			
		} catch (SQLException e) {
			System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return empleados;
	}
	
	public static ArrayList<Empleado> getEmpleados3(String escribirSentencia){
		ArrayList<Empleado> empleados=new ArrayList<Empleado>();
		Connection con=conexion();
		
		try {
			Statement st=con.createStatement();
			String sql = escribirSentencia;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("first_name");
				String apellido = rs.getString("last_name");
				String departamento = rs.getString("department");
				double salario = rs.getDouble("salario");
				Empleado e = new Empleado(id, nombre, apellido, departamento, salario);
				empleados.add(e);
			}
			
		} catch (SQLException e) {
			System.err.println("Error en el Statement de getEmpleados(). No se ha podido conseguir el ejecutable del sql");
		}
		
		return empleados;
	}
	
	

	
	
	
	
	
}
