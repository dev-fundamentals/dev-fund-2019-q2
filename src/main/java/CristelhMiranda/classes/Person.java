package main.java.CristelhMiranda.classes;

public class Person {
	String name = "";//instance data value
	String ci;//instance data value
	static String names = "";//class data value
	
	public Person(String name) {
		this.name = name;
		names = names + " " + name;
	}
	
	public void walk() {//instance method
		System.out.println("I am walking, with default distance");
	}
	
	public void walk(int distance) {//instance method
		System.out.println("I am walking, with distance: " + distance);
	}

	public static void printNames() {//class method
		System.out.println("All names: " + names);
	}
}
