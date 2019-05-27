package main.java.WaraHermosa;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colors= new String[5];
		colors [0] = "black";
		colors [1] = "red";
		colors [2] = "white";
		colors [3] = "blue";
		colors [4] = "pink";
		
		String cad = "rainbow";
		for (int i= 0; i< colors.length; i++) {
			cad = cad + colors [i];
			System.out.println(cad);
		}
		String cad2 = "HOLA";
		for (String number : colors) {
			cad2 = cad2 + number;
			System.out.println (cad2);
		
		}
		
	}

}
