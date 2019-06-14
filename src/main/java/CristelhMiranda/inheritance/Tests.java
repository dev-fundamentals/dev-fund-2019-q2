package main.java.CristelhMiranda.inheritance;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child child = new Child();
		//child.print();
		
		/*Student jose = new UndergraduateStudent("Jose");
		//jose.pr
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
		System.out.println(pedro.courseGrade);
		*/
		
		UndergraduateStudent jose = new UndergraduateStudent("Jose");
		UndergraduateStudent jose2 = new UndergraduateStudent("Jose2");
		UndergraduateStudent jose3 = new UndergraduateStudent("Jose3");
		//jose.pr
		GraduateStudent pedro = new GraduateStudent("Pedro");
		GraduateStudent pedro2 = new GraduateStudent("Pedro2");
		
		UndergraduateStudent[] undergArray = new UndergraduateStudent[3];
		GraduateStudent[] graduatedArray = new GraduateStudent[2];
		undergArray[0] = jose;
		undergArray[1] = jose2;
		undergArray[2] = jose3;
		
		graduatedArray[0] = pedro;
		graduatedArray[1] = pedro2;
		
		for (GraduateStudent student : graduatedArray) {
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
