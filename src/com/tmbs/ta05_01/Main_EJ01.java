package com.tmbs.ta05_01;

/* 1) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que
funciona. */

public class Main_EJ01 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 12;
		
		if (num1 != num2) System.out.println("num1 y num2 no son iguales");
		if (num1 < num2) System.out.println("num2 es mayor que num 1");
		if (++num1 == --num2) System.out.println("num1 y num2 ahora son iguales");
	
	}
}