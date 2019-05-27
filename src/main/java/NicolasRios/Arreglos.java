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
		
	}

}
