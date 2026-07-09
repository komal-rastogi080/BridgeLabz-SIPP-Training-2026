import java.util.Scanner;

/**
 * Problem 2: Find the Rotation Point in a Rotated Sorted Array
 *
 * Given a rotated sorted array, find the index of the smallest element
 * (the rotation point) using Binary Search.
 *
 * Approach:
 *   1. Initialize left = 0 and right = n - 1.
 *   2. Binary search:
 *        - mid = (left + right) / 2
 *        - If arr[mid] > arr[right], the smallest element is in the right half,
 *          so update left = mid + 1.
 *        - If arr[mid] < arr[right], the smallest element is in the left half
 *          (or is arr[mid] itself), so update right = mid.
 *   3. Continue until left == right; that index holds the rotation point.
 *
 * Input Format:
 *   Line 1: integer N
 *   Line 2: N integers representing the rotated sorted array
 *
 * Output Format:
 *   The smallest element (rotation point value) and its index
 */
public class RotationPointFinder {

    public static int findRotationIndex(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];

        String[] tokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int rotationIndex = findRotationIndex(arr);

        System.out.println("Rotation point value: " + arr[rotationIndex]);
        System.out.println("Rotation point index: " + rotationIndex);

        scanner.close();
    }
}
