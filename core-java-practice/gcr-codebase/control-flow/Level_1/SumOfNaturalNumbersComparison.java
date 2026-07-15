public class SumOfNaturalNumbersComparison {
    public static void main(String[] args) {
        int number = 5;
        
        if (number > 0) {
            // Using formula: n * (n+1) / 2
            int sumFormula = number * (number + 1) / 2;
            
            // Using while loop
            int sumWhile = 0;
            int counter = 1;
            while (counter <= number) {
                sumWhile = sumWhile + counter;
                counter++;
            }
            
            System.out.println("Number: " + number);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            
            if (sumFormula == sumWhile) {
                System.out.println("Both results are correct and equal!");
            } else {
                System.out.println("Results do not match!");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
