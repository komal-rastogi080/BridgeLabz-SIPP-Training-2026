import java.util.Scanner;

public class NumberAnalyzer {
    
    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    } 
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        
        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Number Analysis ---");
        
        // Loop through the array and check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                // If positive, check if even or odd
                if (isEven(numbers[i])) {
                    System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is Positive and Even");
                } else {
                    System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                // If negative
                System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is Negative");
            } else {
                // If zero
                System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is Zero");
            }
        }
        
        // Compare first and last element
        System.out.println("\n--- Comparison of First and Last Element ---");
        int comparisonResult = compare(numbers[0], numbers[4]);
        
        if (comparisonResult == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ")");
        } else if (comparisonResult == 0) {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[4] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ")");
        }
         
    }
}
