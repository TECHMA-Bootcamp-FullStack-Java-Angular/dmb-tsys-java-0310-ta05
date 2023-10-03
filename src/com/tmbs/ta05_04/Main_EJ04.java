package com.tmbs.ta05_04;

//4) Haz una aplicación que calcule el área de un circulo (pi*R?). El radio se pedirá por teclado
//(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
//método pow de Math.

import javax.swing.JOptionPane;

public class Main_EJ04 {

	public static void main(String[] args) {

		double radioInput = askValue();

		JOptionPane.showMessageDialog(null, calculateCircleArea(radioInput));
	}

	private static double askValue() {

		String title = "Calcula el area de un Circulo";
		String msgPanel = "Introduce el valor del radio (cm)";

		String value = JOptionPane.showInputDialog(null, msgPanel, title, 3);

		if (value == null || value.isEmpty() || !isNumber(value)) {
			JOptionPane.showMessageDialog(null, "Debe introducir una numero valido");
			return askValue();
		}

		return Double.parseDouble(value);
	}

	private static boolean isNumber(String numberStr) {
		return numberStr.chars().allMatch(Character::isDigit);
	}

	private static String calculateCircleArea(Double radioInput) {

		Double radio = radioInput, area = Math.PI * Math.pow(radio, 2);

		return "El área del circulo es:  " + String.format("%.2f", area) + " cm2";
	}

}