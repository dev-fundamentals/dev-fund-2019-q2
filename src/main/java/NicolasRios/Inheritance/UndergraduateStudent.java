package main.java.NicolasRios.Inheritance;

public class UndergraduateStudent extends Student {
	UndergraduateStudent (String name) {
	super (name);
	minimumScore = 70;
	}
	
	
	
}
// > 70 pts
	/*void computerCourseGrade () {
		// compute avg
		
		int sum = 0;
		for (int valor : test ) {
			sum = sum + valor;
		}

	double average = sum / NUM_OF_TESTS;
	
	if (average > 70) {
		courseGrade = "PASSED";
	} else {
		courseGrade ="FAILED";
	}
	
	}
}
*/
