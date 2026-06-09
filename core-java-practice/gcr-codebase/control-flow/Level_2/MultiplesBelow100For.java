public class MultiplesBelow100For {
    public static void main(String[] args) {
        int number = 6;
        
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}
