package test6;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class testProperties {
    public static void main(String[] args) {


        Properties prop = new Properties();
        InputStream io = testProperties.class.getResourceAsStream("myFile.properties");
        Reader reader = new InputStreamReader(io);
        //System.out.println(io!=null);
        try{
            prop.load(reader);
            print(prop);
            String name=prop.getProperty("name");
            String stuNo=prop.getProperty("stuNo");
            int age=Integer.parseInt(prop.getProperty("age"));
            Student stu=new Student(name,stuNo,age);
            System.out.println(stu);

        }
        catch(IOException e){
            e.printStackTrace();

        }
    }
   private static void print(Properties prop){
        Set<String> keys= prop.stringPropertyNames();
        keys.stream().forEach(key ->{
          String value=prop.getProperty(key);
          System.out.println("Key="+key+",\t value="+value);
        });
   }
}