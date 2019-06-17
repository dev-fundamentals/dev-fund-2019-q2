package main.java.JoseCardozo.Classes;

public class PersonTest {
    public static void main(String[] args) {
        Person juan = new Person("Juan");
        juan.ci = "12345 or";

        Person pedro = new Person("Pedro");
        pedro.ci = "123456 cb";

//        System.out.println(juan.name);
//        System.out.println(juan.ci);

        juan.walk();
        juan.walk(10);
        pedro.walk();
        Person.printNames();
    }
}
