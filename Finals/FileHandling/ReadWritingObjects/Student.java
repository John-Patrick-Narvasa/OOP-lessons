package ReadWritingObjects;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}


