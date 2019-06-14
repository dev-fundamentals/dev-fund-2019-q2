package main.java.AlejandraNeolopan.inheritance;

public class Child extends Super{
	Child()	{
		super();
	}
	Child(int num){
		super(num);
	}
	public void print() {
		System.out.println(publicSuperField);
		System.out.println(protectedSuperField);
	//	System.out.println(privateSuperField);
		System.out.println(defaultAtt);
	}
	
}
