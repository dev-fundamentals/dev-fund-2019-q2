package main.java.JoseCardozo.Friday_24_May;

public class CheckPassFail {
    public static void main(String[] args){

        PrintPassOrFail();
        PrintValue();
        PrintLiteralValue();
        PrintEvenOrOdd();
        multipleOf(50);

    }

    private static void multipleOf(int number) {
        for (int i = 1; i <= 1000; i++) {
            if ( i % number == 0 ){
                System.out.println(String.format("%d is multiple of %d", i, number));
            }
        }
    }

    private static void PrintEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if ( i%2 == 0 ){
                System.out.println(String.format("%d is even", i));
            }
            else {
                System.out.println(String.format("%d is odd", i));
            }
        }
    }

    private static void PrintLiteralValue() {
        for (int i = 1; i <= 10; i++) {
            switch (i){
                case 1:
                    System.out.println(String.format("%d: one",i));
                    break;
                case 2:
                    System.out.println(String.format("%d: two",i));
                    break;
                case 3:
                    System.out.println(String.format("%d: three",i));
                    break;
                case 4:
                    System.out.println(String.format("%d: four",i));
                    break;
                case 5:
                    System.out.println(String.format("%d: five",i));
                    break;
                case 6:
                    System.out.println(String.format("%d: six",i));
                    break;
                case 7:
                    System.out.println(String.format("%d: seven",i));
                    break;
                case 8:
                    System.out.println(String.format("%d: eight",i));
                    break;
                case 9:
                    System.out.println(String.format("%d: nine",i));
                    break;
                case 10:
                    System.out.println(String.format("%d: six",i));
                    break;
                default:
                    System.out.println("out of range");
            }
        }
    }

    private static void PrintValue() {
        for (int i = 1; i <= 10; i++){
            System.out.println(String.format("The value is: %s",i));
        }
    }

    private static void PrintPassOrFail() {
        int mark = 50;

        if (mark >= 50){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
