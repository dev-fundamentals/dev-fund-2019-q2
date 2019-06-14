package main.java.JhasmanyQuiroz.classes.class03;

public class Arrays {
    public static void main(String[] args) {
        boolean[] array = new boolean[5];
        boolean flag = false;

        // Assigning value to array
        for(int index = 0; index < array.length; index ++) {
            array[index] = !flag;
            flag = !flag;
        }

        // Iterating the array
        for (boolean value: array) {
            System.out.println("The value is: " + value);
        }

        String[] stringArray = new String[6];

        // Assigning value to array
        for(int index = 0; index < stringArray.length; index ++) {
            stringArray[index] = "Array_" + index;
        }

        // Iterating the array
        System.out.println("******* Using 'for' sentence");
        for(int index = 0; index < stringArray.length; index ++) {
            System.out.println("The value assigned is: " + stringArray[index]);
        }

        System.out.println("******* Using 'for each' sentence");
        for (String value: stringArray) {
            System.out.println("The value assigned is: " + value);
        }

        // Iterating using while sentence
        int index = 0;
        System.out.println("******* Using 'while' sentence");
        while(index < stringArray.length) {
            System.out.println("The value assigned is: " + stringArray[index]);
            index ++;
        }

        String s1 = "HOLA";//string pool
        String s2 = "HOLA";//string pool
        String s3 = new String("HOLA");//heap
        String s4 = new String("HOLA");//heap

        // The values are different according to assign the value.
        boolean isEqual = (s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
    }
}