public class FactorialFor {
    public static void main(String[] args) {
        int number = 4;
        
        if (number > 0) {
            int factorial = 1;
            
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
