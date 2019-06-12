package main.java.NicolasRios.Inheritance;

public class Tests {

	
	public static void main (String[] args) {
		//Child child = new Child();
		//child.print();
		
		UndergraduateStudent jose = new UndergraduateStudent("Jose");
		UndergraduateStudent jose2 = new UndergraduateStudent("Jose2");
		UndergraduateStudent jose3 = new UndergraduateStudent("Jose3");
		
		GraduateStudent pedro = new GraduateStudent("Pedro");
		GraduateStudent pedro2 = new GraduateStudent("Pedro2");
		GraduateStudent pedro3 = new GraduateStudent("Pedro3");
		
		jose.setTestScore (1, 70);
		jose.setTestScore (2, 70);
		jose.setTestScore (3, 74);
		jose.computerCourseGrade();
		System.out.println(jose.courseGrade);
		
		pedro.setTestScore (1, 70);
		pedro.setTestScore (2, 70);
		pedro.setTestScore (3, 74);
		pedro.computerCourseGrade();
		System.out.println(pedro.courseGrade);
		
		
		UndergraduateStudent [] undergArray = new UndergraduateStudent [3];
		GraduateStudent [] graduateArray = new GraduateStudent [2];
		undergArray [0] = jose;
		undergArray [1] = jose2;
		undergArray [2] = jose3;
		
		graduateArray [1] = pedro;
		graduateArray [2] = pedro2;
		
		for (GraduateStudent student : graduateArray) {
			System.out.println(student.name);
		}
		
		for (UndergraduateStudent student : undergArray) {
			System.out.println(student.name);
	}
		Student[] allStudents = new Student[5];
		allStudents[0] = pedro;
		allStudents[1] = pedro2;
		allStudents[2] = jose;
		allStudents[3] = jose2;
		allStudents[4] = jose3;
		
		for (Student student : allStudents) {
			System.out.println(student.name);
		}
		
		
		
}
}
