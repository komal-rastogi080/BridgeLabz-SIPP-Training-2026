public class GreatestFactorWhile {
    public static void main(String[] args) {
        int number = 24;
        int greatestFactor = 1;
        int counter = number - 1;
        
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        
        System.out.println("Greatest factor of " + number + " (beside itself): " + greatestFactor);
    }
}
