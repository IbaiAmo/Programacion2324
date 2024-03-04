package Ejercicios;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Menu{

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Menu Practica: título de ventana");
		ventana.setSize(400,200);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		
		
		JMenuBar navBar = new JMenuBar();
		ventana.setJMenuBar(navBar);
		
		//Menu 1 --> Archivo
		
		JMenu menu1 = new JMenu("Archivo");
		navBar.add(menu1);
		
		JMenuItem archivo1 = new JMenuItem("Nuevo");
		menu1.add(archivo1);
		menu1.addSeparator();
		
		JMenuItem archivo2 = new JMenuItem("Abrir");
		menu1.add(archivo2);
		menu1.addSeparator();
		
		JMenuItem archivo3 = new JMenuItem("Guardar");
		menu1.add(archivo3);
		menu1.addSeparator();
		
		JMenuItem archivo4 = new JMenuItem("Salir");
		menu1.add(archivo4);
		
		
		//Menu 2 --> Edicion
		
		JMenu menu2 = new JMenu("Edición");
		navBar.add(menu2);
		
		JMenuItem edicion1 = new JMenuItem("Copiar");
		menu2.add(edicion1);
		
		JMenuItem edicion2 = new JMenuItem("Pegar");
		menu2.add(edicion2);
		
		JMenu edicion3 = new JMenu("Girar");
		menu2.add(edicion3);
		
		JMenuItem vertical = new JMenuItem("Vertical");
		edicion3.add(vertical);
		
		JMenuItem horizontal = new JMenuItem("Horizontal");
		edicion3.add(horizontal);
		
		
		//Menu 3 --> Opciones
		
		JMenu menu3 = new JMenu("Opciones");
		navBar.add(menu3);
		
		JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Check1");
		menu3.add(check1);
		
		JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Check2");
		menu3.add(check2);
		menu3.addSeparator();
		
		ButtonGroup grupo = new ButtonGroup();
		
		JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio1");
		grupo.add(radio1);
		menu3.add(radio1);
		
		JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio2");
		grupo.add(radio2);
		menu3.add(radio2);
		
		//Menu 4 --> Acerca de...
		
		JMenu menu4 = new JMenu("Acerca de...");
		navBar.add(menu4);
		
		
		
		
		
		
		
	}

}