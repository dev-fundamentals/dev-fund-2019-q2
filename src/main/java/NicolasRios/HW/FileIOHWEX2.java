package main.java.NicolasRios.HW;

import java.io.File;
import java.io.FilenameFilter;


public class FileIOHWEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Exercise1");
        String[] list = file.list(new FilenameFilter() {
         public boolean accept(File dir, String name) {
          if(name.toLowerCase().endsWith(".txt")){
                 return true;
             } else {
                 return false;
             }
         }
     });
     for(String f:list){
         System.out.println(f);
     }

	}

}
