public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        double total = 0.0;
        
        while (true) {
            double userInput = 5;
            
            if (userInput <= 0) {
                break;
            }
            
            total = total + userInput;
            userInput = userInput - 1;
        }
        
        System.out.println("The sum is: " + total);
    }
}
