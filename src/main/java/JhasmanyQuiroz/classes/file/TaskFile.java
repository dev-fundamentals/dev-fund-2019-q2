package main.java.JhasmanyQuiroz.classes.file;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskFile {
    /**
     * Method that returns all files of a specific path.
     *
     * @param path
     * @return a String[] with the file path.
     */
    public static String[] getAllFiles(String path) {
        String[] filePaths = null;
        File files;

        try {
            files = new File(path);

            if (files.exists()) {
                filePaths = new File(path).list();
            } else {
                System.out.println("The file path doesn't exist.");
            }
        } catch (Exception exception) {
            System.out.println("There was a problem, to read the file. " + exception);
        }

        return filePaths;
    }

    /**
     * Method that returns all files with a specific extension.
     *
     * @param path
     * @param extension
     * @return a ArrayList with the filepath
     */
    public static ArrayList<String> getFilesByExtensions(String path, String extension) {
        String[] filePaths = getAllFiles(path);
        ArrayList<String> result = new ArrayList<>();

        for (String filePath : filePaths) {
            if (filePath.toLowerCase().contains(extension)) {
                result.add(filePath);
            }
        }

        return result;
    }

    /**
     * Method that compare two files.
     *
     * @param filePath1
     * @param filePath2
     * @return a boolean, true if the files are equals, otherwise false.
     */
    public static boolean compareFiles(String filePath1, String filePath2) {
        boolean result = false;

        try {
            File file1 = new File(filePath1);
            File file2 = new File(filePath2);

            if (file1.exists() && file2.exists()) {
                String entireFileText1 = new Scanner(file1).useDelimiter("\\A").next();
                String entireFileText2 = new Scanner(file2).useDelimiter("\\A").next();

                result = entireFileText1.equals(entireFileText2);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Method thar read a file line by line.
     *
     * @param path
     * @return a String with all file content.
     */
    public static String readLineByLineAFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while((line = bufferedReader.readLine())!=null){
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    /**
     * Method that obtain the longest word of a file.
     *
     * @param path
     * @return a String with longest word.
     */
    public static String getLongestWordIntoFile(String path) {
        BufferedReader bufferedReader;
        String result = "";
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while((line = bufferedReader.readLine()) != null){
                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.length() > result.length()) {
                        result = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        Path sourceDir = Paths.get("src");
        String srcPath = sourceDir.toAbsolutePath().toString();
        String path = srcPath + "/main/java/JhasmanyQuiroz/classes/class03";

        //Get all files
        String[] files = getAllFiles(path);
        for (String file : files) {
            System.out.println("File: " + file);
        }

        //Get files by extension
        ArrayList<String> filesByExtension = getFilesByExtensions(path, ".txt");
        for (String file : filesByExtension) {
            System.out.println("File: " + file);
        }

        //Compare two files
        String path1 = path + "/Arrays.java";
        String path2 = path + "/ArrayTest.java";
        boolean areEquals = compareFiles(path1, path2);
        System.out.println("Are equals the files? " + areEquals);

        //Read line by line a file
        String fileContent = readLineByLineAFile(path1);
        System.out.println("The file content is: " + fileContent);

        //Get the longest word
        String word = getLongestWordIntoFile(path1);
        System.out.println("The longest word is: " + word);
    }
}
