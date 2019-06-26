import java.util.*;
public class TestList {
    public static void main(String args[]) {
        MyClass mc1 = new MyClass(10);
        MyClass mc2 = new MyClass(20);
        MyClass mc3 = new MyClass(30);
        List list = new ArrayList();
        list.add(mc1);
        list.add(mc2);
        list.add(mc3);
        mc3 = mc2;
        mc3.value = 50;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
    class MyClass{
        int value;
        public MyClass(){}
        public MyClass(int value){ this.value = value; }
        public String toString(){
            return ""+value;
        }
    }


