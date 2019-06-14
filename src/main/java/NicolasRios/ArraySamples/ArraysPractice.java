package main.java.NicolasRios.ArraySamples;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("HOLA");

		String index = " ";
		String repeated = " ";

		for (int i = 0; i < cadenas.length - 1; i++) {

			for (int c = i + 1; c < cadenas.length; c++) {
				for (int e = c + i + 1; e < cadenas.length; e++) {
					if (cadenas[i].equals(cadenas[c])) {
						if (cadenas[c].equals(cadenas[e])) {
							System.out.println(cadenas[e]);
						}
					}

				}

			}
		}

		for (int indice = 0; indice < cadenas.length; indice++) {
			if (cadenas[indice].equals("HOLA")) {
				System.out.println(indice);
			}

		}
	}

}
