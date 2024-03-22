package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dbClases.Equipo2;
import dbClases.Futbolista2;
import dbModelo.Futbol2;
import dbModelo.equipoFutbol2;



public class frameFutbol{
	
	
	private static JFrame mostrarJug() {
		
		JFrame verJugadores = new JFrame("Lista de jugadores y equipos");
		verJugadores.setSize(600, 400);
		ImageIcon icono = new ImageIcon("JFRAME\\imgs\\vinicius.png");
		verJugadores.setIconImage(icono.getImage());

		JPanel panel = new JPanel();
		panel.setSize(600, 400);
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		ArrayList<Futbolista2>fut=Futbol2.getFutbolistas();
		JTextArea textoJugadores = new JTextArea();
		textoJugadores.setEditable(false);
		
		String lista = "";
		for (int i=0; i < fut.size();i++) {
			lista += fut.get(i).toString() + "\n";
			textoJugadores.setText(lista);
		}
		panel.add(textoJugadores);
		verJugadores.add(panel);
		verJugadores.setVisible(true);
		
		return verJugadores;
	}
	
	private static void mostrarEquipos() {
		ArrayList<Equipo2>equi=equipoFutbol2.verEquipos();
	}

	public static void main(String[] args){
		JFrame ventanaInicial = new JFrame("Menu Futbol BBDD");
		ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaInicial.setSize(350, 450);
		ventanaInicial.setLocationRelativeTo(null);
		ventanaInicial.setResizable(false);
		
		ImageIcon icono = new ImageIcon("JFRAME\\imgs\\icono-pelota.png");
		ventanaInicial.setIconImage(icono.getImage());
		
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setSize(350, 450);
		panelGeneral.setLayout(new BorderLayout());
		
		JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelTitulo.setSize(350, 100);
		panelTitulo.setBorder(BorderFactory.createEmptyBorder());
		JLabel titulo = new JLabel("MENU FUTBOL");
		titulo.setFont(new Font("Arial",Font.BOLD,19));
		
		panelTitulo.add(titulo);
		panelGeneral.add(panelTitulo, BorderLayout.NORTH);
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setSize(350, 350);
		panelBotones.setLayout(null);
		
		
		
		JButton btn_vj = new JButton("Mostrar Jugadores");
		btn_vj.setBounds(45, 20, 250, 50);
		
		JButton btn_ve = new JButton("Mostrar Equipos");
		btn_ve.setBounds(45, 80, 250, 50);
		       
		JButton btn_af = new JButton("Agregar Jugadores");
		btn_af.setBounds(45, 140, 250, 50);
		
		JButton btn_ae = new JButton("Agregar Equipos");
		btn_ae.setBounds(45, 200, 250, 50);
		
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		btn_idf.setBounds(45, 260, 250, 50);
		
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		btn_ide.setBounds(45, 320, 250, 50);
		
		
		panelBotones.add(btn_vj);panelBotones.add(btn_ve);panelBotones.add(btn_af);panelBotones.add(btn_ae);panelBotones.add(btn_idf);panelBotones.add(btn_ide);
		panelGeneral.add(panelBotones, BorderLayout.CENTER);
		ventanaInicial.add(panelGeneral);
		
		ventanaInicial.setVisible(true);
		
		
		btn_vj.addActionListener(e ->{
				mostrarJug();
		});
		
	}


			
	

}
