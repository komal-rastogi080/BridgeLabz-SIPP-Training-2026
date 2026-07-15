import java.util.Scanner;

public class FibonacciNumber {
    
    // Recursive function to find nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        // Recursive call: fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Optimized version using memoization (optional, for large values)
    public static int fibonacciMemo(int n, int[] memo) {
        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        // Check if already computed
        if (memo[n] != -1) {
            return memo[n];
        }
        
        // Compute and store in memo
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative number");
        } else if (n > 40) {
            // For large values, use memoization for better performance
            int[] memo = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                memo[i] = -1;
            }
            int result = fibonacciMemo(n, memo);
            System.out.println("Output: " + result);
        } else {
            int result = fibonacci(n);
            System.out.println("Output: " + result);
        }
           
    }
}
