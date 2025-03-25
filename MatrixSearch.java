public class MatrixSearch {

    // Method to search for the target value in the 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D coordinates
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;  // Target found
            } else if (matrix[row][col] < target) {
                left = mid + 1;   // Search right half
            } else {
                right = mid - 1;  // Search left half
            }
        }

        return false;  // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println("Target 3: " + searchMatrix(matrix, 3));    // Output: true
        System.out.println("Target 13: " + searchMatrix(matrix, 13));  // Output: false
        System.out.println("Target 60: " + searchMatrix(matrix, 60));  // Output: true
    }
}
