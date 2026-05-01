package Examples;
import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("output.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Is directory: " + file.isDirectory());

        } else {
            System.out.println("File does not exist.");
        }
    }
}
