package com.tmbs.ta05_05;

import java.util.Scanner;

//5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

public class Main_EJ05 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.print("Introduce el numero que deseas comprobar: ");
		
		if (sc.hasNextInt()) {
			
			System.out.println(esPar(sc.nextInt()));
			
		} else {
			
			System.err.println("Error: Debes colocar un valor numerico");
		}
			
	}


	private static String esPar(int n) { 
		return (n % 2 == 0) 
				? "Es divisible entre 2" 
				: "NO es divisible entre 2";
	}
}
