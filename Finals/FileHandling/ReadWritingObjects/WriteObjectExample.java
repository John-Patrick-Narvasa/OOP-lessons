package ReadWritingObjects;
import java.io.*;

public class WriteObjectExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 3.8);

        try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("student.dat")
        )) {
            oos.writeObject(student);
            System.out.println("Student object saved to file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
