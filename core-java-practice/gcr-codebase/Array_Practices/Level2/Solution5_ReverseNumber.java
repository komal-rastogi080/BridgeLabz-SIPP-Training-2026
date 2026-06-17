import java.util.Scanner;

public class Solution5_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Convert to positive for digit extraction
        long tempNumber = Math.abs(number);
        
        // Find count of digits
        int digitCount = 0;
        long countTemp = tempNumber;
        while (countTemp != 0) {
            digitCount++;
            countTemp /= 10;
        }
        
        // Store digits in array
        int[] digits = new int[digitCount];
        int index = 0;
        while (tempNumber != 0) {
            int digit = (int)(tempNumber % 10);
            digits[index] = digit;
            tempNumber /= 10;
            index++;
        }
        
        // Create array for reversed digits
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        
        // Display results
        System.out.println("\n========== RESULTS ==========");
        System.out.println("Original number: " + number);
        System.out.println("Number of digits: " + digitCount);
        
        System.out.print("Original digits: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i] + " ");
        }
        
        System.out.print("\nReversed digits: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        
        // Construct reversed number
        long reversedNumber = 0;
        for (int i = 0; i < digitCount; i++) {
            reversedNumber = reversedNumber * 10 + reversedDigits[i];
        }
        
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }
        
        System.out.println("\n\nReversed number: " + reversedNumber);
        
        scanner.close();
    }
}
