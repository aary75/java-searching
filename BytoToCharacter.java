// Creating the BytoToCharacter to change byte into characters string
import java.io.*;

public class BytoToCharacter {
    public static void main(String[] args) {

        System.out.println("Enter text (type 'exit' to quit): ");

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            // Read multiple lines until the user types "exit"
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                System.out.println("You entered: " + line);
            }

            System.out.println("Program terminated.");

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}

// Output
// Enter text (type 'exit' to quit): 
// Aaran
// You entered: Aaran
// Hitesh
// You entered: Hitesh
// exit
// Program terminated.
