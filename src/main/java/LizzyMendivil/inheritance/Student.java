package main.java.LizzyMendivil.inheritance;

public class Student {
	
	public static final int NUM_OF_TESTS = 3;
	protected String name;
	protected int[] test;
	protected String courseGrade;
	protected int minimumScore; // las clases derivadas deben ser las que seteen
	
	public Student() {
		test = new int[NUM_OF_TESTS];
		this.name = "";
		this.courseGrade = "----";
	}
	
	public Student(String name) {
		test = new int[NUM_OF_TESTS];
		this.name = name;
		this.courseGrade = "----";
	}
	
	public String getCourseGrade() {
		return this.courseGrade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTestScore(int index) {
		return this.test[index - 1];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTestScore(int pos, int value) {
		this.test[pos - 1] = value;
	}
	
	public void computeCourseGrade() {
		int sum = 0;
		for (int valor : test) {
			sum = sum + valor;
		}
		double average = sum / NUM_OF_TESTS;
		
		if (average > this.minimumScore) {
			courseGrade = "PASSED";
		} else {
			courseGrade = "FAILED";
		}
	}

}
