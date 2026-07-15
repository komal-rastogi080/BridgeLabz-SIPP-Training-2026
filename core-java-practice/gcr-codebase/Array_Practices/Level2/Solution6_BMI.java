import java.util.Scanner;

public class Solution6_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create arrays
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height
        System.out.println("\nEnter weight (in kg) and height (in meters):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            System.out.print("Enter weight (kg): ");
            double w = scanner.nextDouble();
            if (w < 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                i--;
                continue;
            }
            weight[i] = w;
            
            System.out.print("Enter height (meters): ");
            double h = scanner.nextDouble();
            if (h < 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                i--;
                continue;
            }
            height[i] = h;
        }
        
        // Calculate BMI and weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\n========== BMI RESULTS ==========");
        System.out.println(String.format("%-10s %-15s %-15s %-15s %-20s", "Person", "Height(m)", "Weight(kg)", "BMI", "Status"));
        System.out.println("=".repeat(75));
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(String.format("%-10d %-15.2f %-15.2f %-15.2f %-20s", 
                (i + 1), height[i], weight[i], bmi[i], weightStatus[i]));
        }
        
        scanner.close();
    }
}
