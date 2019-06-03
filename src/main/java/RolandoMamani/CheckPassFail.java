package main.java.RolandoMamani;

public class CheckPassFail {
	static int mark = 50;
	public static void main(String[] args) {
		/*if (mark >= 50){
            System.out.println("PASS");
        } else
            System.out.println("FALSE");
        System.out.println("DONE");
        printForIteratorValues();
        printForIteratorValuesLiteraly();
        printForIteratorValuesAndIfisEvenOrOdd();
        printWhileIteratorMultipleOf50();*/
        
        /*Class2 Practice*/
        Arreglos cp = new Arreglos();
        cp.printIndexAndRepeatedValuesinArray();

	}
	
	static public void printForIteratorValues(){
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	static public void printForIteratorValuesLiteraly() {
		for(int i = 1; i<=10; i++) {
			switch(i) {
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
			case 4:
				System.out.println("Four");
			case 5:
				System.out.println("Five");
			case 6:
				System.out.println("Six");
			case 7:
				System.out.println("Seven");
			case 8:
				System.out.println("Eight");
			case 9:
				System.out.println("Nine");
			case 10:
				System.out.println("Ten");
			}
			
		}
	}
	
	static public void printForIteratorValuesAndIfisEvenOrOdd() {
		for(int i = 1; i<=10; i++) {
			if ((i%2)==0) {
				System.out.println(i+" It is Odd");
			} else
				System.out.println(i + " It is Even");
		}
	}
	
	static public void printWhileIteratorMultipleOf50() {
		int iterator = 1000;
		while(iterator < 1000) {
			if(iterator%50 == 0) {
				System.out.println(iterator);
			}
			iterator = iterator -1;
		}
	}	

}
