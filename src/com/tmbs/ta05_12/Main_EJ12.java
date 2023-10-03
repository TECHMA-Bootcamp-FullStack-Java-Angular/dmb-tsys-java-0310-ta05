package com.tmbs.ta05_12;

import javax.swing.JOptionPane;

//12) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
//se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
//la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición
//de salida (3 intentos y si acierta sale, aunque le queden intentos).
public class Main_EJ12 {
	
	public static void main(String[] args) {
		
		
		String password = "P4$$w0rd";
		String inputPass = "";
		int intentos = 3;

		while (!inputPass.equals(password) && intentos > 0 ) {
			
			inputPass= JOptionPane.showInputDialog("\nIntentos "+intentos+"\nIntroduce tu contraseña: ");
			intentos--;
		}

		String resultText = password.equals(inputPass)
				? "Contraseña correcta\nIniciando sesion..." 
				: "Agotados los intentos\nTu cuenta ha sido bloqueada.";
		
		JOptionPane.showMessageDialog(null, resultText);

	}

	

}
