import java.util.Scanner;

/**
 * Problem 5: Find the First and Last Occurrence of an Element in a Sorted Array
 *
 * Given a sorted array and a target element, uses Binary Search to find
 * the first and last occurrence of the target. If not found, returns -1
 * for both.
 *
 * Approach:
 *   1. First occurrence: regular binary search, but on a match keep
 *      searching the left side (right = mid - 1) to find an earlier index.
 *   2. Last occurrence: regular binary search, but on a match keep
 *      searching the right side (left = mid + 1) to find a later index.
 *
 * Input Format:
 *   Line 1: integer N
 *   Line 2: N integers (sorted array)
 *   Line 3: target value
 *
 * Output Format:
 *   Two integers: first occurrence index and last occurrence index
 *   (both -1 if the target is not found)
 */
public class FirstLastOccurrence {

    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // keep looking left for an earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // keep looking right for a later occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];

        String[] tokens = scanner.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int target = Integer.parseInt(scanner.nextLine().trim());

        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        System.out.println(first + " " + last);

        scanner.close();
    }
}
