package main.java.NicolasRios.Classes;

public class PersonTest {

	public static void main(String[] args) {
		Person juan = new Person("Juan");
		juan.name = "Juan";
		//juan.ci = "575836395 OR";

		Person pedro = new Person("Pedro");
		//pedro.name = "Pedro";
		//pedro.ci = "123456 CB";

		// System.out.println(juan.name);
		// System.out.println(juan.ci);
		juan.walk();
		juan.walk(10);
		//pedro.walk(); // instance methods

		
		//Person.printNames(); // class methods
		
	}

}
