package com.tmbs.ta05_11;

import javax.swing.JOptionPane;

//11) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral
//O no. Usa un switch para ello.

public class Main_EJ11 {
	
	public static void main(String[] args) {
		
		String dayImput = JOptionPane.showInputDialog("Introduce el dia de la semana");
		String isWorkingDay;
		
		if (dayImput != null) {
			
			switch (dayImput.toUpperCase()) {
			
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
            	isWorkingDay = "Es un día laboral";
                break;
            case "SABADO":
            case "DOMINGO":
                isWorkingDay = "No es un día laboral";
                break;
            default:
            	isWorkingDay = "El dia introducido no es invalido.";
                break;
        }
			
		}else {
			
			isWorkingDay = "EXIT APP THK!";
		}
		
		JOptionPane.showMessageDialog(null, isWorkingDay);		
	}	
		
}	
