package main.java.JhasmanyQuiroz.classes.class07UnitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
      //numberArray = numbers.split("[\n|,]");
      String regex = getDelimiters(numbers);

      if (!regex.equals("[\n|,]")) {//Then there are a new delimiters
        numbers = getValueFromRegex(numbers, "(?<=\\n)(?<numbers>(.+))(?=)", "numbers");
      }

      numberArray = numbers.split(regex);

      for(String value : numberArray) {
        int number = Integer.valueOf(value);

        if (number < 1001 && number > 0) {
          result += number;
        } else if (number < 0) {
          negativeNumbers.append(number).append(",");
        }
      }
    }

    if (!negativeNumbers.toString().isEmpty()) {
      throw new IllegalArgumentException(String.format("There are negative numbers: '%s'", negativeNumbers.toString()));
    }

    return result;
  }

  public static String getDelimiters(String text) {
    //Values by default: '\n' and ','
    String result = "[\n|,]";

    String regex = "(?<=//)(?<pattern>(.+))(?=\n)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    if (matcher.find()) {
      String groupPattern = matcher.group("pattern");
      System.out.println("Pattern Group: " + groupPattern);

      if (!groupPattern.isEmpty()) {
        String delimiterRegex = "\\[(?<symbol>.*?)\\]";
        Pattern delimiterPattern = Pattern.compile(delimiterRegex);
        Matcher matcherPattern = delimiterPattern.matcher(groupPattern);

        if (matcherPattern.matches()) {
          String delimiter = matcherPattern.group("symbol");
          String del = matcherPattern.group(1);
          result = delimiter;
        }

      }
    }

    return result;
  }

  private static String getValueFromRegex(String text, String regex, String groupName) {
    String result = "";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    if (matcher.find()) {
      result = matcher.group(groupName);
    }

    return result;
  }
}