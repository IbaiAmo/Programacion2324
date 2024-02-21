package MezclaLayouts;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JFrame2 {

	public static JFrame GridBagLayout() {

		JFrame grid = new JFrame("GridBagLayout");

		grid.setLayout(new GridLayout(2, 2));
		grid.setPreferredSize(new Dimension(700, 500));

		String[] options = { "BoxLayout", "AbsolutLayout" };
		
		JButton boton1 = new JButton("Mostrar AbsolutLayout");
		JComboBox<String> comboBox = new JComboBox<>(options);
		JButton boton2 = new JButton("Mostrar BoxLayout");
		JButton boton3 = new JButton("Salir");
		
		
		grid.add(boton1);

		grid.add(boton2);

		grid.add(boton3);

		grid.add(comboBox);

		comboBox.addActionListener(e -> {
			String selectedOption = (String) comboBox.getSelectedItem();
			if (selectedOption.equals("Opción 1")) {
				grid.setVisible(false);

			} else {
				grid.setVisible(false);
			}

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

		GridBagLayout();

	}

}
