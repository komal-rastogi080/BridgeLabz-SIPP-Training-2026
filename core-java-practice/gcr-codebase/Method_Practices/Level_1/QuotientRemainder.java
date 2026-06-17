import java.util.Scanner;

public class QuotientRemainder {
    
    // Method to find the remainder and the quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        
        result[0] = number / divisor;    // quotient
        result[1] = number % divisor;    // remainder
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
         
    }
}
