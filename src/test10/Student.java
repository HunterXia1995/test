package test10;

import java.util.Objects;

public class Student {
    private String stuNo;
    private String name;
    private int age;
    private char sex;

    public Student(String stuNo, String name, int age, char sex) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(stuNo, student.stuNo) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo, name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
