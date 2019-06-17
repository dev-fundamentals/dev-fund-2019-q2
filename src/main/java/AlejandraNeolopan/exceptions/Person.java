package main.java.AlejandraNeolopan.exceptions;

public class Person {
	private String name;
	private String ci;
	private String email;
	
	Person(String nam,String ci){
		name=nam;
		this.ci=ci;
	} 
	
	void addEmail(String email) throws Exception
	{
		if (isEmailValid(email))
			this.email=email;
		else 
			throw new InvalidEmailException();
	}
	boolean isEmailValid(String em) {
		return (em.contains("@"));
	}
	void print() {
		System.out.println(name);
		System.out.println(ci);
		System.out.println(email);
	}
	
}
