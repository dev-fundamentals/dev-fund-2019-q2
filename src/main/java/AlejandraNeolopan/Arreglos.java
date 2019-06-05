package main.java.AlejandraNeolopan;

public class Arreglos {
	
	public static void main(String[] args) {
		
		String[] cadenas = new String[5];
		
		
               cadenas[0]="HOLA";
		cadenas[1]=new String("HOLA");
		cadenas[2]="ABC";
		cadenas[3]="123";
		cadenas[4]=new String ("HOLA");
		String palabras=new String();
		String[] indexes=new String[5];
		int i=0;
		int k=-1, count;
        while (i<cadenas.length-1) {
        	if (!palabras.contains(cadenas[i])) {
        	count=1;
        	
        	for (int j=i+1;j<cadenas.length;j++) {
   			 if (cadenas[i].equals(cadenas[j])) {
   				
   				if (count==1)
   				{k++;
   					indexes[k]=i+"";
   		        	palabras+=" "+cadenas[i];
   					
   				}
   				
   				indexes[k]+=", "+j;
   				count++;
   				}
   			 }
        	}
        	i++;
		}
      System.out.println(palabras);
      for (String ind : indexes) {
    	  if (ind!=null)
    	  System.out.println(ind);
    	  
      }
	}

}
