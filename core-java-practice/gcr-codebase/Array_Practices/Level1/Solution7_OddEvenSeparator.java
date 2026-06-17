import java.util.Scanner;

public class Solution7_OddEvenSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (positive integer greater than 0)");
            scanner.close();
            return;
        }
        
        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        
        // Index variables
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Iterate from 1 to number and separate odd and even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Display even numbers
        System.out.println("\n--- Even Numbers from 1 to " + number + " ---");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Display odd numbers
        System.out.println("\n--- Odd Numbers from 1 to " + number + " ---");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
