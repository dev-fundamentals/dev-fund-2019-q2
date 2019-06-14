package main.java.MiguelVega.Directories;

import java.io.File;

public class ReadDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=null;
		String[] paths;

		try
		{
		//create new file objetc
		file=new File("C:\\Miguel\\Directory");

		//array of files and directory
		paths=file.list();

		// for each name in the path array
		for(String path:paths)
		{
		//print filename and directoty name
		System.out.println(path);
		}
		}
		catch(Exception e)
		{
		//if any error occurs
		e.printStackTrace();
		}	
	}
}
