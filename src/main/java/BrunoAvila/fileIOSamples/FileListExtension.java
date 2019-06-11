package main.java.BrunoAvila.fileIOSamples;

import java.io.File;

public class FileListExtension {

	public static void main(String[] args) {

		File fileDir = new File("D:\\files\\");
		String extensionToSearch = "txt";

        if (!fileDir.exists()){
            System.out.println("Path not found");
            System.exit(-1);
        }
        File[] fileList = fileDir.listFiles();
        File[] filesExtension = new File[10];
        int i = 0;
        
        for (File file : fileList) {
        	String fileName = file.getName();
        	int index = fileName.lastIndexOf('.');
        	if (index > 0) {      		
        		String extension = fileName.substring(index+1);
            	if (extension.equals(extensionToSearch)) {
    				filesExtension[i] = file;
    				i++;
    			}    				
			}
        	   				
		}
        for (File file : filesExtension) {
        	if (file != null) {
        		System.out.println(file.getName());
			}
        	
		}
	}

}
