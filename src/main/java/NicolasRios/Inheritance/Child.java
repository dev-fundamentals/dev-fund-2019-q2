package main.java.NicolasRios.Inheritance;

public class Child extends Super {

	Child() {
		super (100);
	}
	
	
	public void print() {
	System.out.println(public_Super_Field);
	System.out.println(protected_Super_Field);
	//System.out.println(private_Super_Field); // cannot inherit private
	System.out.println(default_Super_Field);
	
	}

}
