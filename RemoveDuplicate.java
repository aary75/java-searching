// Creating the RemoveDuplicate class to remove duplicates from string
import java.util.*;

class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner class to get user's input
        
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();   
        
        HashSet<Character> hs = new HashSet<Character>(); // creating the hashset
        StringBuilder st = new StringBuilder("");  // Creating the stringBuilder string
        
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);   // getting the character

            char lowerCase = Character.toLowerCase(ch); // lowercasing the character
            
            if(hs.contains(lowerCase)) continue;
            else{
                hs.add(lowerCase);
                st.append(lowerCase);                
            }
        }

        System.out.print(st);  // printing the string
    }
}

// Output:
// Enter the string: Aaryan
// String without duplicates: aryn
