package Ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class frameFutbol{
	


	public static void main(String[] args){
		JFrame ventanaInicial = new JFrame("Menu Futbol BBDD");
		ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaInicial.setSize(350, 223);
		ventanaInicial.setLocationRelativeTo(null);
		ventanaInicial.setVisible(true);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBorder(BorderFactory.createEmptyBorder());
		panelGeneral.setLayout(new BorderLayout());
		JLabel titulo = new JLabel("MENU FUTBOL");
		
		panelGeneral.add(titulo, BorderLayout.NORTH);
		
		
		JPanel panelBotones = new JPanel();
//		panelBotones.setSize(400, 400);
		panelBotones.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		JButton btn_vj = new JButton("Mostrar Jugadores");
		JButton btn_ve = new JButton("Mostrar Equipos");
		JButton btn_af = new JButton("Agregar Jugadores");
		JButton btn_ae = new JButton("Agregar Equipos");
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panelBotones.add(btn_vj);panelBotones.add(btn_ve);panelBotones.add(btn_af);panelBotones.add(btn_ae);panelBotones.add(btn_idf);panelBotones.add(btn_ide);
		panelGeneral.add(panelBotones, BorderLayout.CENTER);
		ventanaInicial.getContentPane().add(panelGeneral);
		

	}


			
	

}
