package test10;

import java.util.Map;
import java.util.TreeMap;
import java.util.*;
public class StudentManager {
    Map<String,Student> studentMap=new TreeMap<>();
    public void Start(){
        Student stu=new Student("20132254","廖子涵",50,'女');
        Student stu1=new Student("20132245","廖子涵1",51,'男');
        Student stu2=new Student("20132279","廖子涵2",53,'女');
        studentMap.put(stu.getStuNo(),stu);studentMap.put(stu1.getStuNo(),stu1);studentMap.put(stu2.getStuNo(),stu2);

    }
    public void addStudent(){


    }
}
