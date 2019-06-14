package main.java.AlejandraNeolopan.inheritance;

public class Student {
public static final int NUM_OF_TESTS=3;
protected String name;
protected int[] test;
protected String courseGrade;
protected int minimumScore;

Student(){
	test=new int[NUM_OF_TESTS];
	name= "";
	courseGrade= "----";
}
Student(String nam){
	name=nam;
}
public String getCourseGrade(){
	return courseGrade;
}

public String getName(){return name;}
public void setName(String nam){name=nam;}
public int getTestScore(int i){
	if (i>=0)
		return test[i-1];
	return 0;
}
public void setTestScore(int pos,int value) {
	test[pos-1]=value;
}
public String computeGrade() {
	
	int result=0;
	
	for (int grade:test){
		result += grade;
	}
	double avg=result/NUM_OF_TESTS;
	if (avg>minimumScore)
		return  "Passed";
	return "Failed";
}
}
