package main.java.LizzyMendivil;

public class Homework1 {
	public int mark;
	public String result = "";
	public String resultLiteral = "";
	public String resultEvenOrOdd = "";
	public String resultMultiplosOfFive = "";
	
	String name = "Jhon Doe";
	String title = "Software Engineer";
	byte age = 30;
	double height = 1.83;
	double weight = 59.5;
	boolean isUnemployed = false; 
	boolean isMarried = true;
	char devGrade = 'A';
	String favoriteSong = "Don't Speak (No Doubt)";
	
	
	
	public String checkPassFail() {
		if (mark >= 50) {
			return "PASS";
		} else {
			return "FAIL";
		}
	}
	
	public String fromOneToTen() {
		for(int i = 1; i <= 10; i++) {
			result += i + "-";
		}
		return result;
	}
	
	public String fromOneToTenLiteral() {
		for(int i = 1; i <= 10; i++) {
			switch(i) {
			case 1:
				resultLiteral += "Uno" + " ";
				break;
			case 2:
				resultLiteral += "Dos" + " ";
				break;
			case 3:
				resultLiteral += "Tres" + " ";
				break;
			case 4:
				resultLiteral += "Cuatro" + " ";
				break;
			case 5:
				resultLiteral += "Cinco" + " ";
				break;
			case 6:
				resultLiteral += "Seis" + " ";
				break;
			case 7:
				resultLiteral += "Siete" + " ";
				break;
			case 8:
				resultLiteral += "Ocho" + " ";
				break;
			case 9:
				resultLiteral += "Nueve" + " ";
				break;
			case 10:
				resultLiteral += "Diez";
				break;
			}
		}
		return resultLiteral;
	}
	
	public String addOne() {
		for(int i = 1; i <= 10; i++) {
			result += i + "-";
		}
		return result;
	}
	
	public String showIfIsEvenOrOdd() {
		for(int i = 1; i <= 10; i++) {
			if (i%2==0) {
				resultEvenOrOdd += i + " is even -- ";
			} else {
				resultEvenOrOdd += i + " is odd -- ";
			}
		}
		return resultEvenOrOdd;
	}
	
	public String multiplosOfFive() {
		for(int i = 1; i <= 1000; i++) {
			if (i%5 == 0) {
				resultMultiplosOfFive += i + "-";
			}
		}
		return resultMultiplosOfFive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework1 hw1 = new Homework1();
		hw1.mark = 40;
		System.out.println("Practice 1");
		System.out.println(hw1.checkPassFail());
		System.out.println("Practice 2");
		System.out.println(hw1.fromOneToTen());
		System.out.println("Practice 3");
		System.out.println(hw1.fromOneToTenLiteral());
		System.out.println("Practice 4");
		System.out.println(hw1.showIfIsEvenOrOdd());
		System.out.println("Practice 5");
		System.out.println(hw1.multiplosOfFive());
	}

}
