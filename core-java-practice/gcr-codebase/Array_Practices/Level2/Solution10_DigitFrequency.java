import java.util.Scanner;

public class Solution10_DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Convert to positive for digit extraction
        number = Math.abs(number);
        
        // Find count of digits
        int digitCount = 0;
        long tempNumber = number;
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
        
        // Store digits in array
        int[] digits = new int[digitCount];
        int index = 0;
        tempNumber = number;
        while (tempNumber != 0) {
            int digit = (int)(tempNumber % 10);
            digits[index] = digit;
            tempNumber /= 10;
            index++;
        }
        
        // Find frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
        
        // Display results
        System.out.println("\n========== DIGIT FREQUENCY RESULTS ==========");
        System.out.println("Original number: " + number);
        System.out.println("Total digits: " + digitCount);
        
        System.out.println("\nDigits in array: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i] + " ");
        }
        
        System.out.println("\n\n--- Frequency of Each Digit ---");
        System.out.println(String.format("%-10s %-10s", "Digit", "Frequency"));
        System.out.println("=".repeat(20));
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(String.format("%-10d %-10d", i, frequency[i]));
            }
        }
        
        scanner.close();
    }
}
