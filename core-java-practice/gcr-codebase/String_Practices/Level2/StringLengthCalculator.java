import java.util.Scanner;

public class StringLengthCalculator {

    // Method to find length using exception handling
    public static int findLength(String text) {
        int count = 0;
        try {
            // Infinite loop to count characters until exception occurs
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught, loop terminates, returning final count
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); // Taking user input using next()

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("\n--- Results ---");
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
        
        sc.close();
    }
}