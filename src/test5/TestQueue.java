package test5;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Food food=new Food("廖子涵",10);
        Food food1=new Food("廖2涵",10);
        List<Food> arr=new ArrayList<>();
        arr.add(food);
        arr.add(food1);
        for(Food a:arr){
            System.out.println(a.getName());
        }
    }
}
