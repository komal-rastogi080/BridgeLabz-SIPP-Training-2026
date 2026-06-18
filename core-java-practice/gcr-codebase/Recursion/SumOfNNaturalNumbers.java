import java.util.Scanner;

public class SumOfNNaturalNumbers {
    
    // Recursive function to find sum of first N natural numbers
    public static int findSum(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        
        // Recursive call: sum(n) = n + sum(n-1)
        return n + findSum(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative number");
        } else {
            int sum = findSum(n);
            System.out.println("Output: " + sum);
        }
    
    }
}
