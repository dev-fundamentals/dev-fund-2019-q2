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
    int result = 0;

    if(numbers != null && numbers.length() > 0) {
      numberArray = numbers.split("[\n|,]");

      for(String value : numberArray) {
        int number = Integer.valueOf(value);
        if(number < 0) {
          new throw Exception();
        } else {
          result += number;
        }
      }
    }

    return result;
  }
}