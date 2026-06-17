import java.util.Scanner;


class StringIndexOutOfBoundsExceptionDemo {
    
    
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("Attempting to access character at invalid index...");
        
        
        char ch = text.charAt(text.length());
    }
    
    
    public static void handleStringIndexOutOfBoundsException(String text) {
        System.out.println("Demonstrating StringIndexOutOfBoundsException with exception handling...");
        System.out.println("String: \"" + text + "\" (length: " + text.length() + ")");
        
        try {
            
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
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();
            
            
            System.out.println("1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateStringIndexOutOfBoundsException() to see the crash\n");
            
            
            
            
            System.out.println("2. With Exception Handling:");
            handleStringIndexOutOfBoundsException(text);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
