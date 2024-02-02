package ejercicioBD;

import java.util.ArrayList;

import modelo.db.EmpleadoModelo;
import modelo.model.Empleado;

public class GestionEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empleado> empleados=EmpleadoModelo.getEmpleados();
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		
		
		
	}

}