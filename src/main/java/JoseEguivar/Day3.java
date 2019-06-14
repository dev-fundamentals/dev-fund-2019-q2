package main.java.JoseEguivar;

import java.util.Arrays;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] cadena = new String[5];
//		cadena[0] = "cero";
//		cadena[1] = "uno";
//		cadena[2] = "dos";
//		cadena[3] = "tres";
//		cadena[4] = "cuatro";		
//		for (int i = 0; i < cadena.length; i++) {
//
//			System.out.println(i);
//		}
//		
//		for (String elemento : cadena) {
//			System.out.println(elemento);
//		}
		
		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String ("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");
		for (String elemento : cadenas) {
		
			if (elemento == "HOLA")
			System.out.println(elemento);				
	    }
		for (int index = 0; index < cadenas.length; index++) {
			if (cadenas[index].equals("HOLA")) {
				System.out.println(index);		
			}
				
		}
	
	}
}
