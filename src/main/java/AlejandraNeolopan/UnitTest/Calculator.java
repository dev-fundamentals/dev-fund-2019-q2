package main.java.AlejandraNeolopan.UnitTest;

public class Calculator {
	public static int add(String numbers) throws Exception {
		String[] numbersArray;
		String delimiters = "";
		String negativeNumbers = "";
		int index0 = 0;
		int indexn = 0;
		int result = 0;
		int number=0;
		
		if (numbers != null && numbers.length() > 0) {
			if (numbers.charAt(2)=='[') {
			while (indexn>=0) {
			
			 index0 =numbers.indexOf('[',indexn);
			 indexn =numbers.indexOf(']',indexn);
			 if (indexn>=0)
			 delimiters += numbers.substring(index0,indexn)+ "|";
			 
			   }
		    }
			else {
				if (Character.isDigit(numbers.charAt(2))==false)
					delimiters += numbers.charAt(2)+ "|";
			}
			 
			 numbersArray = numbers.split(delimiters+"\n|,|//");
			
		  for(String current : numbersArray) {
			 if (current.equals(""))
				 number=0;
			 else
				 number = Integer.valueOf(current);
			
			  if (number < 0) {
				  negativeNumbers += (negativeNumbers.length() > 0 ? ", " : "") + current;
				 
			  }
			  else {
				  if (number < 1000)
				  result += number;
			  }
		}
		}
		if (negativeNumbers.length() > 0) {
			throw new Exception("Negative numbers are: " + negativeNumbers);
		}
		return result;
	}
}
