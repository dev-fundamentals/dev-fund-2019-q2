package main.java.LizzyMendivil.practice2;

import java.util.Scanner;

public class FiguresTesting {
	
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose an option choice");
        System.out.println("------------------------\n");
        System.out.println("1 - Create rectangle");
        System.out.println("2 - Create square");
        System.out.println("3 - Display figure");
        System.out.println("4 - Exit");

        selection = input.nextInt();
        return selection;    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
        	userChoice = menu();
	        switch (userChoice) {
	        case 1:
	        	System.out.println("Please, enter a tag");
	        	String tag = input.nextLine();
	        	System.out.println("Please, enter a base");
	        	int base = input.nextInt();
	        	System.out.println("Please, enter a height");
	        	int height = input.nextInt();
	        	Rectangle myRectangle = new Rectangle(base, height);
	        	myRectangle.setTag(tag);
	        	System.out.println("----Figure Draw---");
	        	myRectangle.drawTxt();
	        	System.out.println("");
	        	System.out.println("----Figure Description---");
	        	myRectangle.printDescription();
	        	System.out.println("");
	        	break;
	        case 2:
	        	System.out.println("Please, enter a tag");
	        	String tagSquare = input.nextLine();
	        	System.out.println("Please, enter a side");
	        	int side = input.nextInt();
	        	Square mySquare = new Square(side);
	        	mySquare.setTag(tagSquare);
	        	System.out.println("----Figure Draw---");
	        	mySquare.drawTxt();
	        	System.out.println("");
	        	System.out.println("----Figure Description---");
	        	mySquare.printDescription();
	        	System.out.println("");
	        	break;
	        case 3:
	        	// myRectangle.drawTxt();
	        	// mySquare.drawTxt();
	        	break;
	        case 4:
	        	exit = true;
	        	System.out.println("Bye!");
	        	break;
	        default:
	        	System.out.println("Invalid option.");
	        	break;
	        }
        }
	}

}
