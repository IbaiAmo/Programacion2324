package MezclaLayouts;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JTextField;

import javax.swing.SwingUtilities;


public class calculadora {


	private JFrame frame;

	private JTextField displayField;


	private double total = 0;

	private double temp = 0;

	private String operation = "";

	private boolean startInput = true;


	public calculadora() {

    	frame = new JFrame("Calculadora");

    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	frame.setSize(300, 400);

    	frame.setLayout(null); // Configurar layout a null para usar posicionamiento absoluto


    	displayField = new JTextField();

    	displayField.setBounds(10, 10, 260, 50);

    	displayField.setEditable(false);

    	frame.add(displayField);


    	addButton("1", 10, 70, 60, 60);

    	addButton("2", 80, 70, 60, 60);

    	addButton("3", 150, 70, 60, 60);

    	addButton("4", 10, 140, 60, 60);

    	addButton("5", 80, 140, 60, 60);

    	addButton("6", 150, 140, 60, 60);

    	addButton("7", 10, 210, 60, 60);

    	addButton("8", 80, 210, 60, 60);

    	addButton("9", 150, 210, 60, 60);

    	addButton("0", 10, 280, 60, 60);


    	addButton("+", 220, 70, 60, 60);

    	addButton("-", 220, 140, 60, 60);

    	addButton("*", 220, 210, 60, 60);

    	addButton("/", 220, 280, 60, 60);

    	addButton("=", 150, 280, 130, 60);

    	addButton("C", 80, 280, 60, 60);


    	frame.setVisible(true);

	}


	private void addButton(String label, int x, int y, int width, int height) {

    	JButton button = new JButton(label);

    	button.setBounds(x, y, width, height);

    	button.addActionListener(new ActionListener() {

        	public void actionPerformed(ActionEvent e) {

            	buttonClicked(label);

        	}

    	});

    	frame.add(button);

	}


	private void buttonClicked(String buttonLabel) {

    	if (buttonLabel.equals("C")) {

        	total = 0;

        	temp = 0;

        	operation = "";

        	startInput = true;

        	displayField.setText("");

    	} else if (buttonLabel.matches("[0-9]")) {

        	if (startInput) {

            	displayField.setText(buttonLabel);

            	startInput = false;

        	} else {

            	displayField.setText(displayField.getText() + buttonLabel);

        	}

    	} else if (buttonLabel.equals("+") || buttonLabel.equals("-") || buttonLabel.equals("*")

            	|| buttonLabel.equals("/")) {

        	if (!startInput) {

            	temp = Double.parseDouble(displayField.getText());

            	operation = buttonLabel;

            	startInput = true;

        	}

    	} else if (buttonLabel.equals("=")) {

        	if (!startInput) {

            	double secondOperand = Double.parseDouble(displayField.getText());

            	if (operation.equals("+")) {

                	total = temp + secondOperand;

            	} else if (operation.equals("-")) {

                	total = temp - secondOperand;

            	} else if (operation.equals("*")) {

                	total = temp * secondOperand;

            	} else if (operation.equals("/")) {

                	if (secondOperand != 0) {

                    	total = temp / secondOperand;

                	} else {

                    	displayField.setText("Error");

                    	return;

                	}

            	}

            	displayField.setText(String.valueOf(total));

            	startInput = true;

        	}

    	}

	}


	public static void main(String[] args) {

    	SwingUtilities.invokeLater(new Runnable() {

        	public void run() {

            	new calculadora();

        	}

    	});

	}

}