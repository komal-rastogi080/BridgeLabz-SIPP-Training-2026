import java.util.Scanner;

public class RandomNumberAnalyzer {
    
    // Method to generate array of 4-digit random numbers given the size
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a 4-digit random number between 1000 and 9999
            numbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        
        return numbers;
    }
    
    // Method to find average, min and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        
        // Calculate average
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        result[0] = sum / numbers.length; // Average
        
        // Find minimum
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        result[1] = min; // Minimum
        
        // Find maximum
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        result[2] = max; // Maximum
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (number of 4-digit random numbers): ");
        int size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Size must be greater than 0");
        } else {
            // Generate 4-digit random numbers
            int[] randomNumbers = generate4DigitRandomArray(size);
            
            // Display generated numbers
            System.out.println("\nGenerated 4-digit Random Numbers:");
            for (int i = 0; i < randomNumbers.length; i++) {
                System.out.print(randomNumbers[i]);
                if (i < randomNumbers.length - 1) {
                    System.out.print(", ");
                }
                if ((i + 1) % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            
            // Find average, min, and max
            double[] stats = findAverageMinMax(randomNumbers);
            
            System.out.println("\n--- Statistics ---");
            System.out.printf("Average: %.2f%n", stats[0]);
            System.out.printf("Minimum: %.0f%n", stats[1]);
            System.out.printf("Maximum: %.0f%n", stats[2]);
        }
         
    }
}
