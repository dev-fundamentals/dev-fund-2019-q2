package main.java.RolandoMamani.ObjectsPractice.Student;

public class UndergraduateStudent extends Student{
	
	public UndergraduateStudent(String name) {
		super(name);
		minimumScore = 70;
	}
	
	/*public void computeCourseGrade() {
		int sum = 0;
		for(int valor : test) {
			sum = sum + valor;
		}
		
		double average = sum / NUM_OF_TESTS;
		
		if( average > 70) {
			courseGrade = "PASSED";
		} else {
			courseGrade = "FAILED";
		}
	}*/
}
