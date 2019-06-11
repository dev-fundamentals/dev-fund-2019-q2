package main.java.LizzyMendivil.inheritance;

public class Child extends Super{
	
	Child() {
		super(100);
	}
	
	public void print() {
		System.out.println(publicAtt);
		System.out.println(protectedAtt);
		// System.out.println(privateAtt); // no heredamos private
		System.out.println(defaultAtt);
	}
	
	/* public static void main(String args[]) {
		// main es un punto de entrada y salida del programa, es un cliente, no es parte como tal de la clase.
	} */

}
