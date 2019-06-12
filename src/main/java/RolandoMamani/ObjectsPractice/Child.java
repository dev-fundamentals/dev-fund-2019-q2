package main.java.RolandoMamani.ObjectsPractice;

public class Child extends Super{
	
	public Child() {
		super(100);
	}
	
	public void print() {
		System.out.println(publicSuperField);
		System.out.println(protectedSuperField);
		//System.out.println(privateSuperField);
		System.out.println(defaultSuperField);
	}
}
