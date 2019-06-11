package main.java.AlejandraNeolopan.files;

import java.io.File;

public class listEspecificFile {
    public static void main(String[] args) {
      File folder = new File(System.getProperty("user.dir"));
      listEspecificFile listFiles = new listEspecificFile();
      String extension = "md";
      System.out.println("Directory of "+folder.getPath());
      listFiles.listAllFilesByExtension(folder, extension);
      

     }
    
     public void listAllFilesByExtension(File folder, String extensionBy){
         File[] fileNames = folder.listFiles(File::isFile);
         String currentExtension = "";
         for(File file : fileNames){
        	 currentExtension="";
        	 int i = file.getName().lastIndexOf('.');
        	 if (i >= 0) {
        		 currentExtension = file.getName().substring(i+1);
        	 }
        	
        	if (currentExtension.equals(extensionBy))
        		System.out.println(file.getName());
        }
     }
     
     
     
}