package main.java.CristelhMiranda.exceptions;

public class PersonTests {
	public static void main(String arg[]) {
		Person jose = new Person("Jose", "1234567 cb");
		try {
			jose.addEmail("jose@gmail.com");
			jose.print();
		} catch (IndexOutOfBoundsException e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("InvalidEmailException");
		} catch (Exception e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Exception");
		}finally {
			//close connections DB, streams
			System.out.println("Finally");
		}
	}
}
