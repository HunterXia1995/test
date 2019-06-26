package test7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkerManager {
    Worker ww=new Worker();
    List<Worker> list=new ArrayList();
    Worker w1=new Worker("zhang3",18,3000);
    Worker w2=new Worker("li4",25,3500);
    Worker w3=new Worker("wang5",22,3200);
    public void addWorker(String name, int age, double salary){
        list.add(w1);
        list.add(w2);
        list.add(w3);
        Worker w4=new Worker(name,age,salary);
        list.add(1,w4);


    }
    public void insertWorker(String name, int age, double salary){
        Worker w4=new Worker(name,age,salary);
        list.add(1,w4);
        System.out.println("插入的对象:"+w4);
    }
    public boolean removeWorker(Worker worker){
       boolean b= list.remove(worker);
       return b;

    }
    public void print(List<Worker> list){
        for(Worker o:list){
            System.out.println(o);
        }
    }
    public void print1(List<Worker> list){
        Iterator<Worker> i=list.iterator();
        while(i.hasNext()){
            Worker w=i.next();
            w.work();
        }
    }
    public void print2(List<Worker> list){
        list.stream().forEach(a ->{
            System.out.println(a);
        });
    }
    public void print3(List<Worker> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void start(){
        Worker w5=new Worker("wang5",22,3200);

       addWorker("tang5",22,3200);

        print2(list);
    }


}
