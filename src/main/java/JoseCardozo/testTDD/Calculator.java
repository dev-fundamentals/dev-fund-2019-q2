package main.java.JoseCardozo.testTDD;

public class Calculator {
    public static int add(String numbers) throws Exception{
        int result = 0;
        String[] numbersArray;
        if ( numbers != null && numbers.length() != 0){
            numbersArray = numbers.split("[\n|,]");
            for (String current : numbersArray) {
                int num = Integer.valueOf(current);
                if ( num < 0){
                    throw new Exception();
                }
                result += Integer.valueOf(current);
            }
        }
        return result;
    }
}
