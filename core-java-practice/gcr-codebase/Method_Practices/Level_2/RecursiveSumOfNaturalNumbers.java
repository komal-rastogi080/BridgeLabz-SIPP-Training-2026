import java.util.Scanner;

public class RecursiveSumOfNaturalNumbers {
    
    // Method to find sum of n natural numbers using recursion
    public static long findSumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + findSumRecursive(n - 1);
    }
    
    // Method to find sum of n natural numbers using formula n*(n+1)/2
    public static long findSumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0)");
        } else {
            long sumRecursive = findSumRecursive(n);
            long sumFormula = findSumUsingFormula(n);
            
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);
            
            if (sumRecursive == sumFormula) {
                System.out.println("Both results are equal and correct!");
            } else {
                System.out.println("Results do not match!");
            }
        }
    }
}
