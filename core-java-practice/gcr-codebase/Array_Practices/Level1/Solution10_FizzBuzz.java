import java.util.Scanner;

public class Solution10_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if positive
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer");
            scanner.close();
            return;
        }
        
        // Create String array to store results
        String[] results = new String[number + 1];
        
        // Fill array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 15 == 0) {  // Multiple of both 3 and 5
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {    // Multiple of 3
                results[i] = "Fizz";
            } else if (i % 5 == 0) {    // Multiple of 5
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Display results
        System.out.println("\n--- FizzBuzz Results (0 to " + number + ") ---");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        
        scanner.close();
    }
}
