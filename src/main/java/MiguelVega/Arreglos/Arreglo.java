package main.java.MiguelVega.Arreglos;

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
		cadena[4]=new String("1234");		
	
		// Using for
		String temp;
		
		for (i = 0; i<cadena.length-1; i++)
		{
			temp=cadena[i];
		
			for (j = (i+1); j<cadena.length; j++)
			{
				if (temp.equals(cadena[j]))						
				{				
					System.out.println("La cadena que se repite usando 'for' es: \n"+"'"+cadena[j]+"'"+"\n en las posiciones: "+i+" y "+j);
				}				
			}				
		}
		
		// Using while
		i=0;j=0;
		while(i<cadena.length-1)
		{j=i+1;
			temp=cadena[i];			
			while(j<cadena.length)
			{
				if (temp.equals(cadena[j]))						
				{				
					System.out.println("La cadena que se repite usando 'while' es: \n"+"'"+cadena[j]+"'"+"\n en las posiciones: "+i+" y "+j);
				}	
				j+=1;
			}
			i+=1;
		}
	
		// Using for-each
		i=0;j=0;				
				for (String x : cadena)
				{
					temp=x;
					j=i+1;
					for ( String y : cadena)
					{
						if (y.equals(temp) && (x!=y))						
						{				
							System.out.println("La cadena que se repite usando 'for each' es: \n"+"'"+y+"'"+"\n en las posiciones: "+i+" y "+j);
						}
					}
				}
	}
}
