package main.java.LizzyMendivil.inheritance;

public class Test {
	
	public static void main(String[] args) {
		// Child child = new Child();
		// child.print();
		// System.out.println(child.publicAtt);
		
		// UndergraduateStudent jose = new UndergraduateStudent("Jose");
		// GraduateStudent pedro = new GraduateStudent("Pedro");
		
		/* Student jose = new UndergraduateStudent("Jose");
		Student pedro = new GraduateStudent("Pedro");
		
		jose.setTestScore(1, 70);
		jose.setTestScore(2, 70);
		jose.setTestScore(3, 74);
		jose.computeCourseGrade();
		System.out.println(jose.courseGrade);
		
		pedro.setTestScore(1, 70);
		pedro.setTestScore(2, 70);
		pedro.setTestScore(3, 74);
		pedro.computeCourseGrade();
		System.out.println(pedro.courseGrade); */
		
		UndergraduateStudent jose = new UndergraduateStudent("Jose");
		UndergraduateStudent jose2 = new UndergraduateStudent("Jose2");
		UndergraduateStudent jose3 = new UndergraduateStudent("Jose3");
		
		GraduateStudent pedro = new GraduateStudent("Pedro");
		GraduateStudent pedro2 = new GraduateStudent("Pedro2");
		
		UndergraduateStudent[] underArray = new UndergraduateStudent[3];
		GraduateStudent[] graduateArray = new GraduateStudent[2];
		
		underArray[0] = jose;
		underArray[1] = jose2;
		underArray[2] = jose3;
		
		graduateArray[0] = pedro;
		graduateArray[1] = pedro2;
		
		for (GraduateStudent student : graduateArray) {
			System.out.println(student.name);
		}
		
		for (UndergraduateStudent student : underArray) {
			System.out.println(student.name);
		}
		
		System.out.println("****************");
		
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
