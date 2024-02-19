package MezclaLayouts;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame grid = new JFrame("Grid");
        
        grid.setLayout(new GridBagLayout()); // Cambiado a un diseño de 2x2
        
        
        JButton boton1 = new JButton("boton1");
        JButton boton2 = new JButton("boton2");
        JButton boton3 = new JButton("boton3");
        JButton boton4 = new JButton("boton4");
        
        
        grid.add(boton1);
        grid.add(boton2);
        grid.add(boton3);
        grid.add(boton4);
        grid.pack();
        grid.setVisible(true);

}
}
