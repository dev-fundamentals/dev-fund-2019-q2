package main.java.JoseCardozo.Classes;

public class Person {
    String name;
    String ci;
    static String names = "";

    public Person(String name) {
        this.name = name;
        names = names + name + " ";
    }

    public void walk(){
        System.out.println("I'm walking with default distance");
    }

    public void walk(int distance){
        System.out.println("I'm walking with distance " + distance);
    }

    public static void printNames(){
        System.out.println("All names: " + names);
    }
}
