package test8;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    Set<Employee> set=new TreeSet<Employee>();/*(( o1, o2) -> {
     return   (int)(o1.getBirthday().Date2()-o2.getBirthday().Date2());
    });*/
    public Set<Employee> chushihua() {
        Date1 d = new Date1(1995,7,7);
        Employee e = new Employee("li2", 18, d);
        Date1 d1 = new Date1(1995,8,7);
        Employee e1 = new Employee("w2", 19, d1);
        Date1 d2 = new Date1(1995,9,7);
        Employee e2 = new Employee("ki2", 17, d2);
        Date1 d3 = new Date1(1995,11,7);
        Employee e3 = new Employee("ti2", 15, d3);
        Date1 d4 = new Date1(1995,6,7);
        Employee e4 = new Employee("zi2", 16, d4);
        set.add(e); set.add(e1); set.add(e2); set.add(e3); set.add(e4);
        return set;
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.chushihua().stream().forEach(c->{
            System.out.println(c);
        });
    }
}
