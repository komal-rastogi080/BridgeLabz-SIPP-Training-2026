public class SumUntilZero {
    public static void main(String[] args) {
        double total = 0.0;
        double userInput = 5;
        
        while (userInput != 0) {
            total = total + userInput;
            userInput = userInput - 1;
        }
        
        System.out.println("The sum is: " + total);
    }
}
