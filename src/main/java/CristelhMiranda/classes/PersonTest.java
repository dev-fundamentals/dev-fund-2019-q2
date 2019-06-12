package main.java.CristelhMiranda.classes;

public class PersonTest {

	public static void main(String[] args) {
		Person juan = new Person("Juan");						
		//juan.name = "Juan";
		//juan.ci = "123456 or";
		
		//Person pedro = new Person("Pedro");						
		//pedro.name = "Pedro";
		//pedro.ci = "123456 cb";
		//System.out.println(juan.name);
		//System.out.println(juan.ci);
		juan.walk();
		juan.walk(10);
		/*pedro.walk();//instance methods
		*/
		//Person.printNames(); //class method
	}

}
