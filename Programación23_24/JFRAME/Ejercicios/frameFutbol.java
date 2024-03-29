package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dbClases.Equipo2;
import dbClases.Futbolista2;
import dbModelo.Futbol2;
import dbModelo.equipoFutbol2;



public class frameFutbol{
	
	
	private static JFrame mostrarJug(ImageIcon icono) {
		
		JFrame verJugadores = new JFrame("Lista de jugadores");
		verJugadores.setSize(600, 400);
		verJugadores.setIconImage(icono.getImage());

		JPanel panel = new JPanel();
		panel.setSize(600, 400);
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		ArrayList<Futbolista2>fut=Futbol2.getFutbolistas();
		JTextArea textoJugadores = new JTextArea();
		textoJugadores.setEditable(false);
		textoJugadores.setFont(new Font("Arial",0,14));
		
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
	
	private static JFrame mostrarEquipos(ImageIcon icono) {
		
		JFrame verEquipos = new JFrame("Lista de equipos");
		verEquipos.setSize(600, 400);
		verEquipos.setIconImage(icono.getImage());
		JPanel panel = new JPanel();
		panel.setSize(600, 400);
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		ArrayList<Equipo2>equi=equipoFutbol2.verEquipos();
		JTextArea textoEquipos = new JTextArea();
		textoEquipos.setEditable(false);
		textoEquipos.setFont(new Font("Arial",0,14));
		
		String lista = "";
		for (int i=0; i < equi.size();i++) {
			lista += equi.get(i).toString() + "\n";
			textoEquipos.setText(lista);
		}
		panel.add(textoEquipos);
		verEquipos.add(panel);
		verEquipos.setVisible(true);
		
		return verEquipos;
	}

	private static JFrame agregarFut(ImageIcon icono) {
		
		ArrayList<Futbolista2>listaFutbolistas=Futbol2.getFutbolistas();	//arraylist para tener todos los futbolistas
		String[]DniFut = new String[listaFutbolistas.size()];	//array donde guardo el dni de cada uno para usarlo en la creación del jugador
		
		for(int i = 0; i < DniFut.length;i++) {
			DniFut[i] = listaFutbolistas.get(i).getDni();	//aqui meto todos los dni
		}
		
		JFrame ventana = new JFrame("Agregar futbolista");
		ventana.setResizable(false);
		ventana.setSize(500, 400);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 500, 350);
		ventana.add(panel);
		
		Font fuente = new Font("Arial",Font.BOLD,14);
		
		JLabel titulo = new JLabel("Futbolista");
		titulo.setFont(new Font("Impact",0,30));
		titulo.setBounds(40,20,200,30);
		panel.add(titulo);
		
		JLabel dniLabel = new JLabel("DNI:");
		dniLabel.setBounds(10,80,100,30);
		dniLabel.setFont(fuente);
		
		JTextField dniText = new JTextField();
		dniText.setBounds(120,80,80,30);
		dniText.setMargin(new Insets(0,7,0,7));
		dniText.setFont(fuente);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(10,120,100,30);
		nombreLabel.setFont(fuente);
		
		JTextField nombreText = new JTextField();
		nombreText.setBounds(120,120,80,30);
		nombreText.setMargin(new Insets(0,7,0,7));
		nombreText.setFont(fuente);
		
		JLabel apellidoLabel = new JLabel("Apellido:");
		apellidoLabel.setBounds(10,160,100,30);
		apellidoLabel.setFont(fuente);
		
		JTextField apellidoText = new JTextField();
		apellidoText.setBounds(120,160,80,30);
		apellidoText.setMargin(new Insets(0,7,0,7));
		apellidoText.setFont(fuente);
		
		JLabel salarioLabel = new JLabel("Salario:");
		salarioLabel.setBounds(10,200,100,30);
		salarioLabel.setFont(fuente);
		
		JTextField salarioText = new JTextField();
		salarioText.setBounds(120,200,80,30);
		salarioText.setMargin(new Insets(0,7,0,7));
		salarioText.setFont(fuente);
		
		JLabel idequipoLabel = new JLabel("ID de equipo:");
		idequipoLabel.setBounds(10,240,100,30);
		idequipoLabel.setFont(fuente);
		
		JTextField idequipoText = new JTextField();
		idequipoText.setBounds(120,240,80,30);
		idequipoText.setMargin(new Insets(0,7,0,7));
		idequipoText.setFont(fuente);
		
		panel.add(dniLabel);panel.add(dniText);panel.add(nombreLabel);panel.add(nombreText);
		panel.add(apellidoLabel);panel.add(apellidoText);panel.add(salarioLabel);
		panel.add(salarioText);panel.add(idequipoLabel);panel.add(idequipoText);
		
		JButton enviar = new JButton("Crear");
		enviar.setBounds(40,290,150,50);
		panel.add(enviar);
		
		
		
		
		/*
		 * insertar foto en jlabel
		 * 
		 * ImageIcon logo = new ImageIcon("img/logoCinesa.png");
		Icon iconoLogo = new ImageIcon(logo.getImage().getScaledInstance(logotipo.getWidth(), logotipo.getHeight(), Image.SCALE_SMOOTH));
		logotipo.setIcon(iconoLogo);
		 */
		
		ventana.setVisible(true);
		return ventana;
	}
	
	private static JFrame idJug(ImageIcon icono) {

		
		JFrame idJug = new JFrame("Mostrar jugador por ID");
		idJug.setSize(600, 150);
		idJug.setIconImage(icono.getImage());
		idJug.setLayout(null);
		idJug.setResizable(false);
		
		ArrayList<Futbolista2>fut = Futbol2.getFutbolistas();
		String[] listaDni = new String[fut.size()];
		
			for(int i = 0;i< listaDni.length;i++) {
				listaDni[i]=fut.get(i).getDni();
			}
		
		
		//panel para elegir el id
			
		JPanel panel1 = new JPanel();
		panel1.setBounds(0,0,600, 50);
		panel1.setLayout(null);
		panel1.setBackground(Color.lightGray);
		idJug.add(panel1);
		
		JComboBox<String>elegirDni = new JComboBox<>(listaDni);
		elegirDni.setBounds(10, 5, 100, 40);
		elegirDni.setFont(new Font("Arial",Font.BOLD,12));
		panel1.add(elegirDni);
		
		JButton btn_elegir = new JButton("Elegir");
		btn_elegir.setBounds(365, 5, 100, 40);
		btn_elegir.setFont(new Font("Arial",Font.BOLD,15));
		panel1.add(btn_elegir);
		
		JButton btn_eliminar = new JButton("Eliminar");
		btn_eliminar.setBounds(475, 5, 100, 40);
		btn_eliminar.setFont(new Font("Arial",Font.BOLD,15));
		panel1.add(btn_eliminar);
		
		//panel para mostrar el futbolista
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0,50,600, 100);
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		idJug.add(panel2);
		
		JTextArea textoJug = new JTextArea();
		textoJug.setFont(new Font("Arial",Font.BOLD,13));
		
		panel2.add(textoJug);
		idJug.setVisible(true);
		
		btn_elegir.addActionListener(e ->{
			textoJug.setText(Futbol2.dniFutbolista(elegirDni.getSelectedItem().toString()));
		});
		btn_eliminar.addActionListener(e ->{
			textoJug.setText(null);
		});
		
		return idJug;
	}
	
	private static JFrame idEquipo(ImageIcon icono) {
		
	JFrame idEquipo = new JFrame("Mostrar equipo por ID");
	idEquipo.setSize(600, 150);
	idEquipo.setIconImage(icono.getImage());
	idEquipo.setLayout(null);
	idEquipo.setResizable(false);
	
	ArrayList<Equipo2>equipo = equipoFutbol2.verEquipos();
	String[] listaDni = new String[equipo.size()];
	
		for(int i = 0;i< listaDni.length;i++) {
			listaDni[i]= Integer.toString(equipo.get(i).getIdEquipo());
		}
	
	
	//panel para elegir el id
		
	JPanel panel1 = new JPanel();
	panel1.setBounds(0,0,600, 50);
	panel1.setLayout(null);
	panel1.setBackground(Color.lightGray);
	idEquipo.add(panel1);
	
	JComboBox<String>elegirDni = new JComboBox<>(listaDni);
	elegirDni.setBounds(10, 5, 100, 40);
	elegirDni.setFont(new Font("Arial",Font.BOLD,12));
	panel1.add(elegirDni);
	
	JButton btn_elegir = new JButton("Elegir");
	btn_elegir.setBounds(365, 5, 100, 40);
	btn_elegir.setFont(new Font("Arial",Font.BOLD,15));
	panel1.add(btn_elegir);
	
	JButton btn_eliminar = new JButton("Eliminar");
	btn_eliminar.setBounds(475, 5, 100, 40);
	btn_eliminar.setFont(new Font("Arial",Font.BOLD,15));
	panel1.add(btn_eliminar);
	
	//panel para mostrar el futbolista
	
	JPanel panel2 = new JPanel();
	panel2.setBounds(0,50,600, 100);
	panel2.setBackground(Color.WHITE);
	panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
	idEquipo.add(panel2);
	
	JTextArea textoEquipo = new JTextArea();
	textoEquipo.setFont(new Font("Arial",Font.BOLD,13));
	
	panel2.add(textoEquipo);
	idEquipo.setVisible(true);
	
	btn_elegir.addActionListener(e ->{
		textoEquipo.setText(equipoFutbol2.verEquipoxid(Integer.parseInt(elegirDni.getSelectedItem().toString())));
	});
	btn_eliminar.addActionListener(e ->{
		textoEquipo.setText(null);
	});
	
	return idEquipo;
}
	
	
	public static void main(String[] args){
		JFrame ventanaInicial = new JFrame("Menu Futbol BBDD");
		ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaInicial.setSize(350, 450);
		ventanaInicial.setLocationRelativeTo(null);
		ventanaInicial.setResizable(false);
		
		Font fuenteBtn = new Font("Arial",Font.BOLD,14);
		
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
		btn_vj.setFont(fuenteBtn);
		
		JButton btn_ve = new JButton("Mostrar Equipos");
		btn_ve.setBounds(45, 80, 250, 50);
		btn_ve.setFont(fuenteBtn);
		       
		JButton btn_af = new JButton("Agregar Jugador y carta");
		btn_af.setBounds(45, 140, 250, 50);
		btn_af.setFont(fuenteBtn);
		
		JButton btn_ae = new JButton("Agregar Equipo");
		btn_ae.setBounds(45, 200, 250, 50);
		btn_ae.setFont(fuenteBtn);
		
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		btn_idf.setBounds(45, 260, 250, 50);
		btn_idf.setFont(fuenteBtn);
		
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		btn_ide.setBounds(45, 320, 250, 50);
		btn_ide.setFont(fuenteBtn);
		
		
		panelBotones.add(btn_vj);panelBotones.add(btn_ve);panelBotones.add(btn_af);panelBotones.add(btn_ae);panelBotones.add(btn_idf);panelBotones.add(btn_ide);
		panelGeneral.add(panelBotones, BorderLayout.CENTER);
		ventanaInicial.add(panelGeneral);
		
		ventanaInicial.setVisible(true);
		
		
		btn_vj.addActionListener(e ->{
				mostrarJug(icono);
		});
		
		btn_ve.addActionListener(e ->{
			mostrarEquipos(icono);
		});
		
		btn_af.addActionListener(e -> {
			agregarFut(icono);
		});
		
		btn_ae.addActionListener(e -> {
			
		});
		
		btn_idf.addActionListener(e -> {
			idJug(icono);
		});
		
		btn_ide.addActionListener(e -> {
			idEquipo(icono);
		});
	}

	
			
	

}
