package main.java.NicolasRios;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] teams = new String[5];
		teams [0] = "Oriente";
		teams [1] = "Bolivar";
		teams [2] = "Wilster";
		teams [3] = "Aurora";
		teams [4] = "Blooming";
		
		String cad = "Equipos";
		for (int i = 0; i < teams.length; i++) {
			cad = cad + teams[i];
			System.out.println(cad);
		}
		
		String cad2 = "HOLA";
		for (String number : teams) {
			cad = cad2 + number;
			System.out.println(cad2);
		}
		
		String[] cadenas = new String [5];
		cadenas [0] = "HOLA";
		cadenas [1] = new String ("HOLA");
		cadenas [2] = "ABC";
		cadenas [3] = "123";
		cadenas [4] = new String ("1234");
		
		for (int i = 0; i < cadenas.length; i++) {
		for (int c = i + 1; c < cadenas.length; c++) {
			if (cadenas[i].equals(cadenas[c]))
		System.out.println(cadenas[c]); 		
		}
		}
		
		for (int indice = 0; indice < cadenas.length; indice++) {
            if (cadenas[indice].equals("HOLA")) {
              System.out.println(indice);
            }

		
	}
}
}
