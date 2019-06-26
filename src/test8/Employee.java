package test8;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private Date1 birthday;

    public Employee(String name, int age, Date1 birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date1 getBirthday() {
        return birthday;
    }

    public void setBirthday(Date1 birthday) {

        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (this.getName()).charAt(0)-(o.getName()).charAt(0);
    }
}
