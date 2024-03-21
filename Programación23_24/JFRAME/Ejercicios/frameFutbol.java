package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dbClases.Futbolista;

public class frameFutbol{
	


	public static void main(String[] args){
		JFrame ventanaInicial = new JFrame("Menu Futbol BBDD");
		ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaInicial.setSize(350, 450);
		ventanaInicial.setLocationRelativeTo(null);
		ventanaInicial.setResizable(false);
		
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBorder(BorderFactory.createEmptyBorder());
		panelGeneral.setSize(350, 450);
		panelGeneral.setLayout(new BorderLayout());
		
		JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelTitulo.setSize(350, 100);
		panelTitulo.setBorder(BorderFactory.createEmptyBorder());
		panelTitulo.setBackground(Color.RED);
		JLabel titulo = new JLabel("MENU FUTBOL");
		
		
		panelTitulo.add(titulo);
		panelGeneral.add(panelTitulo, BorderLayout.NORTH);
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setSize(350, 350);
		panelBotones.setLayout(new GridLayout(3,2));
		panelBotones.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		JButton btn_vj = new JButton("Mostrar Jugadores");
		JButton btn_ve = new JButton("Mostrar Equipos");
		JButton btn_af = new JButton("Agregar Jugadores");
		JButton btn_ae = new JButton("Agregar Equipos");
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		
		
		panelBotones.add(btn_vj);panelBotones.add(btn_ve);panelBotones.add(btn_af);panelBotones.add(btn_ae);panelBotones.add(btn_idf);panelBotones.add(btn_ide);
		panelGeneral.add(panelBotones, BorderLayout.CENTER);
		ventanaInicial.add(panelGeneral);
		
		ventanaInicial.setVisible(true);
		
		btn_vj.addActionListener(e ->{
			
		});
		
	}


			
	

}
