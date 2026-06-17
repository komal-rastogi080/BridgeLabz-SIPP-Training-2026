import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    // Method to find the sum of n natural numbers
    public static long findSumOfNaturalNumbers(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        long sum = findSumOfNaturalNumbers(n);
        
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
       
    }
}
