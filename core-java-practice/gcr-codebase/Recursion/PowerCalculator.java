import java.util.Scanner;

public class PowerCalculator {
    
    // Recursive function to compute x^n
    public static int computePower(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        
        // Base case: x^1 = x
        if (n == 1) {
            return x;
        }
        
        // Recursive call: x^n = x * x^(n-1)
        return x * computePower(x, n - 1);
    }
    
    // Optimized version using divide and conquer: O(log n)
    public static int computePowerOptimized(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        
        // Compute x^(n/2)
        int half = computePowerOptimized(x, n / 2);
        
        // If n is even: x^n = x^(n/2) * x^(n/2)
        if (n % 2 == 0) {
            return half * half;
        } else {
            // If n is odd: x^n = x * x^(n/2) * x^(n/2)
            return x * half * half;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base (x): ");
        int x = scanner.nextInt();
        
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative exponent");
        } else {
            int result = computePower(x, n);
            System.out.println("Output: " + result);
            
            // Also show optimized result for verification
            int resultOptimized = computePowerOptimized(x, n);
            System.out.println("Output (Optimized): " + resultOptimized);
        }
         
    }
}
