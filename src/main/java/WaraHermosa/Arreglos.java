package main.java.WaraHermosa;

import java.lang.reflect.Array;

public class Arreglos {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = new String[5];
		colors[0] = "black";
		colors[1] = "red";
		colors[2] = "white";
		colors[3] = "blue";
		colors[4] = "pink";

		String cad = "rainbow";
		for (int i = 0; i < colors.length; i++) {
			cad = cad + colors[i];
			System.out.println(cad);
		}
		String cad2 = "HOLA";
		for (String number : colors) {
			cad2 = cad2 + number;
			System.out.println(cad2);

		}

		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");

		for (int i = 0; i < cadenas.length; i++) {
			for (int j = i + 1; j < cadenas.length; j++) {
				if (cadenas[i].equals(cadenas[j]))
					System.out.println(cadenas[j]);
			}
		}

		for (int indice = 0; indice < cadenas.length; indice++) {
//			if (cadenas[indice].equals(.length)) {
//				System.out.print(indice);
//			}

		}
	}
}
