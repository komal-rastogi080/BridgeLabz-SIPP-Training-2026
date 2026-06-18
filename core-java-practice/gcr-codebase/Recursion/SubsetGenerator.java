import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetGenerator {
    
    // Recursive function to generate all subsets
    public static void generateSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've processed all elements, add current subset to result
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Exclude current element and recursively generate subsets
        generateSubsets(arr, index + 1, current, result);
        
        // Include current element and recursively generate subsets
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);
        
        // Backtrack: remove the element added
        current.remove(current.size() - 1);
    }
    
    // Wrapper method for easier usage
    public static List<List<Integer>> generateAllSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        List<List<Integer>> subsets = generateAllSubsets(arr);
        
        System.out.println("\nAll Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
        
        System.out.println("\nTotal number of subsets: " + subsets.size());
       
    }
}
