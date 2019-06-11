package main.java.MiguelVega.Arreglos.copy;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;int j;
		
		String[] cad = new String [5];
			
		cad[0] = "cad1";
		cad[1] = "cad2";
		cad[2] = "cad3";
		cad[3] = "cad4";
		cad[4] = "cad5";
		/*
		// using for		
		for (i = 0; i<cad.length; i++)
		{
			System.out.println(cad[i]);	
		}
		
		// using for each
		for (String a : cad)
		{
			System.out.println(a);	
		}
		
		
		// using while
		i=0;
		while (i<cad.length)
		{
			System.out.println(cad[i]);
			i+=1;
		}
		
			
/*
 * HOMEWORK	
 */			
		String[] cadena=new String[5];
		cadena[0]="Hola";
		cadena[1]=new String("Hola");
		cadena[2]="ABC";
		cadena[3]="123";
		cadena[4]=new String("Hola");	
		
// Display the repeated words and in what positions.
		String temp;
		String posicion="";		
		
		for (i = 0; i<cadena.length-1; i++)
		{
			temp=cadena[i];
			posicion=posicion+i;
			for (j = (i+1); j<cadena.length; j++)
			{
			    if (temp.equals(cadena[j]) && !cadena[j].equals(""))
				{				
					posicion=posicion+" "+j;
					cadena[j]="";
				}				
			}				
			if (posicion.length()>1)
			{
				System.out.println("La cadena que se repite usando 'for' es: \n"+temp+"\n en las posiciones: "+posicion);	
			}
			posicion="";
		}
		
		
	}
}
