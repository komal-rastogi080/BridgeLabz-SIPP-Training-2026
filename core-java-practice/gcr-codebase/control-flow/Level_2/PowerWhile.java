public class PowerWhile {
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        
        if (number > 0 && power > 0) {
            int result = 1;
            int counter = 0;
            
            while (counter < power) {
                result = result * number;
                counter++;
            }
            
            System.out.println(number + " raised to the power " + power + " = " + result);
        } else {
            System.out.println("Please enter positive integers.");
        }
    }
}
