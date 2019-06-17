package main.java.CristelhMiranda.practiceInheritancePolymorphism.exercise2;

public class Square extends Rectangle{
	Square(String label, int side){
		super(label, side, side);
		type = "Square";
	}
}
