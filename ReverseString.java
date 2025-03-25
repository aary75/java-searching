// Creating the ReverseString class to reverse the string using stringBuilder
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");

        // Creating the stringBuilder class
        StringBuilder st = new StringBuilder(scanner.nextLine());

        System.out.print("\nReversed String: ");
        System.out.print(st.reverse());
    }
}


// Output:
// Enter the string: Aaryan
// Reversed String: nayraA
