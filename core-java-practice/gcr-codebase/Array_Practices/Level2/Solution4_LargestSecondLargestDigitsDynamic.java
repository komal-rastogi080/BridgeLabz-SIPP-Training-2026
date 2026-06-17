import java.util.Scanner;

public class Solution4_LargestSecondLargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Convert to positive if negative
        number = Math.abs(number);
        
        // Define array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Store digits in array with dynamic expansion
        long tempNumber = number;
        while (tempNumber != 0) {
            int digit = (int)(tempNumber % 10);
            
            // If array is full, expand it
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                // Copy existing elements
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            
            digits[index] = digit;
            tempNumber /= 10;
            index++;
        }
        
        int count = index;
        
        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;
        
        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display results
        System.out.println("\n========== RESULTS ==========");
        System.out.println("Original number: " + number);
        System.out.println("Number of digits: " + count);
        System.out.println("Digits stored: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\n\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        scanner.close();
    }
}
