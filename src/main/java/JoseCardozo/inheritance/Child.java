package main.java.JoseCardozo.inheritance;

public class Child extends Super{

    public Child(int number) {
        super(number);
    }

    public void print(){
        System.out.println(publicSuperFiled);
        System.out.println(protectedSuperField);
        System.out.println(defaultAtt);
    }

}
