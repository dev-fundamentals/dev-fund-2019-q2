package main.java.RocioEncinas.exceptions;

public class Person {
	public String name;
	public String ci;
	public String email; //is valid when contains @
	
	Person(String name, String ci) {
		this.name = name;
		this.ci = ci;
	}
	
	public void addEmail(String email) throws Exception {
		if(isEmailValid(email)) {
			this.email = email;
		} else {
			//throw new Exception("Email invalid");
			throw new InvalidEmailException();
		}
	}
	
	public boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(ci);
		System.out.println(email);
	}
}
