import java.util.Scanner;

public class NumberCheckerDuckArmstrong {
    
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
    
    // Method to check if a number is a duck number
    // Duck number is a number that has a 0 digit in it
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        
        return sum == number;
    }
    
    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }
    
    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
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
        
        // Check if duck number
        boolean duck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + duck);
        
        // Check if Armstrong number
        boolean armstrong = isArmstrongNumber(number, digits);
        System.out.println("Is Armstrong Number: " + armstrong);
        
        // Find largest and second largest
        int[] largestArray = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestArray[0]);
        if (largestArray[1] != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + largestArray[1]);
        }
        
        // Find smallest and second smallest
        int[] smallestArray = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestArray[0]);
        if (smallestArray[1] != Integer.MAX_VALUE) {
            System.out.println("Second smallest digit: " + smallestArray[1]);
        } 
    }
}
