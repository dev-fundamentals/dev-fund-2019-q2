package main.java.MiguelVega.exeptions;

public class PersonTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jose=new Person("Person","1234567 cb");
		try
		{
			jose.addEmail("joseemail.com");
			jose.print();
		}
		catch (IndexOutofBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Invalidemailexception");
		}catch
	}

}
