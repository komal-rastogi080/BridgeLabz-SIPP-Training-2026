import java.util.Scanner;

public class BMICalculator {
    
    // Method to find the BMI of every person and populate the array
    // 2D array: rows = persons, columns: [0] = weight, [1] = height, [2] = BMI
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = bmiData[i][1] / 100.0;
            // BMI = weight / (height * height)
            bmiData[i][2] = bmiData[i][0] / (heightInMeters * heightInMeters);
        }
    }
    
    // Method to determine the BMI status
    public static String[] determineBMIStatus(double[][] bmiData) {
        String[] statusArray = new String[bmiData.length];
        
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            
            if (bmi < 18.5) {
                statusArray[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                statusArray[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                statusArray[i] = "Overweight";
            } else {
                statusArray[i] = "Obese";
            }
        }
        
        return statusArray;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D array: 10 rows (10 persons), 3 columns (weight, height, BMI)
        double[][] bmiData = new double[10][3];
        
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        
        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("\nPerson " + (i + 1) + ":");
            System.out.print("\n  Enter weight (in kg): ");
            bmiData[i][0] = scanner.nextDouble();
            
            System.out.print("  Enter height (in cm): ");
            bmiData[i][1] = scanner.nextDouble();
        }
        
        // Calculate BMI
        calculateBMI(bmiData);
        
        // Determine BMI status
        String[] statusArray = determineBMIStatus(bmiData);
        
        // Display results
        System.out.println("\n--- BMI Results ---");
        System.out.println(String.format("%-8s %-10s %-10s %-15s %-15s", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status"));
        System.out.println("====================================================================");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-8d %-10.2f %-10.2f %-15.2f %-15s", 
                            (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], statusArray[i]));
        } 
    }
}
