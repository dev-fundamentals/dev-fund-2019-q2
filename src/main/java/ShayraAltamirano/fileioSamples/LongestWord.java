package main.java.ShayraAltamirano.fileioSamples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String longestWord = "";
	    String current;
	    
	    Scanner scan = new Scanner(new File("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt"));

	    
	    while (scan.hasNext()) {
	        current = scan.next();
	        if (current.length() > longestWord.length()) {
	            longestWord = current;

	        }
	    }
	    scan.close();
        System.out.println(longestWord);
	}

}
