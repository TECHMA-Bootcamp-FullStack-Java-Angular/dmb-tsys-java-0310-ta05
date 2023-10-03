package com.tmbs.ta05_09;

import java.util.stream.IntStream;

//9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
//que desees.

public class Main_EJ09 {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 100).filter(e -> e % 2 == 0 || e % 3 == 0).forEach(System.out::println);
	}
}
