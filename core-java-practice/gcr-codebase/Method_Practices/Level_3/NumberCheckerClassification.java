import java.util.Scanner;

public class NumberCheckerClassification {
    
    // Method to find the sum of proper divisors of a number
    public static int findSumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    // Method to check if a number is perfect
    // Sum of proper divisors equals the number itself
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = findSumOfProperDivisors(number);
        return sumOfDivisors == number;
    }
    
    // Method to check if a number is abundant
    // Sum of proper divisors is greater than the number itself
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = findSumOfProperDivisors(number);
        return sumOfDivisors > number;
    }
    
    // Method to check if a number is deficient
    // Sum of proper divisors is less than the number itself
    public static boolean isDeficientNumber(int number) {
        int sumOfDivisors = findSumOfProperDivisors(number);
        return sumOfDivisors < number;
    }
    
    // Method to check if a number is strong
    // Sum of factorial of its digits equals the number itself
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        
        return sumOfFactorials == number;
    }
    
    // Helper method to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number: " + number);
        
        // Find sum of proper divisors
        int sumOfDivisors = findSumOfProperDivisors(number);
        System.out.println("Sum of proper divisors: " + sumOfDivisors);
        
        // Check if perfect number
        boolean perfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + perfect);
        
        // Check if abundant number
        boolean abundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + abundant);
        
        // Check if deficient number
        boolean deficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + deficient);
        
        // Check if strong number
        boolean strong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + strong);
        
        
    }
}
