package main.java.AlejandraNeolopan.inheritance;

public class Super {

	public int publicSuperField;
	protected int protectedSuperField;
	private int privateSuperField;
	int defaultAtt;
	
	public Super() {
		publicSuperField=10;
		protectedSuperField=20;
		privateSuperField=30;
		defaultAtt=100;
	}
	public Super(int num) {
		publicSuperField=num;
		protectedSuperField=num;
		privateSuperField=num;
		defaultAtt=num;
	}
}
