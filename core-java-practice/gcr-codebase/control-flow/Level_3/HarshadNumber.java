public class HarshadNumber {
    public static void main(String[] args) {
        int number = 21;
        int tempNumber = number;
        int sum = 0;
        
        // Calculate sum of digits
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum = sum + digit;
            tempNumber = tempNumber / 10;
        }
        
        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println(number + " is not a Harshad Number.");
            System.out.println("Sum of digits: " + sum);
        }
    }
}
