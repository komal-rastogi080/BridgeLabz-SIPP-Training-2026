import java.util.Scanner;

public class Solution4_StoreValuesWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");
        
        // Infinite while loop to take input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double number = scanner.nextDouble();
            
            // Check if 0 or negative
            if (number <= 0) {
                System.out.println("Stopping input...");
                break;
            }
            
            // Check if array is full
            if (index >= 10) {
                System.out.println("Array is full. Stopping input...");
                break;
            }
            
            // Store the number and increment index
            numbers[index] = number;
            index++;
        }
        
        // Calculate sum
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }
        
        // Display total
        System.out.println("\n--- Result ---");
        System.out.println("Total numbers entered: " + index);
        System.out.println("Sum of all numbers: " + total);
        
        scanner.close();
    }
}
