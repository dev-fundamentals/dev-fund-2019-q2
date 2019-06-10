package main.java.RocioEncinas.unitTests.tdd;

public class Calculator {
	public static int add(String numbers) throws Exception {
		String[] numbersArray;
		String negativeNumbers = "";
		int result = 0;

		if (numbers != null && numbers.length() > 0) {
			numbersArray = numbers.split("\n|,");
			//numbersArray = numbers.split("\n");

		  for(String current : numbersArray) {
			 int number = Integer.valueOf(current.replaceAll(" ",""));
			 if (number < 0) {
				 negativeNumbers += (negativeNumbers.length() > 0 ? "," : "") + number;
			 }
			 result += number > 1000 ? 0 : number;
		  }
		}
		if (negativeNumbers.length() > 0) {
			System.out.println(negativeNumbers);
			throw new Exception("Negative numbers are: " + negativeNumbers);
		}
		return result;
	}

}
