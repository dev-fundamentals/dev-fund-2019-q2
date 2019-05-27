package main.java.CristelhMiranda;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 10000;
		//numbers[5] = 10000;
		
		/*String cad = "HOLA";
		for (int i = 0; i < numbers.length; i++) {
			cad = cad + numbers[i];
			System.out.println(cad);
		}
		String cad = "HOLA";
		for (int number : numbers) {			
			cad = cad + number;
			System.out.println(cad);
			number = 0;
		}*/
		/*int num1 = 10;//stack
		int num2 = 10;//stack
		
		String s1 = "HOLA"; //string pool
		String s2 = "HOLA"; //string pool
		String s3 = new String("HOLA"); //heap
		String s4 = new String("HOLA"); //heap
		
		//boolean com = (num1 == num2);
		//boolean com = (s1.equals(s3));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		*/
		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String ("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");
	}

}
