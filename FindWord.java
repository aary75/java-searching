import java.util.*;

public class FindWord{
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[size]; // Declaration of array

        for(int i = 0;i < size; i++){
              arr[i] = scanner.nextLine();
        }

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        boolean isContains = false;

        for(int i = 0; i < size; i++){
            if(arr[i].contains(word)){   // Checking negative number is present or not
                isContains = true;
                System.out.print("Sentence contains the " + word + " is " + arr[i]);
                break; 
            }
        }

       if(!isContains) System.out.print("Not Found");
   }
}


// Output
// Enter the size of array: 7
// Hello
// Hai
// Namaste
// Sastrikal
// vadakam
// Namoskar
// What's Up
// Enter the word: ai
// Sentence contains the ai is Hai

