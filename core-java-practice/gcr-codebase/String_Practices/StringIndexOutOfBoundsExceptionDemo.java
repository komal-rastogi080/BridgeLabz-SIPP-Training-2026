import java.util.Scanner;

/**
 * Program 5: Demonstrate StringIndexOutOfBoundsException
 */
class StringIndexOutOfBoundsExceptionDemo {
    
    /**
     * Method to generate StringIndexOutOfBoundsException
     * This method will throw exception when accessing invalid index
     */
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("Attempting to access character at invalid index...");
        
        // Try to access index beyond string length
        char ch = text.charAt(text.length());
    }
    
    /**
     * Method to demonstrate StringIndexOutOfBoundsException with proper handling
     */
    public static void handleStringIndexOutOfBoundsException(String text) {
        System.out.println("Demonstrating StringIndexOutOfBoundsException with exception handling...");
        System.out.println("String: \"" + text + "\" (length: " + text.length() + ")");
        
        try {
            // Attempt to access index beyond string length
            System.out.println("Trying to access character at index " + text.length());
            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete. Program continues normally.\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== StringIndexOutOfBoundsException Demonstration ===\n");
        
        try {
            // Take user input
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();
            
            // Show what happens without exception handling (commented)
            System.out.println("1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateStringIndexOutOfBoundsException() to see the crash\n");
            // Uncomment to see the exception
            // generateStringIndexOutOfBoundsException(text);
            
            // Show proper exception handling
            System.out.println("2. With Exception Handling:");
            handleStringIndexOutOfBoundsException(text);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
