package test11;

import javax.swing.text.NumberFormatter;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

public class prac {
    public static void main(String[] args) {
        File file =new File("D:\\1.txt");
        if(!file.exists()){

            try {
                file.createNewFile ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
        System.out.println(file.exists ());
        System.out.println(file.isFile ());
        System.out.println(file.isDirectory ());
        System.out.println(file.getName ());
        System.out.println( file.getAbsolutePath ());
        /*long length = file.length();
        Double len = Double.valueOf(length) / 1024;
        String format = String.format("%.2f", len);*/
        long length=file.length ();
        Double len=Double.valueOf (length)/1024;
        String format=String.format ("%.2f",len);
        System.out.println(format);
        System.out.println(format);

    }
}
