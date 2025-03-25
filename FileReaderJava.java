import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava {

    public static void main(String[] args) {
        String filePath = "file.java.txt";  // Path to the file

        // Try-with-resources to ensure file closure
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            
            // Read and print each line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

// Output:
// Hello, World!
// Welcome to Java programming.
// FileReader is useful for reading text files.
