package Finals.Exceptions.Examples;

import java.io.*;


// The throws keyword is used in method signatures to declare that a method might throw certain exceptions. 
// The caller must handle these exceptions.

public class FIleReaderExample {
    public static String readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        BufferedReader reader = new BufferedReader(file);
        String content = reader.readLine();
        reader.close();

        return content;
    }

    public static void main(String[] args) {
        try {
            String data = readFile("data.text"); // it doesnt exist

            System.out.println(data);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
