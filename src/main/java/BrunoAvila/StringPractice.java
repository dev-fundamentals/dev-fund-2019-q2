package main.java.BrunoAvila;

public class StringPractice {

	public static void main(String[] args) {
		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");

		String palabras = "palabras: ";
		String indices = "indices: ";

		for (int i = 0; i < cadenas.length; i++) {
			for (int j = i + 1; j < cadenas.length; j++) {
				if (cadenas[i].equals(cadenas[j]) && !palabras.contains(cadenas[i])) {
					palabras += cadenas[i];
					palabras += ", ";
				}
			}
			if (palabras.contains(cadenas[i])) {
				indices += i;
				indices += ", ";
			}
		}
		System.out.println(palabras);
		System.out.println(indices);
	}

}