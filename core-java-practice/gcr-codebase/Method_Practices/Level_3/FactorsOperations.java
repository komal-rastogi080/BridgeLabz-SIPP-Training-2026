import java.util.Scanner;

public class FactorsOperations {
    
    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Create array with the count
        int[] factors = new int[count];
        
        // Second loop to store factors in array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }
    
    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    // Method to find the sum of the factors
    public static long findSumOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    // Method to find the product of the cube of the factors
    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] factors = findFactors(number);
        
        System.out.println("\n--- Factor Analysis ---");
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        int greatest = findGreatestFactor(factors);
        long sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        long productOfCubes = findProductOfCubeOfFactors(factors);
        
        System.out.println("Greatest factor: " + greatest);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Product of cube of factors: " + productOfCubes);
         
    }
}
