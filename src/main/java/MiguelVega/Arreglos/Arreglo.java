package main.java.MiguelVega.Arreglos;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String[] cad = new String [5];
			
		cad[0] = "cad1";
		cad[1] = "cad2";
		cad[2] = "cad3";
		cad[3] = "cad4";
		cad[4] = "cad5";
		
// using for		
		for (i = 0; i<cad.length; i++)
		{
			System.out.println(cad[i]);	
		}
		
// using for each
		for (String j : cad)
		{
			System.out.println(j);	
		}
		
		
// using while		
		while (i<cad.length)
		{
			System.out.println(cad[i]);
			i+=1;
		}
		
		/*
		String[] cadenas=new String[5];
		cadena[0]="Hola";
		cadena[0]="new String("Hola")";
		cadena[0]="ABC";
		cadena[0]="123";
		cadena[0]="new String("1234")";
		
		for (i = 0; i<cad.length; i++)
		{
			
			System.out.println(cad[i]);	
		}
		
		*/
	}

}
