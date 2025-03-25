public class FirstAndLastOccurrence {

    // Method to find the first occurrence of the target
    public static int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1;   // Move left to find earlier occurrences
            } else if (nums[mid] < target) {
                left = mid + 1;    // Move right
            } else {
                right = mid - 1;   // Move left
            }
        }

        return firstOccurrence;
    }

    // Method to find the last occurrence of the target
    public static int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1;   // Move right to find later occurrences
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    // Main method to test the program
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 7, 9, 9, 11};
        int target = 4;

        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);

        if (first != -1 && last != -1) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
        } else {
            System.out.println("Element not found.");
        }
    }
}
