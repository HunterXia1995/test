package test10;

import java.util.Map;
import java.util.Objects;

public class Course {
    private String couNo;
    private String couName;
    private Map<String,Student> stu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(couNo, course.couNo) &&
                Objects.equals(couName, course.couName) &&
                Objects.equals(stu, course.stu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couNo, couName, stu);
    }

    @Override
    public String toString() {
        return "Course{" +
                "couNo='" + couNo + '\'' +
                ", couName='" + couName + '\'' +
                ", stu=" + stu +
                '}';
    }

    public Course(String couNo, String couName, Map<String, Student> stu) {
        this.couNo = couNo;
        this.couName = couName;
        this.stu = stu;
    }
}
