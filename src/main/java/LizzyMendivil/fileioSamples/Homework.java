package main.java.LizzyMendivil.fileioSamples;

import java.util.Scanner;
import java.io.*;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. List of all file/directory names from the given.
		File folder = new File("D:\\files");
		String[] files = folder.list();
		for (String file : files) {
			System.out.println(file);
		}
		
		// 2. Specific files by extensions from a specified folder.
		
		File folder2 = new File("D:\\files");
		FilenameFilter txtFilterName = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if (name.endsWith("txt")) {
					return true;
				}
				return false;
			}
		};
		File[] files2 = folder.listFiles(txtFilterName);
		for (File file: files2) {
			System.out.println(file.getName());
		}

		// 3. Compare two files lexicographically.
		
		File fileA = null;
		File fileB = null;
		try {
			fileA = new File("D:\\files\test1.txt");
			fileB = new File("D:\\files\test2.txt");
			
			int value = fileA.compareTo(fileB);
			
			if (value == 0) {
				System.out.println(" = ");
			} else if (value > 0) {
				System.out.println(" > ");
			} else {
				System.out.println(" < ");
			}
			System.out.println("Value returned: " + value);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 4. Read a file line by line and store it into a variable.
		
		StringBuilder sb = new StringBuilder();
        String line = "";
        String data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:\\files\\test2.txt"));
             while (line != null)
             {
                if (line == null)
                  break;
                data += line;
                line = br.readLine();
                
            }
              System.out.println(data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

		// 5. Append text to an existing file.
        
        String textToAppend = "Homework DevFundamentals";
        File f1 = new File("D:\\files\\test3.txt");
        try {
           
            if(!f1.exists()) {
               f1.createNewFile();
            }

            // FileWriter fileWritter = new FileWriter(f1.getName(),true);
            FileWriter fileWritter = new FileWriter("D:\\files\\test3.txt", true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.newLine();
            bw.write(textToAppend);
            bw.close();
            System.out.println("Done");
         } catch(IOException e){
            e.printStackTrace();
         }

		// 6. Find the longest word in a text file.
        
        String longestWord = "";
        String current;
        try {
        	Scanner scanner = new Scanner(new File("D:\\files\\test3.txt"));

            while (scanner.hasNext()) {
               current = scanner.next();
                if (current.length() > longestWord.length()) {
                	longestWord = current;
                }
            }
            System.out.println("\n"+ longestWord +"\n");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        
	}
}
