package main.java.AlejandraNeolopan.exceptions;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jose = new Person ("Jose","123");
		
		try {
			jose.addEmail("jose@");
			jose.print();
		}catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			//close db connections/streams
			System.out.println("finally");
		}
		
	}

}
