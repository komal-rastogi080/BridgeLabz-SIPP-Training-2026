public class AbundantNumber {
    public static void main(String[] args) {
        int number = 12;
        int sum = 0;
        
        // Find all divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println("Number: " + number);
        System.out.println("Sum of divisors: " + sum);
        
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
