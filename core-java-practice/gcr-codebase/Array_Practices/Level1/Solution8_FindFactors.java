import java.util.Scanner;

public class Solution8_FindFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If array is full, expand it
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    // Copy elements from factors to temp
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }
        
        // Display factors
        System.out.println("\n--- Factors of " + number + " ---");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Total factors: " + index);
        
        scanner.close();
    }
}
