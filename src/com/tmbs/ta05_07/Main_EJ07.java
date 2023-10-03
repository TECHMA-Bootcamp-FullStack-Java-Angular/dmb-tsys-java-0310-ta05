package com.tmbs.ta05_07;

//7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

public class Main_EJ07 {

	public static void main(String[] args) {

		int num = 0;

		while (num < 100) {
			num++;
			System.out.print((num % 10 == 0) ? num + "\n" : num + "\t");

		}
	}

}
