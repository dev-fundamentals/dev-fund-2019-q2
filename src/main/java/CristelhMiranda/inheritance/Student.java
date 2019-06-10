package main.java.CristelhMiranda.inheritance;

public class Student {
	public static final int NUM_OF_TESTS = 3;
	protected String name;
	protected int[] test; //3
	protected String courseGrade;
	protected int minimumScore;
	
	Student(){
		test = new  int[NUM_OF_TESTS];
		name = "";
		courseGrade = "----";
	}
	
	Student(String name){
		test = new  int[NUM_OF_TESTS];
		this.name = name;
		courseGrade = "----";
	}
	
	String getCourseGrade(){
		return courseGrade;
	}
	
	String getName() {
		return name;
	}
	
	int getTestScore(int index) {//1 ->0
		return test[index - 1];
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTestScore(int pos, int value) {//1 --> 0
		test[pos - 1] = value;
	}
	
	void computeCourseGrade() {
		int sum = 0;
		for (int valor : test) {
			sum = sum + valor;
		}
		
		double average = sum / NUM_OF_TESTS;
		
		if (average > minimumScore) {
			courseGrade = "PASSED";
		}else {
			courseGrade = "FAILED";
		}
	}
}
