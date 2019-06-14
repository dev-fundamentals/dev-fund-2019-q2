package main.java.LizzyMendivil.classes;

public class Person {
	String name; // instance data value
	String ci; // instance data value
	static String names = ""; // class data value
	
	public Person(String name) {
		this.name = name;
		names = names + " " + name; 
	}
	
	public void walk() { // instance method
		System.out.println(name + " is walking with default distance");
	}
	
	public void walk(int distance) { // instance method
		System.out.println(name + " is walking with distance: " + distance);
	}
	
	public void run() { // instance method
		System.out.println(name + " is running");
	}
	
	public static void printName() { // class method
		System.out.println("All names " + names);
	}
}
