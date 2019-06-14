package main.java.KevinAlvarez;

public class Arrays {

	public static void main(String[] args) {
		String[] words = new String[10];
		words[0] = "One";
		words[1] = "Two";
		words[2] = "Three";
		words[3] = "Four";
		words[4] = "Five";
		words[5] = "Six";
		words[6] = "Seven";
		words[7] = "Eight";
		words[8] = "Nine";
		words[9] = "Ten";
		
		for (int index = 0; index < words.length; index++)
			System.out.print (words[index] + " ");
		
		System.out.println("");
		
		for (String current : words) System.out.print(current + " ");
		
		System.out.println("");
		
		int index = 0;
		while (index < words.length) {
			System.out.print (words[index] + " ");
			index++;
		}
		
		System.out.println("");
		
		String [] exercise2 = new String[5];
		exercise2[0] = "HELLO";
		exercise2[1] = new String("HELLO");
		exercise2[2] = "ABC";
		exercise2[3] = "123";
		exercise2[4] = new String("1234");
		String repetedWords = "";
		
		for(int i = 0; i < exercise2.length; i ++) {
			String indices = "";
			if (repetedWords.contains(exercise2[i])) continue;
			for(int j = i + 1; j < exercise2.length; j ++) {
				if (exercise2[j].equals(exercise2[i])) indices += ", " + j;
			}
			if (indices.length() > 0) {
				repetedWords += exercise2[i];
				System.out.println("Indices: " + i + indices);
				System.out.println("Palabra: " + exercise2[i]);
			}
		}
		
	}

}
