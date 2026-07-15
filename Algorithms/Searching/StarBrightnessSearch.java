/**
 * Star Brightness Catalog - Binary Search Toolkit
 * -------------------------------------------------
 * An astronomer has 10,000,000 sorted star-brightness entries.
 *
 * This class implements:
 *   1. Standard Binary Search              -> O(log n)
 *   2. Search in a Rotated Sorted Catalog  -> O(log n) (handles the "telescope glitch")
 *   3. First and Last Occurrence of a repeated brightness value -> O(log n)
 *   4. Find the Minimum Element (rotation point) in a rotated catalog -> O(log n)
 */
public class StarBrightnessSearch {

    // ----------------------------------------------------------------------
    // 1. STANDARD BINARY SEARCH - O(log n)
    // ----------------------------------------------------------------------

    /**
     * Classic binary search on a sorted (non-rotated) array.
     * Returns the index of target, or -1 if not found.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // ----------------------------------------------------------------------
    // 2. SEARCH IN A ROTATED SORTED CATALOG (telescope glitch scrambled it)
    // ----------------------------------------------------------------------

    /**
     * Searches for target in a rotated sorted array in O(log n).
     * At each step, one half of the array is guaranteed to be properly
     * sorted; we check which half is sorted, and whether target lies
     * within that half's range, to decide which side to search next.
     */
    public static int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half [left..mid] is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half [mid..right] is sorted
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    // ----------------------------------------------------------------------
    // 3. FIRST AND LAST OCCURRENCE of a repeated brightness value
    // ----------------------------------------------------------------------

    /**
     * Finds the first index where target occurs, using binary search that
     * keeps narrowing toward the left even after finding a match.
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // keep searching left side for an earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    /**
     * Finds the last index where target occurs, using binary search that
     * keeps narrowing toward the right even after finding a match.
     */
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // keep searching right side for a later occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    /**
     * Convenience wrapper returning {first, last}. Returns {-1, -1} if
     * the target does not exist in the array.
     */
    public static int[] findFirstAndLast(int[] arr, int target) {
        return new int[]{findFirstOccurrence(arr, target), findLastOccurrence(arr, target)};
    }

    // ----------------------------------------------------------------------
    // 4. FIND THE MINIMUM ELEMENT (rotation point) in a rotated catalog
    // ----------------------------------------------------------------------

    /**
     * Finds the index of the minimum element in a rotated sorted array
     * (the point where the telescope glitch "rotated" the catalog) in
     * O(log n) time, without duplicates.
     */
    public static int findMinIndex(int[] arr) {
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

    public static int findMin(int[] arr) {
        return arr[findMinIndex(arr)];
    }

    // ----------------------------------------------------------------------
    // DEMONSTRATION
    // ----------------------------------------------------------------------

    public static void main(String[] args) {
        int[] sortedCatalog = {12, 18, 23, 29, 29, 29, 35, 41, 47};
        int[] rotatedCatalog = {35, 41, 47, 12, 18, 23, 29};

        System.out.println("=== 1. Standard Binary Search ===");
        System.out.println("Index of 35 in sorted catalog: " + binarySearch(sortedCatalog, 35));

        System.out.println("\n=== 2. Search in Rotated Catalog ===");
        System.out.println("Index of 18 in rotated catalog: " + searchRotated(rotatedCatalog, 18));
        System.out.println("Index of 99 (not present): " + searchRotated(rotatedCatalog, 99));

        System.out.println("\n=== 3. First and Last Occurrence of repeated value 29 ===");
        int[] range = findFirstAndLast(sortedCatalog, 29);
        System.out.println("First index: " + range[0] + ", Last index: " + range[1]);

        System.out.println("\n=== 4. Find Minimum Element in Rotated Catalog ===");
        System.out.println("Minimum value: " + findMin(rotatedCatalog)
                + " at index: " + findMinIndex(rotatedCatalog));
    }
}
