import java.io.*;

public class WriteFileExample {
  public static void main(String args[]) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
        writer.write("Hello, File Handling!");
        writer.newLine();
        writer.write("This is line 2.");
        writer.newLine();
        writer.write("File writing complete!");
        
        System.out.println("File writing complete");
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }
  }
}