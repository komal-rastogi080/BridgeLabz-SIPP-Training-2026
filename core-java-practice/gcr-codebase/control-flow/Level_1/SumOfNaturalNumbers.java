public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int number = 5;
        
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The number " + number + " is a positive integer.");
            System.out.println("The sum of natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
