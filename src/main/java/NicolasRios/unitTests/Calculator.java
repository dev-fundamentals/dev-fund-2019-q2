package main.java.NicolasRios.unitTests;

public class Calculator {

	public static int add(String numbers)  throws Exception {
	String [] numbersArray;
	String [] numberArray2 = new String[0];
	String negativeNumbers = "";
	int result = 0;
	
	if (numbers != null && numbers.length() > 0) {
		numbersArray = numbers.split("\n|,");
		
		
		for (String current : numbersArray) {
			int number = Integer.valueOf(current);
			if (number < 0) {
				negativeNumbers += number + (negativeNumbers.length() > 0 );
				
			}
		}
			
			
			result += number;
	}
	
	if (negativeNumbers.length() > 0)
		
		
		
		return result;

	}

}
