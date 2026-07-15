import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationGenerator {
    
    // Recursive function to generate all permutations of a string
    public static void generatePermutations(String str, int left, int right, List<String> result) {
        // Base case: if left equals right, we have a complete permutation
        if (left == right) {
            result.add(str);
            return;
        }
        
        // Recursively generate permutations
        for (int i = left; i <= right; i++) {
            // Swap characters at left and i
            str = swapCharacters(str, left, i);
            
            // Recursively generate permutations for the remaining string
            generatePermutations(str, left + 1, right, result);
            
            // Backtrack: swap back to original position
            str = swapCharacters(str, left, i);
        }
    }
    
    // Helper function to swap characters in a string
    private static String swapCharacters(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
    
    // Wrapper method for easier usage
    public static List<String> generateAllPermutations(String str) {
        List<String> result = new ArrayList<>();
        generatePermutations(str, 0, str.length() - 1, result);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        if (str.isEmpty()) {
            System.out.println("Please enter a non-empty string");
        } else {
            List<String> permutations = generateAllPermutations(str);
            
            System.out.println("\nAll Permutations:");
            for (String perm : permutations) {
                System.out.println(perm);
            }
            
            System.out.println("\nTotal number of permutations: " + permutations.size());
        }
         
    }
}
