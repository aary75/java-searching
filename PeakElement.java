public class PeakElement {

    // Method to find a peak element using binary search
    public static int findPeakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is smaller than the next element, move to the right half
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // Else move to the left half
                right = mid;
            }
        }

        // When left == right, we've found a peak element
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
        int[] arr3 = {5, 10, 20, 15};

        System.out.println("Peak Element (arr1): " + findPeakElement(arr1));   // Output: 20 or 4
        System.out.println("Peak Element (arr2): " + findPeakElement(arr2));   // Output: 20 or 90
        System.out.println("Peak Element (arr3): " + findPeakElement(arr3));   // Output: 20
    }
}

