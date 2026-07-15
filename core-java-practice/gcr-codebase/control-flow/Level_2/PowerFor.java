public class PowerFor {
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        
        if (number > 0 && power > 0) {
            int result = 1;
            
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            
            System.out.println(number + " raised to the power " + power + " = " + result);
        } else {
            System.out.println("Please enter positive integers.");
        }
    }
}
