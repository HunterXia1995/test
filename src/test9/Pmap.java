package test9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Pmap {
Map<String,Teacher>  m=new TreeMap<>();
public void chushihua(){
    Teacher t=new Teacher("Tom","Corejava");
    Teacher t1=new Teacher("Tom1","Corejava1");
    Teacher t2=new Teacher("Tom2","Corejava2");
    Teacher t3=new Teacher("Tom3","Corejava3");
    Teacher t4=new Teacher("Tom4","Corejava4");
    Teacher t5=new Teacher("Tom5","Corejava4");
    Teacher t6=new Teacher("Tom6","Corejava6");
    m.put(t.getName(),t);m.put(t1.getName(),t1);m.put(t2.getName(),t2);m.put(t3.getName(),t3);m.put(t4.getName(),t4);
    m.put(t5.getName(),t5);m.put(t6.getName(),t6);

    Set<Map.Entry<String,Teacher>> entrySet=m.entrySet();
    for (Map.Entry<String,Teacher> entry:entrySet){
        if("Corejava4".equals(entry.getValue().getCourse())){
        System.out.println(entry.getKey());}
    }
    Set<String> s=m.keySet();
    s.stream().forEach(a->{
        System.out.println(a);
    });


}
public void add(){
    Teacher t=new Teacher("ttn","ttr");
    m.put("ttn",t);
}
public void update(){
    chushihua();
    Teacher t6_1=new Teacher("Tom6","Corejava6_1");
    m.replace("tom6",t6_1);
}

    public static void main(String[] args) {
        Pmap p=new Pmap();
        p.chushihua();
    }
}
