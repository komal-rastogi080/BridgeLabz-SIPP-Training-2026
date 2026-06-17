import java.util.Scanner;

public class Solution2_NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Take input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Check each number
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Number " + (i + 1) + " (" + numbers[i] + "): Negative");
            } else if (numbers[i] == 0) {
                System.out.println("Number " + (i + 1) + ": Zero");
            } else {
                // Positive number - check even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + "): Positive and Even");
                } else {
                    System.out.println("Number " + (i + 1) + " (" + numbers[i] + "): Positive and Odd");
                }
            }
        }
        
        // Compare first and last elements
        System.out.println("\n--- Comparison of First and Last Element ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }
        
        scanner.close();
    }
}
