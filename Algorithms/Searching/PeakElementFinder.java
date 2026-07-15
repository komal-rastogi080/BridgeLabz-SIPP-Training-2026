import java.util.Scanner;

/**
 * Problem 3: Find the Peak Element in an Array
 *
 * A peak element is greater than its neighbors. Uses Binary Search to
 * find a peak element. If there are multiple peaks, returns any one.
 *
 * Approach:
 *   1. Initialize left = 0 and right = n - 1.
 *   2. Binary search:
 *        - mid = (left + right) / 2
 *        - If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak.
 *        - If arr[mid] < arr[mid - 1], search the left half: right = mid - 1.
 *        - If arr[mid] < arr[mid + 1], search the right half: left = mid + 1.
 *   3. Continue until a peak is found.
 *
 * Input Format:
 *   Line 1: integer N
 *   Line 2: N integers
 *
 * Output Format:
 *   Index and value of a peak element
 */
public class PeakElementFinder {

    public static int findPeakIndex(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] >= arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                // there is a larger element to the left, search there
                right = mid - 1;
            } else {
                // there is a larger element to the right, search there
                left = mid + 1;
            }
        }

        return -1; // should not happen for a non-empty array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];

        String[] tokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int peakIndex = findPeakIndex(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        scanner.close();
    }
}
