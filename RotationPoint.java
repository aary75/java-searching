import java.util.*;

public class RotationPoint{
     public static int binarySearch(int[] arr, int start, int end){
           
          while(start != end){
           
               int mid = start + ((end - start)/2);

                if(arr[mid] > arr[end]) start = mid + 1;
                else end = mid;

           }

         return arr[start];

     }
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size]; // Declaration of array

       // Enter the elements in according to rotated sorted array
        for(int i = 0;i < size; i++){
              arr[i] = scanner.nextInt();
        }

        int rotationPoint = binarySearch(arr,0, size - 1);
        System.out.print("The rotation point is: " + rotationPoint);
   }
}


// Output:
// Enter the size of array: 8
// 12
// 20
// 85
// 100
// 5
// 6
// 8
// 10
// The rotation point is: 5
