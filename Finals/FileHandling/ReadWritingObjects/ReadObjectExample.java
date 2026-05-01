package ReadWritingObjects;
import java.io.*;

public class ReadObjectExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("student.dat")
        )) {
            Student student = (Student) ois.readObject();
            System.out.println("Student loaded: " + student);
        } catch(FileNotFoundException e) {
            System.out.println("File not found: ");
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Student class not fount!");
        }
    }
}
