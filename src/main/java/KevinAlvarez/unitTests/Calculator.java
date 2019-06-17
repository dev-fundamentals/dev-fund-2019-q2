package main.java.KevinAlvarez.unitTests;

public class Calculator {
	
	private static final String DEFAULT_DELIMITER = ",|\n";
	private static final String NEW_DELIMITER = "//";
	private static final String NEW_LINE = "\n";
	
	private static String validateDelimiter(String numbers) {
		return numbers.replace("][", "|").replace("[", "").replace("]", "");
	}
	
	private static String getDelimiter(String numbers) {
		if (numbers.contains(NEW_DELIMITER))
			return Calculator.validateDelimiter(numbers.substring(2, numbers.indexOf(NEW_LINE)));
		return DEFAULT_DELIMITER;
	}

	public static int add(String numbers) {
		int result = 0;
		if (numbers.length() > 0) {
			String negativeNumbers = "";
			String delimiter = Calculator.getDelimiter(numbers);
			if (!delimiter.equals(DEFAULT_DELIMITER)) numbers = numbers.split(NEW_LINE)[1];
			for (String current : numbers.split(delimiter)) {
				if (current.matches("-?\\d+(\\.\\d+)?")) {
					int value = Integer.valueOf(current);
					if (value < 0) negativeNumbers += (negativeNumbers.length() == 0 ? "" : ",") + current;
					if (value <= 1000) result += value;
				}
			}
			if (negativeNumbers.length() > 0) throw new RuntimeException("Negative Numbers: " + negativeNumbers);
		}
		return result;
	}
}
