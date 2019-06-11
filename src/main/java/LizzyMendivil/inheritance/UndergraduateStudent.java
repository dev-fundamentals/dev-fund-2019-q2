package main.java.LizzyMendivil.inheritance;

public class UndergraduateStudent extends Student {
	
	UndergraduateStudent(String name) {
		super(name);
		minimumScore = 70;
	}
	
	void print() {
		System.out.println("---------------");
	}
	
	// aprueba is es > 70
	// sacar promedio y luego verificar
	/* public void computeCourseGrade() {
		int sum = 0;
		for (int valor : test) {
			sum = sum + valor;
		}
		double average = sum / NUM_OF_TESTS;
		
		if (average > 70) {
			courseGrade = "PASSED";
		} else {
			courseGrade = "FAILED";
		}
	} */
}
