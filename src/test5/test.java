package test5;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List arr=new ArrayList(5);
        arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);
        arr.add(13);
        arr.add(13);
        arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);
        arr.add(13);arr.add(13);arr.add(13);arr.add(13);arr.add(13);

        System.out.println();
        for(Object o: arr){
            System.out.print(o+"\t");
        }
    }
}
