import java.util.Arrays;

public class SearchChallenge {

    // 🔥 Part 1: Find the First Missing Positive Integer
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: In-Place Marking
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }

        // Step 2: Identify the Missing Positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    // 🔥 Part 2: Binary Search for Target Index
    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);  // Sort the array first

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1;  // Search in the left half
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;

        // Linear Search: First Missing Positive Integer
        int missingPositive = findFirstMissingPositive(nums);
        System.out.println("First Missing Positive Integer: " + missingPositive);

        // Binary Search: Target Index
        int index = binarySearch(nums, target);
        System.out.println("Index of Target (Binary Search): " + index);
    }
}
