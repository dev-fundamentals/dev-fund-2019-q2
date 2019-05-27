package main.java.JoseEguivar;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadena = new String[5];
		cadena[0] = "cero";
		cadena[1] = "uno";
		cadena[2] = "dos";
		cadena[3] = "tres";
		cadena[4] = "cuatro";		
		for (int i = 0; i < cadena.length; i++) {

			System.out.println(i);
		}
		
		for (String elemento : cadena) {
			System.out.println(elemento);
		}
	}
}
