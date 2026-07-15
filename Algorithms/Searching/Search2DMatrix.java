import java.util.Scanner;

/**
 * Problem 4: Search for a Target Value in a 2D Sorted Matrix
 *
 * Each row is sorted ascending, and the first element of each row is
 * greater than the last element of the previous row. Uses Binary Search
 * by treating the matrix as a flattened 1D array.
 *
 * Approach:
 *   1. Treat the matrix as a 1D array (conceptually).
 *   2. Initialize left = 0 and right = rows * columns - 1.
 *   3. Binary search:
 *        - mid = (left + right) / 2
 *        - row = mid / numColumns, col = mid % numColumns
 *        - Compare matrix[row][col] with target:
 *            - match  -> return true
 *            - smaller than target -> left = mid + 1
 *            - larger than target  -> right = mid - 1
 *   4. If not found, return false.
 *
 * Input Format:
 *   Line 1: two integers rows and columns
 *   Next `rows` lines: `columns` integers each (the matrix rows)
 *   Last line: target value to search for
 *
 * Output Format:
 *   "true" if the target exists in the matrix, otherwise "false"
 */
public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dims = scanner.nextLine().trim().split("\\s+");
        int rows = Integer.parseInt(dims[0]);
        int cols = Integer.parseInt(dims[1]);

        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] tokens = scanner.nextLine().trim().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = Integer.parseInt(tokens[c]);
            }
        }

        int target = Integer.parseInt(scanner.nextLine().trim());

        boolean found = searchMatrix(matrix, target);
        System.out.println(found);

        scanner.close();
    }
}
