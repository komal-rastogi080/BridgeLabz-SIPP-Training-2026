public class FactorialWhile {
    public static void main(String[] args) {
        int number = 4;
        
        if (number > 0) {
            int factorial = 1;
            int counter = 1;
            
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }
            
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
