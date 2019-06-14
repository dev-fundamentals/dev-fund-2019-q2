package main.java.RolandoMamani.UnitTest;

public class Calculator {
	
	public static int add(String numbers) {
		int result = 0;
		
		if(numbers != null && numbers.length()>0) {
			for(int i = 0; i<numbers.length(); i++) {
				String[] res = numbers.split("\n|,");
				if(Character.isDigit(numbers.charAt(i))) {
					result = result + numbers.charAt(i);
				}
			}
		}
		
		return result;
	}
}
