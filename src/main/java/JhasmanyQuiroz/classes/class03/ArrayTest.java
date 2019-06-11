package main.java.JhasmanyQuiroz.classes.class03;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "HOLA";
        strings[1] = new String("HOLA");
        strings[2] = "ABC";
        strings[3] = "123";
        strings[4] = new String("1234");

        String positions, duplicateElements = "";
        boolean found = false;

        for (int index = 0; index < strings.length; index++) {
            int indexToIterate = index + 1;
            positions = "" + index;

            //Iterate to the string size and verify that the network hasn't been searched yet
            while (indexToIterate < strings.length && !duplicateElements.contains(strings[index])) {
                if (strings[index].equals(strings[indexToIterate])) { //Verify if the strings are equals
                    positions += ", " + indexToIterate; //Concat the position
                    found = true;
                }

                indexToIterate ++;
            }

            if (found) {
                System.out.println(String.format("The string '%s' was found in the positions: '%s'",
                        strings[index], positions));
            }

            duplicateElements += strings[index]; //Added the string that was already searched.
            found = false; //Reset the flag
        }
    }
}
