package main.java.RolandoMamani.ObjectsPractice.Student;

public class GraduateStudent extends Student{
	
	public GraduateStudent(String name) {
		super(name);
		minimumScore = 80;
	}
	
	//>80 pts
	/*public void computeCourseGrade() {
		int sum = 0;
		for(int valor : test) {
			sum = sum + valor;
		}
		
		double average = sum / NUM_OF_TESTS;
		
		if( average > 80) {
			courseGrade = "PASSED";
		} else {
			courseGrade = "FAILED";
		}
	}*/
}
