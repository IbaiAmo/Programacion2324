package Java_Ficheros;

import java.io.*;
	

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class Ejercicio1 {

	    static String[] dniArray = new String[5];
	    static String[] nombreArray = new String[5];
	    static String[] apellidoArray = new String[5];
	    static double[] saldoArray = new double[5];

	    public static void main(String[] args) throws IOException {
	        cargarDatosDesdeArchivo();

	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            mostrarMenu();
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    retirarDinero();
	                    break;
	                case 2:
	                    depositarDinero();
	                    break;
	                case 3:
	                    actualizarDatosUsuario();
	                    break;
	                case 4:
	                    guardarDatosEnArchivo();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa. ¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    break;
	            }

	        } while (opcion != 5);

	        scanner.close();
	    }

	    static void cargarDatosDesdeArchivo() throws IOException {
	        BufferedReader br = new BufferedReader(new FileReader("src/Java_Ficheros/bezeroak.txt"));
	        String line;
	        int i = 0;

	        while ((line = br.readLine()) != null && i < 5) {
	            String[] partes = line.split(":");
	            dniArray[i] = partes[0];
	            nombreArray[i] = partes[1];
	            apellidoArray[i] = partes[2];
	            saldoArray[i] = Double.parseDouble(partes[3]);
	            i++;
	        }

	        br.close();
	    }

	    static void retirarDinero() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese su DNI: ");
	        String dni = scanner.next();
	        int index = buscarCliente(dni);

	        if (index != -1) {
	            System.out.print("Ingrese la cantidad a retirar: ");
	            double cantidad = scanner.nextDouble();
	            if (cantidad <= saldoArray[index]) {
	                saldoArray[index] -= cantidad;
	                System.out.println("Retiro exitoso. Nuevo saldo: " + saldoArray[index]);
	            } else {
	                System.out.println("Saldo insuficiente.");
	            }
	        } else {
	            System.out.println("Cliente no encontrado.");
	        }
	    }

	    static void depositarDinero() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese su DNI: ");
	        String dni = scanner.next();
	        int index = buscarCliente(dni);

	        if (index != -1) {
	            System.out.print("Ingrese la cantidad a depositar: ");
	            double cantidad = scanner.nextDouble();
	            saldoArray[index] += cantidad;
	            System.out.println("Depósito exitoso. Nuevo saldo: " + saldoArray[index]);
	        } else {
	            System.out.println("Cliente no encontrado.");
	        }
	    }

	    static void actualizarDatosUsuario() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese su DNI: ");
	        String dni = scanner.next();
	        int index = buscarCliente(dni);

	        if (index != -1) {
	            System.out.print("Ingrese el nuevo nombre: ");
	            String nuevoNombre = scanner.next();
	            System.out.print("Ingrese el nuevo apellido: ");
	            String nuevoApellido = scanner.next();

	            nombreArray[index] = nuevoNombre;
	            apellidoArray[index] = nuevoApellido;

	            System.out.println("Datos actualizados correctamente.");
	        } else {
	            System.out.println("Cliente no encontrado.");
	        }
	    }

	    static void guardarDatosEnArchivo() throws IOException {
	        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Java_Ficheros/bezeroak.txt"));
	        for (int i = 0; i < 5; i++) {
	            bw.write(dniArray[i] + ":" + nombreArray[i] + ":" + apellidoArray[i] + ":" + saldoArray[i]);
	            bw.newLine();
	        }
	        bw.close();
	        System.out.println("Datos guardados correctamente.");
	    }

	    static void mostrarMenu() {
	        System.out.println("==== Menú ====");
	        System.out.println("1. Retirar dinero");
	        System.out.println("2. Depositar dinero");
	        System.out.println("3. Actualizar datos del usuario");
	        System.out.println("4. Guardar");
	        System.out.println("5. SALIR");
	        System.out.print("Ingrese su opción: ");
	    }

	    static int buscarCliente(String dni) {
	        for (int i = 0; i < 5; i++) {
	            if (dniArray[i].equals(dni)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}



