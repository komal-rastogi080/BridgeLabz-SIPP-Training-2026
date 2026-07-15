import java.util.Scanner;

public class NumberChecker {
    
    // Method to check if number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        
        if (result == 1) {
            System.out.println(number + " is a Positive number");
        } else if (result == -1) {
            System.out.println(number + " is a Negative number");
        } else {
            System.out.println(number + " is Zero");
        } 
    }
}
