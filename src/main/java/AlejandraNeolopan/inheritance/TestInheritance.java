package main.java.AlejandraNeolopan.inheritance;

public class TestInheritance {
	public static void main (String args[]) {
	//	Child child =new Child();
		//child.print();
		Student jose = new UndergraduateStudent();
		Student pedro = new GraduatedStudent();
		jose.setTestScore(1, 67);
		jose.setTestScore(2, 70);
		jose.setTestScore(3, 80);
		System.out.println(jose.computeGrade());
		pedro.setTestScore(1, 67);
		pedro.setTestScore(2, 70);
		pedro.setTestScore(3, 80);
		System.out.println(pedro.computeGrade());
		
	
	Student[] students= new Student[5];
	students[0]= new UndergraduateStudent("pedro1");
	students[1]= new UndergraduateStudent("pedro2");
	students[2]= new GraduatedStudent("jose1");
	students[3]= new GraduatedStudent("jose2");
	students[4]= new GraduatedStudent("jose3");
	for (Student stud:students) {
		System.out.println(stud.name);
	}
}
	
}
