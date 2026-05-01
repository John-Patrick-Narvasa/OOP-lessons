package Examples;
import java.io.*;

public class AppendWrite {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(
            new FileWriter("output.txt", true)
        )){
            writer.newLine();
            writer.write("This line is appended!");
            System.out.println("Content appended!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

