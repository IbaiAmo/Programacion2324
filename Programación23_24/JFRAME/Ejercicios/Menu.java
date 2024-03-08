package Ejercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

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
		
		JMenuItem info = new JMenuItem("Aplicación");
		menu4.add(info);
		
		JMenuItem alerta = new JMenuItem("CoDejaVu...");
		menu4.add(alerta);
		

		info.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "Con esta aplicación vamos a\n" + 
		"explicar los componentes básicos de Java Swing.\n\n"+"Autor: Cristian David Henao H. de CoDejaVu."
					,"INFORMACIÓN",1);	//0 es de error, 1 es de información, 2 el de alerta y 3 el de pregunta.
		});
		
		alerta.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "CoDejaVu es un blog personal\n" + "sobre ingenieria de software.\n" +
		"codejavu.blogspot.com","CoDejaVu!!!",2);	//0 es de error, 1 es de información, 2 el de alerta y 3 el de pregunta.
		});
		
		
		//Menu popup con click derecho
		
		JPopupMenu popup = new JPopupMenu();
		
		JMenuItem item1 = new JMenuItem("Popup opción 1");
		JMenuItem item2 = new JMenuItem("Popup opción 2");
		
		popup.add(item1);
		popup.add(item2);
		
		item1.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "Presiona la opción emergente 1");	
		});
		
		item2.addActionListener(e ->{
			JOptionPane.showMessageDialog(null, "Presiona la opción emergente 2");
		});
		
	
		
		//Con esto el popup aparece con clock derecho.
		
		ventana.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					popup.show(ventana,e.getX(),e.getY());
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
		});
		
		
		JPanel panel = new JPanel();
		FlowLayout distri = new FlowLayout();
		panel.setLayout(distri);
		distri.setAlignment(0);
		panel.setBackground(Color.white);
		ventana.add(panel);
		
		JLabel menu = new JLabel();
		panel.add(menu);
		
		
		JLabel texto = new JLabel();
		panel.add(texto);
		
		

		
		archivo1.addActionListener(e ->{
			String text = archivo1.getText();
			texto.setText(text);
		});
		archivo2.addActionListener(e ->{
			String text = archivo2.getText();
			texto.setText(text);
		});
		archivo3.addActionListener(e ->{
			String text = archivo3.getText();
			texto.setText(text);
		});
		archivo4.addActionListener(e ->{
			String text = archivo4.getText();
			texto.setText(text);
		});
		
		
		
	}

}