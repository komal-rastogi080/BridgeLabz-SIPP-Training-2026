import java.util.Scanner;

public class FactorialCalculator {
    
    // Recursive function to calculate factorial of a number
    public static int calculateFactorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursive call: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            int factorial = calculateFactorial(n);
            System.out.println("Output: " + factorial);
        } 
    }
}
