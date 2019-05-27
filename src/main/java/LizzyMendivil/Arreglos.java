package main.java.LizzyMendivil;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// valor por defecto los int es 0, de los booleanos es falso
		int[] numbers = new int[5];
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
		}
	}

}
