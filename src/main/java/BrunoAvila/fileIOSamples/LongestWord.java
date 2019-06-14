package main.java.BrunoAvila.fileIOSamples;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

	public static void main(String[] args) {
	       
	       BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader("D:\\files\\test.txt"));
				String line = reader.readLine();
				String longestWord = "";
				String current = "";
				while (line != null) {
					String[] word = line.split(" ");

				    for(int i = 0; i < word.length; i++){
				            if(word[i].length() >= current.length()){
				            	current = word[i];
				            } 
				    }
					if (current.length() > longestWord.length()) {
						longestWord = current;
			        }
					line = reader.readLine();
				}
				reader.close();
				System.out.println("Longest word: "+ longestWord);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	         


	}

}
