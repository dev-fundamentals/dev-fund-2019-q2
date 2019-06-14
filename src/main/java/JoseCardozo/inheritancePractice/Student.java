package main.java.JoseCardozo.inheritancePractice;

public class Student {
    public static final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    protected int minimumScore;

    public Student() {
        test = new int[NUM_OF_TESTS];
        name = "";
        courseGrade = "----";
    }

    public Student(String name) {
        test = new int[NUM_OF_TESTS];
        this.name = name;
        courseGrade = "----";
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore(int index) {
        return test[index-1];
    }

    public void setTestScore(int index,int value) {
        this.test[index-1] = value;
    }

    public void computeCourseGrade() {
        int sum = 0;
        for (int i : test) {
            sum += sum + i;
        }
        double average = (sum/NUM_OF_TESTS);
        System.out.println(average);
        courseGrade = (average > minimumScore) ? "PASSED" : "FAILED";
    }
}
