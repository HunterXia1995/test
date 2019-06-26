package test7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest1 {
    public static void main(String[] args) {
        WorkerManager WM=new WorkerManager();
        Worker w1=new Worker("Z三",18,3000);
        Worker w2=new Worker("L四",25,3500);
        Worker w3=new Worker("W五",22,3200);
    TreeSet<Worker> t=new TreeSet<>(new MyComparator());
    t.add(w1);
    t.add(w2);
    t.add(w3);
        Iterator<Worker> i=t.iterator();

              while(i.hasNext()){
                  Worker w=i.next();
            System.out.println(w);
        }

    }

public static class MyComparator implements Comparator<Worker>{
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().charAt(0) - o2.getName().charAt(0);
    }
}
}
