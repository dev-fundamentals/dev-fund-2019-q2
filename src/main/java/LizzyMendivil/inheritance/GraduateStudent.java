package main.java.LizzyMendivil.inheritance;

public class GraduateStudent extends Student {
	
	GraduateStudent(String name) {
		super(name);
		minimumScore = 80;
	}
	
	// aprueba is es > 80
	/* public void computeCourseGrade() {
		int sum = 0;
		for (int valor : test) {
			sum = sum + valor;
		}
		double average = sum / NUM_OF_TESTS;
		
		if (average > 80) {
			courseGrade = "PASSED";
		} else {
			courseGrade = "FAILED";
		}
	} */
}
