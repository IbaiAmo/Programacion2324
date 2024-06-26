package Ejercicios;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

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

import dbClases.Equipo2;
import dbClases.Futbolista2;
import dbClases.carta;
import dbModelo.Futbol2;
import dbModelo.cartaFut;
import dbModelo.equipoFutbol2;



public class frameFutbol{
	
	
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
		ventana.setSize(800, 400);
		ventana.setIconImage(icono.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 150, 45));
		panel.setLayout(null);
		ventana.add(panel);
		
		
		Font fuente = new Font("Arial",Font.BOLD,14);	//fuente para los datos
		
		ArrayList<JTextField>listaValoresFut = new ArrayList<JTextField>();	//arraylist para comprobar un requisito para todos los jtextfields
		
		JLabel titulo = new JLabel("Futbolista");
		titulo.setFont(new Font("Impact",0,30));
		titulo.setBounds(40,20,200,30);
		titulo.setForeground(Color.white);
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
		enviar.setBounds(650,290,130,50);
		enviar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		enviar.setBackground(new Color(236, 236, 236));
		enviar.setBorder(null);
		panel.add(enviar);
		
		
		//Parte de la creacion de la carta
		
		
		//ArrayList para las estadisticas de la carta
		ArrayList<JTextField> estadisticas = new ArrayList<JTextField>();
		
		/*Aqui ya creo los JTextFields porque al llamar al método de insCarta()
		 * le paso los textos de cada uno, pero no los reconoce, por lo cual
		 * los pongo aqui arriba y luego más abajo los hago aparecer y les doy funciones.
		 */
		JTextField ritmo = new JTextField();
		JTextField tiro = new JTextField();
		JTextField pase = new JTextField();
		JTextField regate = new JTextField();
		JTextField defensa = new JTextField();
		JTextField fisico = new JTextField();
		
		
		//Parte de la carta
		Color colorCarta = new Color(70, 57, 12);
		Font fuentaCartaNum = new Font("arial",Font.BOLD,22);
		
		
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
		 * Estos ya están creados de antes para lugo poder crear la carta.
		 * Estos no podran ser mayores a 100 ni menores a 0. Si se deja cualquiera
		 * vacio, este sera reconocido como 0. Tambien estarán todos en un arraylist
		 * para luego hacer los requisitos, será más facil manejarlos así.
		 */
		
		
		ritmo.setHorizontalAlignment(SwingConstants.RIGHT);
		ritmo.setFont(fuentaCartaNum);
		ritmo.setForeground(colorCarta);
		ritmo.setOpaque(false);
		ritmo.setBorder(null);
		ritmo.setBounds(450,217,33,20);
		estadisticas.add(ritmo);
		panel.add(ritmo);
		
		
		tiro.setHorizontalAlignment(SwingConstants.RIGHT);
		tiro.setFont(fuentaCartaNum);
		tiro.setForeground(colorCarta);
		tiro.setOpaque(false);
		tiro.setBorder(null);
		tiro.setBounds(450,240,33,20);
		estadisticas.add(tiro);
		panel.add(tiro);
		
		
		pase.setHorizontalAlignment(SwingConstants.RIGHT);
		pase.setFont(fuentaCartaNum);
		pase.setForeground(colorCarta);
		pase.setOpaque(false);
		pase.setBorder(null);
		pase.setBounds(450,264,33,20);
		estadisticas.add(pase);
		panel.add(pase);
		
		
		regate.setHorizontalAlignment(SwingConstants.RIGHT);
		regate.setFont(fuentaCartaNum);
		regate.setForeground(colorCarta);
		regate.setOpaque(false);
		regate.setBorder(null);
		regate.setBounds(540,217,33,20);
		estadisticas.add(regate);
		panel.add(regate);
		
		
		defensa.setHorizontalAlignment(SwingConstants.RIGHT);
		defensa.setFont(fuentaCartaNum);
		defensa.setForeground(colorCarta);
		defensa.setOpaque(false);
		defensa.setBorder(null);
		defensa.setBounds(540,240,33,20);
		estadisticas.add(defensa);
		panel.add(defensa);
		
		
		fisico.setHorizontalAlignment(SwingConstants.RIGHT);
		fisico.setFont(fuentaCartaNum);
		fisico.setForeground(colorCarta);
		fisico.setOpaque(false);
		fisico.setBorder(null);
		fisico.setBounds(540,264,33,20);
		estadisticas.add(fisico);
		panel.add(fisico);
		
		JLabel flechaImg = new JLabel();
		flechaImg.setBounds(200,100,200,130);
		 
		ImageIcon flecha = new ImageIcon("JFRAME\\imgs\\flecha.png");
		Icon flecha2 = new ImageIcon(flecha.getImage().getScaledInstance(flechaImg.getWidth(), flechaImg.getHeight(), Image.SCALE_SMOOTH));
		flechaImg.setIcon(flecha2);
		panel.add(flechaImg);
		
		
		//Imagen de la carta sobre la que van todos los textfields y el nombre
		JLabel cartaImg2 = new JLabel();
		cartaImg2.setBounds(400,0,260,335);		
		
		ImageIcon carta4 = new ImageIcon("JFRAME\\imgs\\carta.png");
		Icon carta3 = new ImageIcon(carta4.getImage().getScaledInstance(cartaImg2.getWidth(), cartaImg2.getHeight(), Image.SCALE_SMOOTH));
		cartaImg2.setIcon(carta3);
		panel.add(cartaImg2);
		
		
		
		
		enviar.addActionListener(e ->{
			
			//Este int es para todos los requisitos, si se cumplen todos, se crearán el futbolista y la carta
			int reqGeneral = 0;
			
			int requisitos = 0;	//variable para que antes de crear el futbolista cumpla los requisitos de entrada de datos
			
			//boolean para cada requisito
			boolean dniReq = false,dniIgual = false, dni1 = false, dni2=false, salId = false, comaPunto = false;
			String errores = "Errores: \n";
			
			
			
			
				//Con esto compruebo si el dni esta vacio o hay un espacio, asi tambien se hace un campo obligatorio
				if (dniText.getText().equals("") || dniText.getText().contains(" ")) {
					dniReq = true;
				}
				
				//comprobar que el dni tenga 4 caracteres
				if(dniText.getText().length() == 4) {
					requisitos++;
					reqGeneral++;
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
					reqGeneral++;
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
					reqGeneral++;
				}
					
				
				//comprobar si el salario o el ID son negativos
				if (salarioText.getText().contains("-") || idequipoText.getText().contains("-")) {
						errores += "- El salario y el ID de equipo no pueden ser negativos \n";
						
				}else {
					requisitos++;
					reqGeneral++;
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
					reqGeneral++;
				}
				
				if (salarioText.getText().contains(" ") || dniText.getText().contains(" ")) {
					errores += "- El salario o el ID de equipo contienen un espacio \n";
				}else {
					requisitos++;
					reqGeneral++;
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
					reqGeneral++;
				}
				

				
				if(dniReq) {
					JOptionPane.showMessageDialog(ventana, "El DNI es un campo obligatorio y no puede\ntener espacios", 
							"Error futbolista", JOptionPane.ERROR_MESSAGE);
				}else {
					if(dniIgual) {
						JOptionPane.showMessageDialog(ventana, "El DNI ya existe, pon otro", 
								"Error futbolista", JOptionPane.ERROR_MESSAGE);
					}else {
				
						if(requisitos != 7) {
								JOptionPane.showMessageDialog(ventana, errores, 
										"Error futbolista", JOptionPane.ERROR_MESSAGE);
							
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
				
				if(salarioText.getText().equals("")) {
					salarioText.setText("0");
				}
				
				
				if(idequipoText.getText().equals("")) {
					idequipoText.setText("0");
				}
			

				
				/*
				 *Esta parte es de cuando pulsamos el boton la segunda vez, seria para crear el
				 *futbolista y la carta.
				 *Primero los requisitos antes de la creacion. Requisitos:
				 *1.El valor no puede tener ninguna letra.
				 *2.El valor es mayor o igual a cero y menor que 100.
				 *3.El valor no puede tener ningun espacio.
				 *4.EL valor no puede tener ni coma ni punto.
				 */
				
				
				
			String errorCarta = "Errores:\n";
			int reqCarta = 0;
			
			boolean letraTiene = false, numValido = false, vacio = false, comPunto = false;
			
			
			
			//Comprobar si algún valor contiene una letra
			for(int i = 0; i < estadisticas.size(); i++) {
				for (int x = 0; x < letras.length; x++) {
					if(estadisticas.get(i).getText().contains(letras[x])) {
						letraTiene = true;
					}
				}
			}
			
			if (letraTiene) {
				errorCarta += "- No se admiten letras\n";
			}else {
				reqCarta++;
				reqGeneral++;
			}
			
			//comprobar si algún valor es negativo o es mayor de 100
			for(int i = 0; i < estadisticas.size(); i++) {
				if (estadisticas.get(i).getText().startsWith("-") || estadisticas.get(i).getText().length() >= 3) {
					numValido = true;
				}
			}
			
			if(numValido) {
				errorCarta += "- Solo se pueden poner números entre 0 - 99\n";
			}else {
				reqCarta++;
				reqGeneral++;
			}
			
			//comprobar si algún valor es vacío o tiene espacios
			for (int i = 0; i < estadisticas.size(); i++) {
				if(estadisticas.get(i).getText().equals("") || estadisticas.get(i).getText().contains(" ")) {
					vacio = true;
				}
			}
			
			if (vacio) {
				errorCarta += "- No se puede dejar ningún\nvalor vacío ni puede tener espacios\n";
			}else {
				reqCarta++;
				reqGeneral++;
			}
			
			//Comprobar si algún valor tiene coma o punto
			for(int i = 0; i < estadisticas.size(); i++) {
				if (estadisticas.get(i).getText().contains(",") || estadisticas.get(i).getText().contains(".")) {
					comPunto = true;
				}
			}
			
			if (comPunto) {
				errorCarta += "- No se pueden poner comas ni puntos\n";
			}else {
				reqCarta++;
				reqGeneral++;
			}
			
			if (reqCarta != 4) {
				JOptionPane.showMessageDialog(ventana, errorCarta, "Error carta", JOptionPane.ERROR_MESSAGE);
			}
			
			if(reqGeneral == 11) {
				JOptionPane.showMessageDialog(ventana, "Jugador y carta creados", "exito", JOptionPane.INFORMATION_MESSAGE);
				
				Futbol2.insFutbolista(dniText.getText(),nombreText.getText(), apellidoText.getText(), 
						Integer.parseInt(salarioText.getText()), Integer.parseInt(idequipoText.getText()));
				
				cartaFut.insCarta(dniText.getText(), Integer.parseInt(ritmo.getText()), Integer.parseInt(tiro.getText()), 
						Integer.parseInt(pase.getText()), Integer.parseInt(regate.getText()), 
						Integer.parseInt(defensa.getText()), Integer.parseInt(fisico.getText()));
				
				ventana.setVisible(false);
			}

		});
		
		ventana.setVisible(true);
		return ventana;
	}
	
	private static JFrame agregarEquipo(ImageIcon icono) {
		
		//arraylist de los equipos para comprobar si ya existe el id y el nombre
		ArrayList<Equipo2>listaEquipos = equipoFutbol2.verEquipos();
		
		JFrame ventana = new JFrame("Agregar Equipo");
		ventana.setResizable(false);
		ventana.setSize(300,430);
		ventana.setIconImage(icono.getImage());
		
		Font fuenteLabels = new Font("arial",Font.BOLD,17);
		Font fuenteInputs = new Font("arial",0,15);
		
		
		JPanel panelValores = new JPanel();
		panelValores.setBounds(0,50,300,430);
		panelValores.setBackground(Color.white);
		panelValores.setLayout(null);
		ventana.add(panelValores);
		
		JLabel titulo = new JLabel("CREAR EQUIPO", SwingConstants.CENTER);
		titulo.setBounds(0, 20, 300,30);
		titulo.setFont(new Font("impact", 0, 30));
		panelValores.add(titulo);
		
		JLabel id= new JLabel("ID de equipo", SwingConstants.CENTER);
		id.setBounds(0,80,300,17);
		id.setFont(fuenteLabels);
		panelValores.add(id);
		
		JLabel idTexto = new JLabel();
		idTexto.setBounds(0,100,300,17);
		idTexto.setFont(fuenteLabels);
		idTexto.setHorizontalAlignment(SwingConstants.CENTER);
		idTexto.setText((listaEquipos.size()+1)+"");
		panelValores.add(idTexto);
		
		JLabel nombre = new JLabel("Nombre de equipo", SwingConstants.CENTER);
		nombre.setBounds(0,140,300,17);
		nombre.setFont(fuenteLabels);
		panelValores.add(nombre);
		
		JTextField nombreInput = new JTextField();
		nombreInput.setBounds(60,160,180,30);
		nombreInput.setFont(fuenteInputs);
		nombreInput.setHorizontalAlignment(SwingConstants.CENTER);
		panelValores.add(nombreInput);
		
		JLabel ciudad = new JLabel("Ciudad", SwingConstants.CENTER);
		ciudad.setBounds(0,220,300,17);
		ciudad.setFont(fuenteLabels);
		panelValores.add(ciudad);
		
		JTextField ciudadInput = new JTextField();
		ciudadInput.setBounds(60,240,180,30);
		ciudadInput.setFont(fuenteInputs);
		ciudadInput.setHorizontalAlignment(SwingConstants.CENTER);
		panelValores.add(ciudadInput);
		
		JButton boton = new JButton("Enviar");
		boton.setBounds(100,300,100,50);
		boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelValores.add(boton);
		
		boton.addActionListener(e ->{
			
			/*
			 * Cuando el boton se pulse se van a comprobar los datos y si todo está bien
			 * se creará el equipo. Como requisito, los valores no pueden ser vacíos, no se pueden repetir
			 * si ya existe (solo el nombre de equipo, ya que en una ciudad pueden haber más de un equipo)
			 * y no se podrán introducir números.
			 */
			
			boolean nombreRep = false, numEnc = false, letraEnc = false, letra2Enc = false;
			int requisitos = 0;
			String error = "Errores:\n";
			
			//comprobar si existe el valor introducido del nombre
			for (int i = 0; i < listaEquipos.size(); i++) {
				if(nombreInput.getText().equalsIgnoreCase(listaEquipos.get(i).getNombre())) {
					nombreRep = true;
				}
			}
			
			if(nombreRep) {
				JOptionPane.showMessageDialog(ventana, "Ese nombre ya existe", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else {
				
				//comprobar si algún valor está vacío				
				for(int i = 0; i < letras.length; i++) {
					if (nombreInput.getText().contains(letras[i])) {
						letraEnc = true;
						
					/*
					 * Lo suyo sería poner un else if pero va mal si lo ponemos
					 * porque si el primer if se cumple, el segundo no se va a
					 * comprobar. El problema es que si introducimos el mismo valor
					 * en los dos campos teniendo puesto el else if, nos saltará
					 * el error de que hay un campo vacío cuando sí que tiene algo escrito.
					 * Eso es porque si introducimos una letra, esta en el else if no se
					 * va a comprobar y contaría como vacío.
					 */
					}if(ciudadInput.getText().contains(letras[i])) {
						letra2Enc = true;
					}
				}
				
				if(letraEnc && letra2Enc) {
					requisitos++;
				}else{
					error += "- No puedes dejar un campo vacío\n";
				}
				
				
				//comprobar si tiene algún número
				for(int i = 0; i < numeros.length;i++) {
					if (nombreInput.getText().contains(numeros[i]) || ciudadInput.getText().contains(numeros[i])) {
						numEnc = true;
					}
				}
				
				if(numEnc) {
					error += "- No puedes introducir números\n";
				}else {
					requisitos++;
				}
	
				if (requisitos == 2) {
					JOptionPane.showMessageDialog(ventana, "Equipo creado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
					ventana.setVisible(false);
					equipoFutbol2.insEquipo(nombreInput.getText(), ciudadInput.getText());
				}else {
					JOptionPane.showMessageDialog(ventana, error, "No se ha creado el equipo", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		ventana.setVisible(true);
		return ventana;
	}
	
 	private static JFrame idJug(ImageIcon icono) {

		
		JFrame idJug = new JFrame("Mostrar jugador por ID");
		idJug.setSize(600, 400);
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
		panel2.setBounds(0,50,600, 30);
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		idJug.add(panel2);
		
		JTextArea textoJug = new JTextArea();
		textoJug.setFont(new Font("Arial",Font.BOLD,13));
		
		panel2.add(textoJug);
		
		
		//panel para mostrar la carta
		JPanel panelCarta = new JPanel();
		panelCarta.setBackground(Color.WHITE);
		panelCarta.setBounds(0,80,600,320);
		panelCarta.setLayout(null);
		idJug.add(panelCarta);
		
		JLabel cartaImg = new JLabel();
		cartaImg.setBounds(180,0,210,285);
		 
		ImageIcon carta = new ImageIcon("JFRAME\\imgs\\carta.png");
		Icon carta2 = new ImageIcon(carta.getImage().getScaledInstance(cartaImg.getWidth(), cartaImg.getHeight(), Image.SCALE_SMOOTH));
        cartaImg.setIcon(carta2);
        
        Color colorCarta = new Color(70, 57, 12);
		Font fuenteCartaNum = new Font("arial",Font.BOLD,18);
        
        JLabel nombreJug = new JLabel();
        nombreJug.setFont(new Font("arial",Font.BOLD,20));
        nombreJug.setHorizontalAlignment(SwingConstants.CENTER);
        nombreJug.setBounds(180,155,210,20);
        nombreJug.setForeground(colorCarta);
        panelCarta.add(nombreJug);
        
        JLabel ritmo = new JLabel();
        ritmo.setForeground(colorCarta);
        ritmo.setFont(fuenteCartaNum);
        ritmo.setHorizontalAlignment(SwingConstants.RIGHT);
        ritmo.setBounds(193,184,50,18);
        panelCarta.add(ritmo);
        
        JLabel tiro = new JLabel();
        tiro.setForeground(colorCarta);
        tiro.setFont(fuenteCartaNum);
        tiro.setHorizontalAlignment(SwingConstants.RIGHT);
        tiro.setBounds(193,204,50,18);
        panelCarta.add(tiro);
        
        JLabel pase = new JLabel();
        pase.setForeground(colorCarta);
        pase.setFont(fuenteCartaNum);
        pase.setHorizontalAlignment(SwingConstants.RIGHT);
        pase.setBounds(193,224,50,18);
        panelCarta.add(pase);
        
        JLabel regate = new JLabel();
        regate.setForeground(colorCarta);
        regate.setFont(fuenteCartaNum);
        regate.setHorizontalAlignment(SwingConstants.RIGHT);
        regate.setBounds(267,184,50,18);
        panelCarta.add(regate);
        
        JLabel defensa = new JLabel();
        defensa.setForeground(colorCarta);
        defensa.setFont(fuenteCartaNum);
        defensa.setHorizontalAlignment(SwingConstants.RIGHT);
        defensa.setBounds(267,204,50,18);
        panelCarta.add(defensa);
        
        JLabel fisico = new JLabel();
        fisico.setForeground(colorCarta);
        fisico.setFont(fuenteCartaNum);
        fisico.setHorizontalAlignment(SwingConstants.RIGHT);
        fisico.setBounds(267,224,50,18);
        panelCarta.add(fisico);
        
        JLabel media = new JLabel();
        media.setForeground(colorCarta);
        media.setFont(new Font("arial",Font.BOLD, 27));
        media.setHorizontalAlignment(SwingConstants.LEFT);
        media.setBounds(223,35,50,27);
        panelCarta.add(media);
        
        panelCarta.add(cartaImg);
        
        ArrayList<carta>listaDeCartas = cartaFut.listaCartas();
		
		btn_elegir.addActionListener(e ->{
			textoJug.setText(Futbol2.dniFutbolista(elegirDni.getSelectedItem().toString()).toString());
			nombreJug.setText(Futbol2.dniFutbolista(elegirDni.getSelectedItem().toString()).getNombre().toUpperCase());
			
			//Aqui voy a sacar las estadísticas de cada jugador comparando cada dni y con que elegimos del JComboBox
			int cartaEspecifica = 0, mediaCalc = 0;
			
			
			for (int i = 0; i < listaDeCartas.size();i++) {
				if (listaDeCartas.get(i).getDni().equalsIgnoreCase(elegirDni.getSelectedItem().toString())) {
					cartaEspecifica = i;
				}
				
			}
			
			ritmo.setText(listaDeCartas.get(cartaEspecifica).getRitmo()+"");
			tiro.setText(listaDeCartas.get(cartaEspecifica).getTiro()+"");
			pase.setText(listaDeCartas.get(cartaEspecifica).getPase()+"");
			regate.setText(listaDeCartas.get(cartaEspecifica).getRegate()+"");
			defensa.setText(listaDeCartas.get(cartaEspecifica).getDefensa()+"");
			fisico.setText(listaDeCartas.get(cartaEspecifica).getFisico()+"");
			
			mediaCalc = (listaDeCartas.get(cartaEspecifica).getRitmo()+listaDeCartas.get(cartaEspecifica).getTiro()
					+listaDeCartas.get(cartaEspecifica).getPase() + listaDeCartas.get(cartaEspecifica).getRegate() +
					listaDeCartas.get(cartaEspecifica).getDefensa() + listaDeCartas.get(cartaEspecifica).getFisico()) / 6;
			
			media.setText(mediaCalc + "");
			
		
		});
		btn_eliminar.addActionListener(e ->{
			textoJug.setText(null);
			nombreJug.setText(null);
			ritmo.setText(null);
			tiro.setText(null);
			pase.setText(null);
			regate.setText(null);
			defensa.setText(null);
			fisico.setText(null);
		});
		
		idJug.setVisible(true);
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
		
		
		Font fuenteBtn = new Font("Arial",Font.BOLD,15);
		Color colorBtn = new Color(236, 236, 236);
		
		ArrayList<JButton>botones = new ArrayList<JButton>();
		
		ImageIcon icono = new ImageIcon("JFRAME\\imgs\\icono-pelota.png");
		ventanaInicial.setIconImage(icono.getImage());

		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0,100,350, 450);
		panelBotones.setLayout(null);
		panelBotones.setBackground(new Color(40, 150, 45));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0,0,350,30);
		panelTitulo.setLayout(null);
		panelTitulo.setBackground(new Color(31, 111, 34));
		panelBotones.add(panelTitulo);
		
		JLabel titulo = new JLabel("MENU FUTBOL",SwingConstants.CENTER);
		titulo.setFont(new Font("arial",Font.BOLD,19));
		titulo.setBounds(0,5,350,19);
		titulo.setForeground(new Color(246, 246, 246));
		panelTitulo.add(titulo);
		
		JButton btn_vj = new JButton("Mostrar Jugadores");
		btn_vj.setBounds(45, 40, 250, 50);
		btn_vj.setFont(fuenteBtn);
		btn_vj.setBackground(colorBtn);
		btn_vj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_vj);
		
		JButton btn_ve = new JButton("Mostrar Equipos");
		btn_ve.setBounds(45, 100, 250, 50);
		btn_ve.setFont(fuenteBtn);
		btn_ve.setBackground(colorBtn);
		btn_ve.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_ve);
		
		JButton btn_af = new JButton("Agregar Jugador y carta");
		btn_af.setBounds(45, 160, 250, 50);
		btn_af.setFont(fuenteBtn);
		btn_af.setBackground(colorBtn);
		btn_af.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_af);
		
		JButton btn_ae = new JButton("Agregar Equipo");
		btn_ae.setBounds(45, 220, 250, 50);
		btn_ae.setFont(fuenteBtn);
		btn_ae.setBackground(colorBtn);
		btn_ae.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_ae);
		
		JButton btn_idf = new JButton("Mostrar Jugador por ID");
		btn_idf.setBounds(45, 280, 250, 50);
		btn_idf.setFont(fuenteBtn);
		btn_idf.setBackground(colorBtn);
		btn_idf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_idf);
		
		JButton btn_ide= new JButton("Mostrar Equipo por ID");
		btn_ide.setBounds(45, 340, 250, 50);
		btn_ide.setFont(fuenteBtn);
		btn_ide.setBackground(colorBtn);
		btn_ide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botones.add(btn_ide);
		
		
		panelBotones.add(btn_vj);panelBotones.add(btn_ve);panelBotones.add(btn_af);panelBotones.add(btn_ae);panelBotones.add(btn_idf);panelBotones.add(btn_ide);
		ventanaInicial.add(panelBotones);
		
		//Esto es para quitarle el borde a todos los botones
		for(int i = 0; i < botones.size();i++) {
			botones.get(i).setBorder(null);
		}
		
		ventanaInicial.setVisible(true);
		
		
		diseñoMain(botones, colorBtn, icono);
		
	}
	
	//Aqui está el diseño
	private static void diseñoMain(ArrayList<JButton> botones, Color colorBtn, ImageIcon icono) {
		
		//Queria hacer un arraylist para luego con un for añadir un MouseListener a cada boton pero no deja
		botones.get(0).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(0).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(0).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarJug(icono);
			}
		});
		
		botones.get(1).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(1).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(1).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarEquipos(icono);
			}
		});
		
		botones.get(2).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(2).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(2).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				agregarFut(icono);
			}
		});
		
		botones.get(3).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(3).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(3).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				agregarEquipo(icono);
			}
		});
		
		botones.get(4).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(4).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(4).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				idJug(icono);
			}
		});
		
		botones.get(5).addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botones.get(5).setBackground(colorBtn);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botones.get(5).setBackground(new Color(183, 183, 183));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				idEquipo(icono);
			}
		});
		
		
	}

}
