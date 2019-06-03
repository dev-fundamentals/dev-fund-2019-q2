package main.java.ShayraAltamirano.fileioSamples;

import java.io.File;

public class CompareLex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\input.txt");
        File f2 = new File("D:\\Capacitaciones Jala\\DEV-FUNDAMENTALS\\output.txt");
        
        int value=f1.compareTo(f2);
        if(value == 0) {
            System.out.print(f1.getName()+" = "+f2.getName());
         }
         else if(value > 0) {
            System.out.print(f1.getName()+" > "+f2.getName());
         }
         else {
            System.out.print(f1.getName()+" < "+f2.getName());
         }
        
	}
}
