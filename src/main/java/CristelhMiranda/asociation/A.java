package main.java.CristelhMiranda.asociation;

public class A {
	B attr1; //comp
	C attr2; //agreg
	
	A(){
		attr1 = new B();//comp
	}
	
	A(C attr2){
		this.attr2 = attr2;//agreg
	}
}