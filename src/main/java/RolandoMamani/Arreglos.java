package main.java.RolandoMamani;

public class Arreglos {
	
	public void printIndexAndRepeatedValuesinArray() {
		
		/*String s1 = "cat";
		String s2 = "cat";
		String s3 = new String("cat");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));*/
		
		String [] cadenas = new String[5];
		cadenas [0] = "HOLA";
		cadenas [1] = new String ("d");
		cadenas [2] = "456";
		cadenas [3] = "ss";
		cadenas [4] = new String("123");
		
		
		String indices = "";
		String palabra = "";
		/*
		for (int i = 0 ; i < cadenas.length ; i++) {
			for (int j = i+1 ; j < cadenas.length ; j++) {
				if(cadenas[i].equals(cadenas[j])) {
					System.out.println("indices: "+ i +", " + j);
					System.out.println("palabra: " + cadenas[i]);
				}
			}
		}*/
		
		for (int i = 0 ; i < cadenas.length ; i++) {
			if((palabra.equals(""))) {
				
				for (int j = i+1 ; j < cadenas.length ; j++) {
					if(cadenas[i].equals(cadenas[j])) {
						
						if(!(palabra.equals(cadenas[i]))) {
							palabra = cadenas[i];
							indices = indices + i + "," + j ;
						}else {
							if(indices.indexOf(j)==-1) {
								indices = indices + "," + j;
								}
							}
						} 
					}
				}
			}
		
		if(palabra.equals("")) {
			System.out.println("No hay palabras repetidas");
		}else {
			System.out.println("Indices: " + indices);
			System.out.println("Palabra: " + palabra);
		}
	}
}
