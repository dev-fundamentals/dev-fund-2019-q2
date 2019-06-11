package main.java.LizzyMendivil.unitTests.tdd;

public class Calculator {
	
	/* public static int add(String numbers) {
		return -1;
	} */
	
	public static int add(String numbers) throws Exception {
		String[] numbersArray;
		String[] numberArray2 = new String[0];
		String negativeNumbers = "";
		int result = 0;
		
		if (numbers != null && numbers.length() > 0) {
			 numbersArray = numbers.split("\n|,");			
		  for(String current : numbersArray) {
			  int number = Integer.valueOf(current);
			  if (number < 0) {
				  negativeNumbers += (negativeNumbers.length() > 0 ? "," : "") + number;
			  }
			  number = number > 1000 ? 0 : number;
			  result += number;
		  }
		}
		if (negativeNumbers.length() > 0) {
			throw new Exception("Negative numbers are: " + negativeNumbers);
		}
		return result;
	}
	
	/* public static void main(String[] args) throws Exception {
		int result = Calculator.add("1,1001");
		System.out.println("result is: " + result);
	} */
}
