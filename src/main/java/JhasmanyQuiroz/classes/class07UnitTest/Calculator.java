package main.java.JhasmanyQuiroz.classes.class07UnitTest;

public class Calculator {
  public static int add(String numbers) {
    String[] numberArray;
    int result = 0;

    if(numbers != null && numbers.length() > 0) {
      numberArray = numbers.split(",");

      for(String currentValue : numberArray) {
        String[] nums = currentValue.split("\n");

        for(String value : nums) {
          result += Integer.valueOf(value);
        }
      }
    }

    return result;
  }

  public static int addNumbers(String numbers) {
    String[] numberArray;
    StringBuilder negativeNumbers = new StringBuilder();
    int result = 0;

    if(numbers != null && numbers.length() > 0) {
      numberArray = numbers.split("[\n|,]");

      for(String value : numberArray) {
        int number = Integer.valueOf(value);
        if(number < 0) {
          negativeNumbers.append(number).append(",");
        } else {
          result += number;
        }
      }
    }

    if (!negativeNumbers.toString().isEmpty()) {
      throw new IllegalArgumentException(String.format("There are negative numbers: '%s'", negativeNumbers.toString()));
    }

    return result;
  }
}