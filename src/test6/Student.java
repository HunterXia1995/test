package test6;

public class Student {
    private String name;
    private String stuNo;
    private int age;

    @Override
    public String toString() {

        return "Student [姓名=" + name +"学号"+stuNo+ ", 年龄=" + age + "]";
    }

    public Student(String name, String stuNo, int age) {
        this.name = name;
        this.stuNo = stuNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
