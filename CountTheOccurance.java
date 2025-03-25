// Creating the CountTheOccurance to count the of a specific word in java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurance{

    public static void main(String[] args){

        String filePath = "file.java.txt"; // filePath
        String wordToCount = "Java"; // specifie which have to count
        int counter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\W+");

                for(String word: words){
                    if (word.equalsIgnoreCase(wordToCount)) {
                        counter++;    
                    }
                }
            }

            System.out.print("The word " + wordToCount + " appears " + counter + " times in the file.");
        }
        catch(IOException e){
            System.out.print("Error reading the file: " + e.getMessage());
        }
    }
}

// Output:
// The word Java appears 1 times in the file.
