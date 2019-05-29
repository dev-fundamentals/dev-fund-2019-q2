package main.java.ShayraAltamirano;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadenas = new String [5];
		cadenas[0] ="HOLA";
		cadenas[1] =new String("HOLA");
		cadenas[2] ="ABC";
		cadenas[3] ="123";
		cadenas[4] =new String("1234");
		
		for (int i=0; i<cadenas.length;i++) {
			for (int j=0;(j<cadenas.length) & (j!=i)  ;j++)
				if (cadenas[i].equals(cadenas[j])){
					System.out.println("Posiciones " + i + "-"+ j + " texto:" + cadenas[i]);
			} 
		}
	}
}
