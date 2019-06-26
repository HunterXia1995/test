package test7;
    import java.util.*;
    public class TestList{
        public static void main(String args[]){
                    List list = new ArrayList();
                    list.add("Hello");
                    list.add("World");
                    list.add("Hello");
                    list.add("Learn");
            Set set = new HashSet();
            set.addAll(list);
            System.out.println(set.size());
                    }
                }


