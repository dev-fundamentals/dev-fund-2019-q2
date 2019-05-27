package main.java.LizzyMendivil;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// valor por defecto los int es 0, de los booleanos es falso
		/* int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 10000;
		String cad = "HOLA";
		
		for (int i = 0; i < numbers.length; i++) {
			cad = cad + numbers[i];
			// estos valores se van creando en el string pool
			System.out.println(cad);
		}
		
		System.out.println("**************************");
		
		String cad2 = "HOLA";
		for (int number : numbers) {
			cad2 = cad2 + number;
			System.out.println(cad2);
		} */
		
		System.out.println("************Using FOR**************");
		
		String myFavorite = "My favorite fruit is: ";
		
		String[] fruits = new String[5];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Grape";
		fruits[3] = "Tangerina";
		fruits[4] = "Watermelon";
		
		for (int i = 0; i < fruits.length; i++) {
			myFavorite = myFavorite +  "(" +  fruits[i] + ") ";
			System.out.println(myFavorite);
		}
		
		System.out.println("************Using FOREACH**************");
		myFavorite = "My favorite fruit is: ";
		
		for (String fruit : fruits) {
			myFavorite = myFavorite +  "("  + fruit + ") ";
			System.out.println(myFavorite);
		}
		
		System.out.println("************Using WHILE**************");
		myFavorite = "My favorite fruit is: ";
		int counter = 0;
		while (counter < fruits.length ) {
			myFavorite = myFavorite +  "(" + fruits[counter] + ") ";
			System.out.println(myFavorite);
			counter ++;
		}
		
		int num1 = 10; // stack
		int num2 = 10; // stack
		
		String s1 = "HOLA"; // string pool
		String s2 = "HOLA"; // string pool
		String s3 = new String("HOLA"); // heap
		String s4 = new String("HOLA"); // heap
		
		boolean com = (num1 == num2);
		System.out.println(com);
		boolean com2 = (s4.equals(s3));
		System.out.println(com2);
		
		System.out.println("************Comparing Strings**************");
		
		String[] cadenas = new String[5];
		cadenas[0] = "Hola";
		cadenas[1] = new String("Hola");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");
		
		for (int i = 0; i < cadenas.length; i++) {
			if (cadenas[i].equals("Hola")) {
				System.out.println("Index: " + i + " Value: " + cadenas[i]);
			}
		}
	}

}
