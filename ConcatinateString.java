// Create the concatinateString to concate the two strings using stringBuffer
import java.util.*;

public class ConcatinateString
{
	public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter first string: " );
		String str1 = scanner.nextLine();

                System.out.println("Enter second string: ");
		String str2 = scanner.nextLine();
		
		StringBuffer st = new StringBuffer(""); // creating the stringBuffer class
		st.append(str1);   // appending the both strings
		st.append(str2);
		
                System.out.print("Concatenated String: ");
		System.out.print(st);
	}
}

// Output:
// Enter first string: Hello
// Enter second string: World
// Concatenated String: Hello World

