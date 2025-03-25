// Creating the NegativeNumber class to find first negative number in array
import java.util.*;

public class NegativeNumber{
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size]; // Declaration of array

        for(int i = 0;i < size; i++){
              arr[i] = scanner.nextInt();
        }

        boolean isNegative = false;

        for(int i = 0; i < size; i++){
            if(arr[i] < 0){   // Checking negative number is present or not
                isNegative = true;
                System.out.print("First negative number is: " + arr[i]);
                break; 
            }
        }

       if(!isNegative) System.out.print(-1);
   }
}

// Output:
// Enter the size of array: 7
// 5
// 8
// 9
// -7
// 2
// 5
// 1
// First negative number is: -7
