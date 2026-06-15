import java.util.Scanner;

/**
 * Program 7: Demonstrate NumberFormatException
 */
class NumberFormatExceptionDemo {
    
    /**
     * Method to generate NumberFormatException
     * Using Integer.parseInt() with non-numeric string will throw exception
     */
    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse non-numeric text as integer...");
        
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }
    
    /**
     * Method to demonstrate NumberFormatException with proper handling
     */
    public static void handleNumberFormatException(String text) {
        System.out.println("Demonstrating NumberFormatException with exception handling...");
        System.out.println("Input text: \"" + text + "\"");
        
        try {
            System.out.println("Attempting to parse text as integer...");
            int number = Integer.parseInt(text);
            System.out.println("Successfully parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getSimpleName());
            System.out.println("Reason: The text \"" + text + "\" cannot be converted to an integer");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete. Program continues normally.\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== NumberFormatException Demonstration ===\n");
        
        try {
            // Take user input
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a text (numeric or non-numeric): ");
            String text = scanner.nextLine();
            
            // Show what happens without exception handling (commented)
            System.out.println("\n1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateNumberFormatException() to see the crash\n");
            // Uncomment to see the exception
            // generateNumberFormatException(text);
            
            // Show proper exception handling
            System.out.println("2. With Exception Handling:");
            handleNumberFormatException(text);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
