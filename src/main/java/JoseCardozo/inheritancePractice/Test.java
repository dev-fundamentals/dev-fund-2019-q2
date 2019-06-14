package main.java.JoseCardozo.inheritancePractice;

public class Test {
    public static void main(String[] args) {
        UndergraduateStudent jose = new UndergraduateStudent("Jose");
        GraduteStudent pedro = new GraduteStudent("Pedro");

        jose.setTestScore(1,70);
        jose.setTestScore(2,70);
        jose.setTestScore(3,74);
        jose.computeCourseGrade();
        System.out.println(jose.courseGrade);

        pedro.setTestScore(1,70);
        pedro.setTestScore(2,70);
        pedro.setTestScore(3,74);
        pedro.computeCourseGrade();
        System.out.println(pedro.courseGrade);

        UndergraduateStudent jose1 = new UndergraduateStudent("Jose");
        UndergraduateStudent jose2 = new UndergraduateStudent("Jose");
        GraduteStudent pedro1 = new GraduteStudent("Pedro");

        Student[] allStudents = new Student[5];
        allStudents[0] = pedro;
        allStudents[1] = pedro1;
        allStudents[2] = jose;
        allStudents[3] = jose1;
        allStudents[4] = jose2;

        for (Student studen :
                allStudents) {
            System.out.println(studen.name);
        }
    }
}
