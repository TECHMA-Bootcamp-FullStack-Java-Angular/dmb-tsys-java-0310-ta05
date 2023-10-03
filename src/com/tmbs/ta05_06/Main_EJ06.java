package com.tmbs.ta05_06;

//6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
//calcule el precio final con IVA. El IVA sera una constante que sera del 21%

import javax.swing.JOptionPane;

public class Main_EJ06 {
	
	public static void main(String[] args) {

		final double IVA21 = 0.21;
		String msg = "EXIT APP";
		double priceProduct = 0.0;
		
		do {
			
			String priceImput = JOptionPane.showInputDialog("Introduce el precio del producto:");
			priceProduct = checkValidPrice(priceImput);
			
		} while (priceProduct==0);
		
		if (priceProduct != -1.0) {
			double priceVAT = (priceProduct * IVA21) + priceProduct;
			msg = "El precio del producto \n" + priceVAT + "€. IVA INC.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
			
	}
	
	
	
	private static double checkValidPrice(String numStr) {
		
		try {	
			   return Double.parseDouble(numStr);
			} catch (NumberFormatException nfe) {
				return 0.0;
			} catch (NullPointerException npe) {
				return -1.0;
			}

	}

}
