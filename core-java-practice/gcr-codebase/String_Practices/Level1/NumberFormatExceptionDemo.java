import java.util.Scanner;


class NumberFormatExceptionDemo {
    
    
    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse non-numeric text as integer...");
        
        
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }
    
    
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
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a text (numeric or non-numeric): ");
            String text = scanner.nextLine();
            
            
            System.out.println("\n1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateNumberFormatException() to see the crash\n");
            
            
            
            
            System.out.println("2. With Exception Handling:");
            handleNumberFormatException(text);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
