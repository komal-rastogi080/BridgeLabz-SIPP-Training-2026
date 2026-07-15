
class NullPointerExceptionDemo {
    
    
    public static void generateNullPointerException() {
        System.out.println("Attempting to generate NullPointerException...");
        
        String text = null;
        
        int length = text.length();
    }
    
    
    public static void handleNullPointerException() {
        System.out.println("Demonstrating NullPointerException with exception handling...");
        
        try {
            String text = null;
            
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
        
        
        System.out.println("1. Without Exception Handling (commented to prevent crash):");
        System.out.println("   Uncomment generateNullPointerException() to see the crash\n");
        
        
        
        
        System.out.println("2. With Exception Handling:");
        handleNullPointerException();
        
        System.out.println("Program execution completed successfully!");
    }
}
