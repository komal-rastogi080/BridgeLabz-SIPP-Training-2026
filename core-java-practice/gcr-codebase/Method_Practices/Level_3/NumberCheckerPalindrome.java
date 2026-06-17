import java.util.Scanner;

public class NumberCheckerPalindrome {
    
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
    
    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }
    
    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
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
        
        // Display reversed array
        int[] reversed = reverseDigitsArray(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Check if palindrome
        boolean palindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + palindrome);
        
        // Check if duck number
        boolean duck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + duck);
        
    }
}
