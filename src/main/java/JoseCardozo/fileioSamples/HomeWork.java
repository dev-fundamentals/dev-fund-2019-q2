package main.java.JoseCardozo.fileioSamples;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        getAllFilesOrDirectoryNames();
        getFilesByExtention("D://",".txt");
        compareFiles("D://In.txt", "D://Out.txt");
        readFileIntoVariable("D:\\In.txt");
        addTextInExistingFile("D:\\In.txt");
        findLongestWord("D:\\In.txt");
    }

    private static void findLongestWord(String fileName) throws IOException {
        FileInputStream reader = null;
        String longestWord = "";
        String current;
        try{
            reader = new FileInputStream(fileName);
            BufferedInputStream in = new BufferedInputStream(reader);
            while((in.read()) != -1)
            {
            }
        }finally {
        if (reader != null){
            reader.close();
        }
    }

    }

    private static void addTextInExistingFile(String fileName) throws IOException {
        FileWriter out = null;
        try {
            out = new FileWriter(fileName,true);
            String text = "Text to add";
            out.write(text);
        }finally {
            if (out != null){
                out.close();
            }
        }
    }

    private static void readFileIntoVariable(String fileName) {
        String value ="";
        try {
           List<String> lines = Files.readAllLines(Path.of(fileName));

            for (String line : lines) {
                value += line;
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("the content on file is: " + value);
    }

    private static void compareFiles(String firstFileName, String secondFileName) {

        try{
            File firstFile = new File(firstFileName);
            File secondFile = new File(secondFileName);
            int i = firstFile.compareTo(secondFile);
            if ( i == 0 ){
                System.out.println("the files are equals");
            }
            else {
                System.out.println("The files aren't equals");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void getFilesByExtention(String directory, String extention) {
        File file = null;
        String[] paths;
        FilenameFilter extentionFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extention);
            }
        };
        try{
            file = new File(directory);
            paths = file.list(extentionFilter);
            for (String path : paths) {
                System.out.println(String.format("In %s directory, there is a file %s, with %s extention",directory,path,extention));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void getAllFilesOrDirectoryNames() {
        File file = null;
        String[] paths;
        try {
            file = new File("D://");
             paths = file.list();
            for (String path: paths) {
                System.out.println(String.format("The file/direcotry name is: %s", path));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
