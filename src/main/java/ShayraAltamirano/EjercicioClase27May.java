package main.java.ShayraAltamirano;

public class EjercicioClase27May {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cad = new String [5];
		cad[0] = "cadena 0";
		cad[1] = "cadena 1";
		cad[2] = "cadena 2";
		cad[3] = "cadena 3";
		cad[4] = "cadena 4";
		
		String hi = "HOLA";
		//Conventional For Exercise
		/*for (int i=0;i< cad.length;i++) {
			hi = hi + cad[i];
			System.out.println(hi);
		}*/
		
		
		//For Each Exercise
		/*for (String temp : cad) {
			hi = hi + temp;
			System.out.println(hi);
		}*/
		
		//While Exercise
		int i=0;
		while (i<cad.length) {
			hi = hi + cad[i];
			System.out.println(hi);
			i++;
		}
		
	}
}
