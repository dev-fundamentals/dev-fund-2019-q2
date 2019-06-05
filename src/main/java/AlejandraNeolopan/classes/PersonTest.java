package main.java.AlejandraNeolopan.classes;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person juan = new Person("Juan");
		juan.name="Juan";
		juan.ci="123456 lp";
		
		Person pedro =new Person("Pedro");
		pedro.name="Pedro";
		pedro.ci="123456 cb";
		
		juan.walk();
		pedro.walk();
		Person.printNames();
	}

}
