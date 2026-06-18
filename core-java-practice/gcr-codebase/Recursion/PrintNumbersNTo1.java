import java.util.Scanner;

public class PrintNumbersNTo1 {
    
    // Recursive function to print numbers from N to 1
    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        
        // Print current number
        System.out.print(n + " ");
        
        // Recursive call with n-1
        printNumbers(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        
        System.out.print("Output: ");
        printNumbers(n);
        System.out.println();
        
    }
}
