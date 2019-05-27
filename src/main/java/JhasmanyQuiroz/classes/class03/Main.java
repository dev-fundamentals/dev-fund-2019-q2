class Main {
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
  }
}