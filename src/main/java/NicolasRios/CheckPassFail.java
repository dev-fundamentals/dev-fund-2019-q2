package main.java.NicolasRios;

public class CheckPassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = 20;

		if (mark >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		System.out.println("DONE");
		
		/*
		 * Exercise 2
		 */
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Printing using for loop" + i);
		}
		
		/*
		 * Exercise 3
		 */
		for(int i = 1; i <= 10; i++) {
			String iString = null;
		
	switch (i) {
	case 1:
		iString = "One";
		break;
	case 2:
		iString = "Two";
		break;
	case 3:
		iString = "Three";
		break;
	case 4:
		iString = "Four";
		break;
	case 5:
		iString = "Five";
		break;
	case 6:
		iString = "Six";
		break;
	case 7:
		iString = "Seven";
		break;
	case 8:
		iString = "Eight";
		break;
	case 9:
		iString = "Nine";
		break;
	case 10:
		iString = "Ten";
		break;
	}
	System.out.println(iString);
		}
		
		/*
		 * Exercise 4
		 */
		for (int i = 0; i <= 10; i++) {
		       
		       if (i % 2 <= 0) {
		       System.out.println(i + "Even");
		       
		       } else {
		       System.out.println(i + "Odd");
		       
		}
		}

	
	/*
	 * Exercise 5
	 */
	for (int i = 0; i <= 1000; i+=50) {
		System.out.println(i);
		if (i % 50 == 0);
	}
		
		
	}
	}

	
	
	
