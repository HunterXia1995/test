package test11;

import java.io.*;

public class pra1 {
    public static void main(String[] args) {
    //write ();
        write1 ("weishenme");
    }
    public static void write(){
        try {
            InputStream in=new FileInputStream ("D:\\1.txt");
            int len=0;
            while((len=in.read ())!=-1){
                char c=(char) len;
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    public static void write1(String str){

        try {
            OutputStream out=new FileOutputStream ("D:\\1.txt");
            byte[] b=str.getBytes ();
           out.write (b);
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
