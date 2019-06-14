package main.java.BenhaminHuanca.FilePractice;

import java.io.File;
import java.io.FilenameFilter;

public class FileHandling {
    public static void main(String[] args) {
        //createDir();
        //listDir();
        //Print files with an specific extension
        String path = "c:/code";
        String extension = ".pdf";
        File[] files = getSpecificFiles(path, extension);
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println("-------");
    }

    //Create a new directory
    public static void createDir() {
        String dirName = "c:/code/FileTest";
        File d = new File(dirName);
        d.mkdir();
    }

    //Get list of all directories
    public static void listDir() {
        File file = null;
        String[] paths;
        try {
            file = new File("c:/code");
            paths = file.list();
            for (String path : paths) {
                System.out.println(path);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    //Get specific files from a given extensions
    public static File[] getSpecificFiles(String dirName, String extension) {
        File dir = new File(dirName);

        return dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String filename) {
                return filename.endsWith(extension);
            }
        });
    }

    
}
