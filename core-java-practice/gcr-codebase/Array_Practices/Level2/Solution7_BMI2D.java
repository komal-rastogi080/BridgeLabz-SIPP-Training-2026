import java.util.Scanner;

public class Solution7_BMI2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create multi-dimensional array: [person][0=height, 1=weight, 2=bmi]
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height
        System.out.println("\nEnter height (in meters) and weight (in kg):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            System.out.print("Enter height (meters): ");
            double h = scanner.nextDouble();
            if (h <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                i--;
                continue;
            }
            personData[i][0] = h;
            
            System.out.print("Enter weight (kg): ");
            double w = scanner.nextDouble();
            if (w <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                i--;
                continue;
            }
            personData[i][1] = w;
        }
        
        // Calculate BMI and weight status
        for (int i = 0; i < numberOfPersons; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\n========== BMI RESULTS (2D ARRAY) ==========");
        System.out.println(String.format("%-10s %-15s %-15s %-15s %-20s", "Person", "Height(m)", "Weight(kg)", "BMI", "Status"));
        System.out.println("=".repeat(75));
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(String.format("%-10d %-15.2f %-15.2f %-15.2f %-20s", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]));
        }
        
        scanner.close();
    }
}
