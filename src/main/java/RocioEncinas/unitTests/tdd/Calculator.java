package main.java.RocioEncinas.unitTests.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	// returns the delimiters contained in the string
	public static String getDelimiters(String numbers) {
		String delimiters = "";
		Matcher m = Pattern.compile("\\[([^]]*)\\]").matcher(numbers);
        List<String> allDelimiters = new ArrayList<>();
        while (m.find()) {
        	allDelimiters.add(m.group().replace("[","").replace("]",""));
        }
        
        for(String d : allDelimiters) {
        	delimiters += (delimiters.length() > 0 ? "|" : "") + d;
        }
        
        return delimiters;
	}
	
	public static int add(String numbers) throws Exception {
		String[] numbersArray;
		String negativeNumbers = "";
		String delimiter = "\n|,"; 
		
		int result = 0;
		
		if (numbers != null && numbers.length() > 0) {
			if (numbers.contains("[")) {
				delimiter = getDelimiters(numbers);
				numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
			}
			
			numbersArray = numbers.split(delimiter);

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
