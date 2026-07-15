import java.util.Scanner;


class ArrayIndexOutOfBoundsExceptionDemo {
    
    
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println("Attempting to access index beyond array length...");
        
        
        String name = names[names.length];
        System.out.println("Name: " + name);
    }
    
    
    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException with exception handling...");
        System.out.println("Array size: " + names.length);
        System.out.println("Requested index: " + index);
        System.out.print("Array contents: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        try {
            if (index >= names.length || index < 0) {
                System.out.println("Attempting to access invalid index...");
            }
            String name = names[index];
            System.out.println("Successfully accessed element: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Exception type: " + e.getClass().getSimpleName());
            System.out.println("Reason: Index " + index + " is out of bounds for array of size " + names.length);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling complete. Program continues normally.\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== ArrayIndexOutOfBoundsException Demonstration ===\n");
        
        try {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter number of names: ");
            int n = scanner.nextInt();
            scanner.nextLine(); 
            
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }
            
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            
            
            System.out.println("\n1. Without Exception Handling (commented to prevent crash):");
            System.out.println("   Uncomment generateArrayIndexOutOfBoundsException() to see the crash\n");
            
            
            
            
            System.out.println("2. With Exception Handling:");
            handleArrayIndexOutOfBoundsException(names, index);
            
            System.out.println("Program execution completed successfully!");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
