package main.java.MiguelVega.exeptions;

public class Person {
	
	private String name;
	private String ci;
	private String email;//is valid when contains @
	
	Person(String name, String ci)
	{
		this.name=name;
		this.ci=ci;
	}
	
	public void addEmail(String email)throws Exception {
		if(isEmailValid(email)) {
			this.email=email;
		}
		else
			//throw new Exception("Email invalid");
			throw new InvalidEmailException();
		
	}
	
	public boolean isEmailValid(String email) {
		/*if(email.contains("@"))
		{
			return true;
		}
		else
			return false
			*/
		return email.contains("@");
	}
	public void print()
	{
		System.out.println(email);
		System.out.println(name);
		System.out.println(ci);
	}
}
