public class FactorsWhile {
    public static void main(String[] args) {
        int number = 12;
        
        if (number > 0) {
            System.out.println("Factors of " + number + ":");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
