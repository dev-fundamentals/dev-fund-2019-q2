package main.java.AlejandraNeolopan_Files;

import java.io.File;

public class listFiles {
    public static void main(String[] args) {
      File folder = new File(System.getProperty("user.dir"));
      listFiles listFiles = new listFiles();
      System.out.println("Directory of "+folder.getPath());
      listFiles.listFolders(folder);
      listFiles.listAllFiles(folder);
      

     }

     public void listFolders(File folder){
         File[] fileNames = folder.listFiles(File::isDirectory);
         
         for(File file : fileNames){
        	 System.out.println("<DIR>    " + file.getName());
         }
     }
     
     public void listAllFiles(File folder){
         File[] fileNames = folder.listFiles(File::isFile);
         
         for(File file : fileNames){
        	 System.out.println("         "+file.getName());
         }
     }
     
     
     
}