package main.java.AlejandraNeolopan;

public class Arreglos {
	
	public static void main(String[] args) {
		String[] cadenas = new String[5];
		cadenas[0]="uno";
		cadenas[1]="dos";
		cadenas[2]="tres";
		cadenas[3]="cuatro";
		cadenas[4]="cinco";
		for (int i=0;i<cadenas.length;i++) {
			 
			 System.out.println(cadenas[i]);
		}
		 System.out.println();
		for (String number:cadenas) {
			 
			 System.out.println(number);
		}
		 System.out.println();
		 
		int i=0;
        while (i<cadenas.length) {
        	System.out.println(cadenas[i]);
        	i++;
		} 
		
	}

}
