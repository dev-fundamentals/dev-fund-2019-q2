package main.java.NicolasRios.HW;

import java.io.File;

public class FileIOHWEX1 {

	public static void main(String[] args) {
		{
            File file = new File("D:\\Exercise1");
            String[] fileList = file.list();
            for(String name:fileList){
                System.out.println(name);
            }
        }

	}

}
