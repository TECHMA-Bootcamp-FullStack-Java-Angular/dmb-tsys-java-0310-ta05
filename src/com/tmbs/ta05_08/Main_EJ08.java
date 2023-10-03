package com.tmbs.ta05_08;

//8) Haz el mismo ejercicio anterior con un bucle for.
public class Main_EJ08 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++)
			System.out.print((i % 10 == 0) ? i + "\n" : i + "\t");

	}

}
