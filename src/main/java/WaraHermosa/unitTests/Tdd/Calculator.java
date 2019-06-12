package main.java.WaraHermosa.unitTests.Tdd;

public class Calculator {
	public static int add (String numbers) throws Exception {
		String [] numbersArray;
		String negativeNumbers = "";
		String defaultSeparator = ",|\n";
		
		int result = 0;
		
			if (numbers != null && numbers.length() > 0) {
			//numbersArray = numbers.split (",");
			//numbersArray = numbers.split ("\n");
			numbersArray = numbers.split(defaultSeparator);
			
			for (String current : numbersArray) {
				int number = Integer.valueOf(current);
				if (number < 0) {
				
					negativeNumbers += (negativeNumbers.length() > 0? ",": "") + number;
				}else if (number <= 1000)
					result += number;
					//numbersArray2 = new String [numbersArray2.length+1];
				
				//System.arraycopy(numbersArray2, number, current, number, number);
			
				
		}
		if (negativeNumbers.length()> 0) throw new Exception ("Negative numbers are: " + negativeNumbers);
		{
		}
	
		return result;
	}
			return result;
}

	
}
	



