package main.java.ShayraAltamirano.fileioSamples;

import java.io.File;
import java.io.FilenameFilter;
public class GetByExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS");
	        File[] files = file.listFiles(new FilenameFilter() {
	             
	            
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(File f:files){
	            System.out.println(f.getName());
	        }
	}

}
