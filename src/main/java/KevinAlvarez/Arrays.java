package main.java.KevinAlvarez;

public class Arrays {
	


	public static void main(String[] args) {
		String[] words = new String[10];
		words[0] ="One";
		words[1] ="Two";
		words[2] ="Three";
		words[3] ="Four";
		words[4] ="Five";
		words[5] ="Six";
		words[6] ="Seven";
		words[7] ="Eight";
		words[8] ="Nine";
		words[9] ="Ten";
		
		for (int index = 0; index < words.length; index++)
			System.out.print (words[index] + " ");
		
		System.out.println("");
		
		for (String current : words) System.out.print(current + " ");
	}

}
