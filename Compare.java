import java.io.*;
import java.nio.charset.StandardCharsets;

public class Compare {

    public static void main(String[] args) {

        System.out.println("🔥 Part 1: StringBuilder vs StringBuffer");
        compareStringBuilderAndBuffer();

        System.out.println("\n🔥 Part 2: FileReader vs InputStreamReader");
        
        // Replace this with the path to your large file (100MB)
        String filePath = "largefile.txt";

        long fileReaderTime = countWordsWithFileReader(filePath);
        long inputStreamReaderTime = countWordsWithInputStreamReader(filePath);

        // Print Execution Times
        System.out.println("\n📊 Execution Time Comparison:");
        System.out.println("FileReader Time: " + fileReaderTime + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
    }

    // ✅ Part 1: Comparing StringBuilder vs StringBuffer
    private static void compareStringBuilderAndBuffer() {

        final int iterations = 1_000_000;  // Concatenations
        String sample = "hello";

        // --- StringBuilder ---
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(sample);
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder time: " + (endBuilder - startBuilder) / 1_000_000 + " ms");

        // --- StringBuffer ---
        long startBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(sample);
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer time: " + (endBuffer - startBuffer) / 1_000_000 + " ms");
    }

    // ✅ Part 2: FileReader Implementation
    private static long countWordsWithFileReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("Total words (FileReader): " + wordCount);
        return (endTime - startTime) / 1_000_000;  // Convert to milliseconds
    }

    // ✅ Part 2: InputStreamReader Implementation
    private static long countWordsWithInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        System.out.println("Total words (InputStreamReader): " + wordCount);
        return (endTime - startTime) / 1_000_000;  // Convert to milliseconds
    }
}
