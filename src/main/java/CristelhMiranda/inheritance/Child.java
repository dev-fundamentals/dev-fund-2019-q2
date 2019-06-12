package main.java.CristelhMiranda.inheritance;

public class Child extends Super{
	
	Child(){
		super(100);
	}
	
	public void print() {
		System.out.println(publicAtt);
		System.out.println(protectedAtt);
		//System.out.println(privateAtt); // no hereda privado
		System.out.println(defaultAtt);
	}
	
}
