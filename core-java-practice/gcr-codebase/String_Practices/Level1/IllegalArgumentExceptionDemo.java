import java.util.Scanner;


class IllegalArgumentExceptionDemo {
    
    
    public static void generateIllegalArgumentException(String text) {
        System.out.println("Attempting to create substring with invalid indices...");
        
        
        String substring = text.substring(5, 2);
    }
    
    
    public static void handleIllegalArgumentException(String text, int startIndex, int endIndex) {
        System.out.println("Demonstrating IllegalArgumentException with exception handling...");
        System.out.println("String: \"" + text + "\"");
        System.out.println("Start index: " + startIndex + ", End index: " + endIndex);
        
        try {
            if (startIndex > endIndex) {
                System.out.println("Attempting invalid substring operation...");
            }
            String substring = text.substring(startIndex, endIndex);
            System.out.println("Substring result: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete. Program continues normally.\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== IllegalArgumentException Demonstration ===\n");
        
        try {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();
            
            System.out.print("Enter start index: ");
            int startIndex = scanner.nextInt();
            
            System.out.print("Enter end index: ");
            int endIndex = scanner.nextInt();
            
            
            System.out.println("\n1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateIllegalArgumentException() to see the crash\n");
            
            
            
            
            System.out.println("2. With Exception Handling:");
            handleIllegalArgumentException(text, startIndex, endIndex);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
