import java.util.Scanner;

public class NumberCheckerHarshad {
    
    // Method to find the count of digits in the number
    public static int findCountOfDigits(int number) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = findCountOfDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }
    
    // Method to find the sum of the digits of a number
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    // Method to find the sum of the squares of the digits
    public static int findSumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }
    
    // Method to check if a number is a Harshad number
    // A Harshad number is divisible by the sum of its digits
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = findSumOfDigits(digits);
        if (sumOfDigits == 0) {
            return false;
        }
        return number % sumOfDigits == 0;
    }
    
    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9) with frequency
        
        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // frequency
        }
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);
        int countOfDigits = findCountOfDigits(number);
        
        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countOfDigits);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Find sum of digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        // Find sum of squares of digits
        int sumOfSquares = findSumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        
        // Check if Harshad number
        boolean harshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + harshad);
        
        // Find digit frequency
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("\n--- Digit Frequency ---");
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "      | " + frequency[i][1]);
            }
        }
         
    }
}
