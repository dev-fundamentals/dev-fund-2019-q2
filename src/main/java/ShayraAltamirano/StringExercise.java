package main.java.ShayraAltamirano;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadenas = new String [5];
		cadenas[0] ="HOLA";
		cadenas[1] ="123";
		cadenas[2] =new String ("HOLA");
		cadenas[3] ="123";
		cadenas[4] =new String ("HOLA");
		
		String [][] resultadoFinal = new String [5][2]; //columna 1 Cadenas, columna 2 Índices.
		int x=0;//indice de resultado	
		boolean exist=false; //Boolean de existencia de cadena en array
		
		
		//Recorre primer loop
		for (int i=0; i<cadenas.length;i++) {
			
			// Existe cadena en array de resultado?
			for(int z=0;z<resultadoFinal[z].length  && resultadoFinal[z][0]!=null;z++) {
				if(resultadoFinal[z][0].equals(cadenas[i])) {
					exist=true;
					resultadoFinal [z][1]=resultadoFinal [z][1] +", "+ Integer.toString(i);
				}
			}
			//Recorre segundo loop si las cadenas son iguales, y cadena no existe en columna de resultado
			for (int j=0;(j<cadenas.length) && (j!=i)  ;j++) {
				if (cadenas[i].equals(cadenas[j]) && (exist==false)){
					
					resultadoFinal[x][0]=String.valueOf(cadenas[i]); //guarda cadena en columna de Resultado Cadena
					resultadoFinal[x][1]= Integer.toString(i) +", "+ Integer.toString(j);//guarda los índices en columna de índices
					x ++;
				}
				
			} 
		}
		for (int y=0; y<resultadoFinal[y].length && resultadoFinal[y]!=null;y++) {
		System.out.println("La cadena: "+ "'" +resultadoFinal[y][0] +"'" + " se encuentra en los índices: " + resultadoFinal[y][1]);
		}
	
	}
}
