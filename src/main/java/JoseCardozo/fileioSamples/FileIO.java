package main.java.JoseCardozo.fileioSamples;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
//        FileInputStreamExample();
//        System.out.println("+++++++++++++++++++++++++++++++");
//        FileReaderExample();
        System.out.println("+++++++++++++++++++++++++++++++");
        InputStreamExample();
    }

    private static void InputStreamExample() throws IOException {
        InputStreamReader cin = null;
        try{
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do{
                c = (char) cin.read();
                System.out.println(c);
            }while (c != 'q');
        }finally {
            if ( cin != null){
                cin.close();
            }
        }
    }

    private static void FileReaderExample() throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("D:\\In.txt");
            out = new FileWriter("D:\\out.txt");

            int c;
            while( (c = in.read()) != -1){
                System.out.println(c);
                out.write(c);
            }
        }finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }

    private static void FileInputStreamExample() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\In.txt");
            out = new FileOutputStream("D:\\Out.txt");
            int c;
            while ((c = in.read()) != -1){
                System.out.println(c);
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}
