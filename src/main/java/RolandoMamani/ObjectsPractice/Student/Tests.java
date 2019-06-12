package main.java.RolandoMamani.ObjectsPractice.Student;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jose1 = new UndergraduateStudent("Jose1");
		Student jose2 = new UndergraduateStudent("Jose2");
		Student jose3 = new UndergraduateStudent("Jose3");
		Student pedro1 = new GraduateStudent("Pedro1");
		Student pedro2 = new GraduateStudent("Pedro2");
		
		jose1.setTestScore(1, 70);
		jose1.setTestScore(2, 70);
		jose1.setTestScore(3, 74);
		jose1.computeCourseGrade();
		System.out.println(jose1.getCourseGrage());
		
		pedro1.setTestScore(1, 70);
		pedro1.setTestScore(2, 70);
		pedro1.setTestScore(3, 74);
		pedro1.computeCourseGrade();
		System.out.println(pedro1.getCourseGrage());
		
		UndergraduateStudent [] undergArray = new UndergraduateStudent[3];
		GraduateStudent [] graduateArray = new GraduateStudent[3];
		Student [] allStudents = new Student[5];
		allStudents[0] = jose1 ;
		allStudents[1] = jose2 ;
		allStudents[2] = jose3 ;
		allStudents[3] = pedro1 ;
		allStudents[4] = pedro2 ;
		
		//undergArray[0] = jose1;
		//undergArray[1] = jose2;
		//undergArray[2] = jose3;
		for(Student student : allStudents) {
			System.out.println(student.name);
		}
		
		
	}

}
