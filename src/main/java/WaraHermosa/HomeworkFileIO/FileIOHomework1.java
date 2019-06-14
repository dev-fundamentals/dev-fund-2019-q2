package main.java.WaraHermosa.HomeworkFileIO;

import java.io.File;

public class FileIOHomework1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     {
		        File file = new File("D:\\ExerciseOne");
		        String[] fileList = file.list();
		        for(String name:fileList){
		            System.out.println(name);
		        }
		    }
		}
	}

