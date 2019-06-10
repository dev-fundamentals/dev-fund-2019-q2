package main.java.ShayraAltamirano.fileioSamples;

import java.io.File;
import java.io.IOException;

public class GetFiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		        File file = new File("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS");
		        String[] fileList = file.list();
		        for(String name:fileList){
		            System.out.println(name);
		        }
		    
	}

}
