import java.util.Scanner;

public class NumberCheckerSpecial {
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // Method to check if a number is a neon number
    // Sum of digits of the square of the number equals the number itself
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }
    
    // Method to check if a number is a spy number
    // Sum of digits equals the product of digits
    public static boolean isSpyNumber(int number) {
        int temp = Math.abs(number);
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }
        
        return sumOfDigits == productOfDigits;
    }
    
    // Method to check if a number is an automorphic number
    // The square of the number ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int numberStr = Math.abs(number);
        int squareStr = square;
        
        // Compare last digits
        while (numberStr > 0) {
            if (numberStr % 10 != squareStr % 10) {
                return false;
            }
            numberStr /= 10;
            squareStr /= 10;
        }
        
        return true;
    }
    
    // Method to check if a number is a buzz number
    // Either divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) {
        number = Math.abs(number);
        return (number % 7 == 0) || (number % 10 == 7);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number: " + number);
        
        // Check if prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime Number: " + prime);
        
        // Check if neon number
        boolean neon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + neon);
        
        // Check if spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + spy);
        
        // Check if automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is Automorphic Number: " + automorphic);
        
        // Check if buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + buzz);
         
    }
}
