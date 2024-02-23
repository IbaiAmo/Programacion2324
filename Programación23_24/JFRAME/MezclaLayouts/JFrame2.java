package MezclaLayouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame2 {

	private static void GUI() {
     JFrame ladoi = new JFrame("Capcha.");
     JPanel panel= new JPanel();
     panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
     panel.setBackground(Color.yellow);
     panel.add(new JLabel("Hello."));
     panel.add(new JLabel("Are you a Robot?"));
     JButton yes = new JButton("Yes");
     JButton no = new JButton("No");
     panel.add(yes);
     panel.add(no);
     
     no.addActionListener(e ->{
    	 ladoi.setVisible(false);
    	 Contra();
     });
     
     yes.addActionListener(e ->{
    	 ladoi.setVisible(false);
    	 GridLayout(); 
     });
     
     
     ladoi.add(panel);
        ladoi.pack();
        ladoi.setBounds(50, 50, 250,150);
        ladoi.setVisible(true);
        
	}
	
	public static void Contra() {
		JFrame contra = new JFrame ("Contraseña");
		contra.setLayout(new GridLayout(3,3));
		contra.setPreferredSize(new Dimension(400,400));
		contra.setBounds(700, 200, 0, 0);
		contra.setResizable(false);
		
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		JButton boton4 = new JButton("4");
		JButton boton5 = new JButton("5");
		JButton boton6 = new JButton("6");
		JButton boton7 = new JButton("7");
		JButton boton8 = new JButton("8");
		JButton boton9 = new JButton("9");
		
		contra.add(boton1);contra.add(boton2);contra.add(boton3);contra.add(boton4);contra.add(boton5);contra.add(boton6);contra.add(boton7);
		contra.add(boton8);contra.add(boton9);
		
		contra.pack();
		contra.setVisible(true);
	}
	
	public static JFrame GridLayout() {

		JFrame grid = new JFrame("GridLayout");

		grid.setLayout(new GridLayout(2, 2));
		grid.setPreferredSize(new Dimension(700, 500));
		
		
		String[] options = { "BoxLayout", "AbsolutLayout" };
		
		JButton boton1 = new JButton("Mostrar AbsolutLayout");
		JComboBox<String> comboBox = new JComboBox<>(options);
		JButton boton2 = new JButton("Mostrar BoxLayout");
		JButton boton3 = new JButton("Salir");
		
		grid.add(boton1);
		
		grid.add(comboBox);

		grid.add(boton2);

		grid.add(boton3);

		
		boton1.addActionListener(e ->{
			grid.setVisible(false);
			new calculadora();
		});

		comboBox.addActionListener(e -> {
			String selectedOption = (String) comboBox.getSelectedItem();
			if (selectedOption.equals("BoxLayout")) {
				grid.setVisible(false);
				GUI();
				
			} else {
				grid.setVisible(false);
				new calculadora();
			}

		});
		boton2.addActionListener(e -> {
			grid.setVisible(false);
			GUI();
		});

		boton3.addActionListener(e -> {
			grid.setVisible(false);
		});

		grid.pack();
		grid.setVisible(true);
		return grid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		GridLayout();
		
		

	}

}
