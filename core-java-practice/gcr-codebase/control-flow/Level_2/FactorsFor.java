public class FactorsFor {
    public static void main(String[] args) {
        int number = 12;
        
        if (number > 0) {
            System.out.println("Factors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
