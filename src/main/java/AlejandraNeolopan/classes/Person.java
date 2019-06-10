package main.java.AlejandraNeolopan.classes;

public class Person {
String name="";//instance data value
String ci;
static String names="";//class data value

public Person (String name) {
	this.name=name;
	names +=" "+name;
}

	public void walk(){ //instance method
	System.out.println( "I am walking, and my name is "+name);
	}
	public void walk(int distance){ //instance method
		System.out.println( "I am walking with a distance: "+distance);
		}
	public static void printNames() {//class method
		System.out.println( "Print All" + names);
	}
}
