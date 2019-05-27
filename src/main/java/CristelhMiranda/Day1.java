package main.java.CristelhMiranda;


public class Day1 {

	public static void main(String[] args) {
		int number = 10;
		boolean isValid = true;
		char character = 'A';
		boolean isCar = true;
		// sysout
		System.out.println(number);
		System.out.println(isValid);
		System.out.println(character);

		/*
		 * int age = 3; switch (age) { case 1: System.out.println("You are one yr old");
		 * break; case 2: System.out.println("You are two yr old"); break; case 3:
		 * System.out.println("You are three yr old"); break; default:
		 * System.out.println("You are more than three yr old"); break; }
		 */

		/*
		 * while (true) { // some java statements }
		 */

		var counter = 0;
		while (counter < 5) {
			System.out.println("Inside the while loop, counting: " + counter);
			counter++;
		}

		/*
		 * for (initialization; termination condition; increment/decrement) { //java
		 * statement(s) }
		 */

		for (int i = 1; i <= 5; i++) {
			System.out.println("Printing using for loop. Count is: " + i);
		}

		String[] people = { "Vivek", "Kavya", "Aryan" };
		for (String person : people) {
			System.out.println("Hi, I am " + person);
		}
	}

}
