package main.java.RocioEncinas.exceptions;

public class PersonTests {
	public static void main(String args[]) {
		Person jose = new Person("Jose", "1234567 cba");
		try {
			jose.addEmail("josegmail.com");
			jose.print();
		} catch (IndexOutOfBoundsException e) { // se va desde lo mas especifico hasta lo mas generico
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("InvalidEmailException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception");
		} finally {
			// close connections DB, streams
			System.out.println("Finally");
		}
	}
}
