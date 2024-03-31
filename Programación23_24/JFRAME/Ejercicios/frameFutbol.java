package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import dbClases.Equipo2;
import dbClases.Futbolista2;
import dbModelo.Futbol2;
import dbModelo.equipoFutbol2;



public class frameFutbol{
	
	private static int cont = 0;	//Este es un contador que contará los clicks del boton enviar (solo 0 y 1). 
							//Esto es porque uso el mismo boton para crear cada cosa.
	
	private static String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", 
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};	//array para luego comprobar los datos introducidos
	
	private static String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};	//array para comprobar si el dniFutbolista tiene numeros
	
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
		ventana.setSize(700, 400);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		ventana.add(panel);
		
		JPanel panelBloqueo = new JPanel();	//Esto es para bloquear la zona de la carta y luego la del futbolista
		panelBloqueo.setBounds(370, 0, 330, 400);
		panelBloqueo.setBackground(new Color(0, 0, 0, 100));
		panelBloqueo.setLayout(null);
		panel.add(panelBloqueo);
		
		
		JLabel candadoImg = new JLabel();
		candadoImg.setBounds(10,10,60,80);
		 
		ImageIcon candado = new ImageIcon("JFRAME\\imgs\\candado.png");
		Icon candado2 = new ImageIcon(candado.getImage().getScaledInstance(candadoImg.getWidth(), candadoImg.getHeight(), Image.SCALE_SMOOTH));
		candadoImg.setIcon(candado2);
		panelBloqueo.add(candadoImg);
		
		
		Font fuente = new Font("Arial",Font.BOLD,14);	//fuente para los datos
		
		ArrayList<JTextField>listaValoresFut = new ArrayList<JTextField>();	//arraylist para comprobar un requisito para todos los jtextfields
		
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
		listaValoresFut.add(dniText);
		dniText.setFont(fuente);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(10,120,100,30);
		nombreLabel.setFont(fuente);
		
		JTextField nombreText = new JTextField();
		nombreText.setBounds(120,120,80,30);
		nombreText.setMargin(new Insets(0,7,0,7));
		listaValoresFut.add(nombreText);
		nombreText.setFont(fuente);
		
		JLabel apellidoLabel = new JLabel("Apellido:");
		apellidoLabel.setBounds(10,160,100,30);
		apellidoLabel.setFont(fuente);
		
		JTextField apellidoText = new JTextField();
		apellidoText.setBounds(120,160,80,30);
		apellidoText.setMargin(new Insets(0,7,0,7));
		listaValoresFut.add(apellidoText);
		apellidoText.setFont(fuente);
		
		JLabel salarioLabel = new JLabel("Salario:");
		salarioLabel.setBounds(10,200,100,30);
		salarioLabel.setFont(fuente);
		
		JTextField salarioText = new JTextField();
		salarioText.setBounds(120,200,80,30);
		salarioText.setMargin(new Insets(0,7,0,7));
		listaValoresFut.add(salarioText);
		salarioText.setFont(fuente);
		
		JLabel idequipoLabel = new JLabel("ID de equipo:");
		idequipoLabel.setBounds(10,240,100,30);
		idequipoLabel.setFont(fuente);
		
		JTextField idequipoText = new JTextField();
		idequipoText.setBounds(120,240,80,30);
		idequipoText.setMargin(new Insets(0,7,0,7));
		listaValoresFut.add(idequipoText);
		idequipoText.setFont(fuente);
		
		panel.add(dniLabel);panel.add(dniText);panel.add(nombreLabel);panel.add(nombreText);
		panel.add(apellidoLabel);panel.add(apellidoText);panel.add(salarioLabel);
		panel.add(salarioText);panel.add(idequipoLabel);panel.add(idequipoText);
		
		JButton enviar = new JButton("Crear");
		enviar.setBounds(35,290,130,50);
		enviar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(enviar);
		
		
		//Parte de la creacion de la carta
		
		
		
		JLabel flechaImg = new JLabel();
		flechaImg.setBounds(200,100,200,130);
		 
		ImageIcon flecha = new ImageIcon("JFRAME\\imgs\\flecha.png");
		Icon flecha2 = new ImageIcon(flecha.getImage().getScaledInstance(flechaImg.getWidth(), flechaImg.getHeight(), Image.SCALE_SMOOTH));
		flechaImg.setIcon(flecha2);
		panel.add(flechaImg);
		
		
		//Esta carta solo va a ser para el diseño, luego la hago invisible y muestro otra.
		JLabel cartaImg = new JLabel();
		cartaImg.setBounds(400,0,260,335);
		 
		ImageIcon carta = new ImageIcon("JFRAME\\imgs\\carta.png");
		Icon carta2 = new ImageIcon(carta.getImage().getScaledInstance(cartaImg.getWidth(), cartaImg.getHeight(), Image.SCALE_SMOOTH));
        cartaImg.setIcon(carta2);
		panel.add(cartaImg);
		

		
		enviar.addActionListener(e ->{
			
			int requisitos = 0;	//variable para que antes de crear el futbolista cumpla los requisitos de entrada de datos
			boolean cumple = false;
			
			//boolean para cada requisito
			boolean dniReq = false,dniIgual = false, dni1 = false, dni2=false, salId = false, comaPunto = false;
			String errores = "Errores: \n";
			
			if(cont==0) {
				
				//Con esto compruebo si el dni esta vacio o hay un espacio, asi tambien se hace un campo obligatorio
				if (dniText.getText().equals("") || dniText.getText().contains(" ")) {
					dniReq = true;
				}
				
				//comprobar que el dni tenga 4 caracteres
				if(dniText.getText().length() == 4) {
					requisitos++;
				}else {
					errores += "- El DNI debe tener 4 caracteres \n";
				}
				
				//comprobar si el dni ya existe
				for(int p = 0; p < DniFut.length;p++) {
					if (dniText.getText().equalsIgnoreCase(DniFut[p])) {
						dniIgual = true;
					}
				}
				
				//comprobar si el dni tiene alguna letra
				for (int o = 0; o < letras.length;o++) {
					if(dniText.getText().contains(letras[o])){
						dni1=true;
								
					}
				}
				
				if(dni1 == false) {
					errores += "- El DNI debe contener al menos una letra \n";
				}else {
					requisitos++;
				}
				
				//comprobar si el dni tiene numeros
				for (int o = 0; o < numeros.length;o++) {
					if(dniText.getText().contains(numeros[o])){
						dni2 =true;
								
					}
				}
				
				if(dni2 == false) {
					errores += "- El DNI debe contener al menos un numero \n";
				}else {
					requisitos++;
				}
					
				
				//comprobar si el salario o el ID son negativos
				if (salarioText.getText().contains("-") || idequipoText.getText().contains("-")) {
						errores += "- El salario y el ID de equipo no pueden ser negativos \n";
						
				}else {
					requisitos++;
				}
				
				//comprobar si el salario y el ID de equipo contienen alguna letra
				for (int o = 0; o < letras.length;o++) {
					if(idequipoText.getText().toLowerCase().contains(letras[o]) || salarioText.getText().toLowerCase().contains(letras[o])){
						salId = true;
					}
				}
				
				if(salId == true) {
					errores += "- El salario o el ID de equipo contienen un letra \n";
				}else {
					requisitos++;
				}
				
				if (salarioText.getText().contains(" ") || dniText.getText().contains(" ")) {
					errores += "- El salario o el ID de equipo contienen un espacio \n";
				}else {
					requisitos++;
				}
				
				for(int i = 0; i < listaValoresFut.size();i++) {
					if (listaValoresFut.get(i).getText().contains(",") || listaValoresFut.get(i).getText().contains(".")) {
						comaPunto = true;
					}
				}
				
				if(comaPunto == true) {
					errores += "- No se puede introducir ningún punto o coma\n";
				}else {
					requisitos++;
				}
				

				
				if(dniReq) {
					JOptionPane.showMessageDialog(ventana, "El DNI es un campo obligatorio y no puede\ntener espacios", 
							"No se ha creado el futbolista", JOptionPane.ERROR_MESSAGE);
				}else {
					if(dniIgual) {
						JOptionPane.showMessageDialog(ventana, "El DNI ya existe, pon otro", 
								"No se ha creado el futbolista", JOptionPane.ERROR_MESSAGE);
					}else {
				
						if(requisitos < 7) {
								JOptionPane.showMessageDialog(ventana, errores, 
										"No se ha creado el futbolista", JOptionPane.ERROR_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(ventana, "Se han introducido bien los datos", "Datos correctos", JOptionPane.INFORMATION_MESSAGE);
							cumple = true;
						}
					}
				}
			
				
				/*
				 * Esto es para evitar un error de formato de numero, sale cuando envias 
				 * un string vacio y lo pasas a integer, cosa que es imposible.
				 * Cuando le daba al boton de enviar, el metodo de insFutbolista recibia un string
				 * que lo pasaba a integer con el parse int, pero si envias un string vacio
				 * salia un error porque un espacio vacio no se puede pasar a int.
				 */
				String salario = salarioText.getText();
				if(salarioText.getText().equals("")) {
					salario = 0+"";
				}
				
				String id = idequipoText.getText();
				if(idequipoText.getText().equals("")) {
					id = 0+"";
				}
				
			
				if(cumple == true) {
					
		
					ventana.setSize(800, 400);
					panelBloqueo.setBounds(0,0,230,400);
					candadoImg.setLocation(160, 10);
					dniText.setEditable(false);
					nombreText.setEditable(false);
					apellidoText.setEditable(false);
					salarioText.setEditable(false);
					idequipoText.setEditable(false);
					cartaImg.setVisible(false);
					enviar.setLocation(650, 290);
					cont++;
					
					//Parte de la carta
					Color colorCarta = new Color(70, 57, 12);
					Font fuentaCartaNum = new Font("arial",Font.BOLD,22);
					
					JLabel nombreFut = new JLabel(nombreText.getText().toUpperCase(), SwingConstants.CENTER);	//esto centra el texto del JLabel
					nombreFut.setFont(new Font("arial",Font.BOLD,20));
					nombreFut.setForeground(colorCarta);
					nombreFut.setBounds(400,185,260,20);
					panel.add(nombreFut);
					
					
					//Labels para avisar al usuario de cómo se introduce un valor
					JLabel aviso = new JLabel("Pon el cursor al lado");
					aviso.setFont(new Font("arial",0,12));
					aviso.setBounds(650,220,150,12);
					panel.add(aviso);
					
					JLabel aviso2 = new JLabel("de cada estadística");
					aviso2.setFont(new Font("arial",0,12));
					aviso2.setBounds(650,234,150,12);
					panel.add(aviso2);
					
					JLabel aviso3 = new JLabel("para introducir un valor");
					aviso3.setFont(new Font("arial",0,12));
					aviso3.setBounds(650,248,150,12);
					panel.add(aviso3);
					
					/*
					 * Aqui van los JTextFields para poner los numeros de cada atributo.
					 * Estos no podran ser mayores a 100 ni menores a 0. Si se deja cualquiera
					 * vacio, este sera reconocido como 0.
					 */
					JTextField ritmo = new JTextField();
					ritmo.setHorizontalAlignment(SwingConstants.RIGHT);
					ritmo.setFont(fuentaCartaNum);
					ritmo.setForeground(colorCarta);
					ritmo.setOpaque(false);
					ritmo.setBorder(null);
					ritmo.setBounds(450,217,33,20);
					panel.add(ritmo);
					
					JTextField tiro = new JTextField();
					tiro.setHorizontalAlignment(SwingConstants.RIGHT);
					tiro.setFont(fuentaCartaNum);
					tiro.setForeground(colorCarta);
					tiro.setOpaque(false);
					tiro.setBorder(null);
					tiro.setBounds(450,240,33,20);
					panel.add(tiro);
					
					JTextField pase = new JTextField();
					pase.setHorizontalAlignment(SwingConstants.RIGHT);
					pase.setFont(fuentaCartaNum);
					pase.setForeground(colorCarta);
					pase.setOpaque(false);
					pase.setBorder(null);
					pase.setBounds(450,264,33,20);
					panel.add(pase);
					
					JTextField regate = new JTextField();
					regate.setHorizontalAlignment(SwingConstants.RIGHT);
					regate.setFont(fuentaCartaNum);
					regate.setForeground(colorCarta);
					regate.setOpaque(false);
					regate.setBorder(null);
					regate.setBounds(540,217,33,20);
					panel.add(regate);
					
					JTextField defensa = new JTextField();
					defensa.setHorizontalAlignment(SwingConstants.RIGHT);
					defensa.setFont(fuentaCartaNum);
					defensa.setForeground(colorCarta);
					defensa.setOpaque(false);
					defensa.setBorder(null);
					defensa.setBounds(540,240,33,20);
					panel.add(defensa);
					
					JTextField fisico = new JTextField();
					fisico.setHorizontalAlignment(SwingConstants.RIGHT);
					fisico.setFont(fuentaCartaNum);
					fisico.setForeground(colorCarta);
					fisico.setOpaque(false);
					fisico.setBorder(null);
					fisico.setBounds(540,264,33,20);
					panel.add(fisico);
					
					
					//Imagen de la carta sobre la que van todos los textfields y el nombre
					JLabel cartaImg2 = new JLabel();
					cartaImg2.setBounds(400,0,260,335);		
					
					ImageIcon carta4 = new ImageIcon("JFRAME\\imgs\\carta.png");
					Icon carta3 = new ImageIcon(carta4.getImage().getScaledInstance(cartaImg2.getWidth(), cartaImg2.getHeight(), Image.SCALE_SMOOTH));
					cartaImg2.setIcon(carta3);
					panel.add(cartaImg2);
				}
			}else {
				
				cont=0;
				
				
//				Futbol2.insFutbolista(dniText.getText().toUpperCase(), nombreText.getText(), apellidoText.getText(),
//				Integer.parseInt(salario), Integer.parseInt(id));
//				cartaFut.insCarta(dniText.getText().toUpperCase(), ritmo, tiro, pase, regate, defensa, fisico);
			}
			
		});
		
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
		btn_vj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btn_ve = new JButton("Mostrar Equipos");
		btn_ve.setBounds(45, 80, 250, 50);
		btn_ve.setFont(fuenteBtn);
		btn_ve.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btn_af = new JButton("Agregar Jugador y carta");
		btn_af.setBounds(45, 140, 250, 50);
		btn_af.setFont(fuenteBtn);
		btn_af.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btn_ae = new JButton("Agregar Equipo");
		btn_ae.setBounds(45, 200, 250, 50);
		btn_ae.setFont(fuenteBtn);
		btn_ae.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		btn_idf.setBounds(45, 260, 250, 50);
		btn_idf.setFont(fuenteBtn);
		btn_idf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		btn_ide.setBounds(45, 320, 250, 50);
		btn_ide.setFont(fuenteBtn);
		btn_ide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
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
