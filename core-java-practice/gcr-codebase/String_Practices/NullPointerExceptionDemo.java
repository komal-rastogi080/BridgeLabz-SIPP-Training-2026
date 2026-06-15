/**
 * Program 4: Demonstrate NullPointerException
 */
class NullPointerExceptionDemo {
    
    /**
     * Method to generate NullPointerException
     * This method will throw NullPointerException when executed
     */
    public static void generateNullPointerException() {
        System.out.println("Attempting to generate NullPointerException...");
        
        String text = null;
        // This line will generate NullPointerException
        int length = text.length();
    }
    
    /**
     * Method to demonstrate NullPointerException with proper exception handling
     */
    public static void handleNullPointerException() {
        System.out.println("Demonstrating NullPointerException with exception handling...");
        
        try {
            String text = null;
            // Attempt to call method on null reference
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete. Program continues normally.\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Demonstration ===\n");
        
        // First, show what happens without exception handling
        System.out.println("1. Without Exception Handling (commented to prevent crash):");
        System.out.println("   Uncomment generateNullPointerException() to see the crash\n");
        // Uncomment the next line to see the exception
        // generateNullPointerException();
        
        // Then show proper exception handling
        System.out.println("2. With Exception Handling:");
        handleNullPointerException();
        
        System.out.println("Program execution completed successfully!");
    }
}
