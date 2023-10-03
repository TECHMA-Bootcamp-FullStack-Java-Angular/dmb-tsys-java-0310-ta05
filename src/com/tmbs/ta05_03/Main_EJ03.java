package com.tmbs.ta05_03;

import javax.swing.JOptionPane;

//3) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
//(recuerda usar JOptionPane).

public class Main_EJ03 {
	
	public static void main(String[] args) {
		
		String nameUser = JOptionPane.showInputDialog( null,"Introduce tu nombre" ,"EJERCICIO 3" , 3 );

		if (nameUser != null) {
			JOptionPane.showMessageDialog(null, "Bienvenido " + nameUser , "EJERCICIO 3", -1 );
		}
		
	}
}
