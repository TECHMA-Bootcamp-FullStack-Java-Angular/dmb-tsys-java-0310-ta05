package com.tmbs.ta05_10;

//10) Realiza una aplicación que nos pida un número de ventas a introducir, después nos
//pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
//mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

import java.util.Arrays;
import java.util.Scanner;

public class Main_EJ10 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		runEjercise();				
	}
	
	public  static void runEjercise() {
		
		int amountSales =(int) AskValues("NUMERO DE VENTAS: ");
		Double[] sales = addSales(amountSales);
		System.out.println(sumSales(sales));
		sc.close();	
	}

	
	private static  Double[] addSales(int amountSales) {	
		Double[] sales = new Double[amountSales];
		
		for (int i = 0; i < sales.length; i++) {
			sales[i]=AskValues("Introduce el valor de la venta "+ (i +1)+ ": ");
		}
		return sales;
	}
	
	private static String sumSales(Double[] sales) {	
       Double totalSum = Arrays.stream(sales).reduce((double)0 ,(a,b)->  a + b);
       return "SUMA TOTAL "+totalSum;
	}
	

	private static double AskValues(String txt) {
		System.out.print(txt);
		return   Double.valueOf(sc.next());

	}

}
