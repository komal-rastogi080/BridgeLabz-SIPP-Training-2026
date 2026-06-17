import java.util.Scanner;

public class TrigonometricFunctions {
    
    // Method to calculate various trigonometric functions given angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        double[] result = new double[3];
        
        result[0] = Math.sin(radians);    // sine
        result[1] = Math.cos(radians);    // cosine
        result[2] = Math.tan(radians);    // tangent
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        double[] result = calculateTrigonometricFunctions(angle);
        
        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", result[0]);
        System.out.printf("Cosine: %.4f%n", result[1]);
        System.out.printf("Tangent: %.4f%n", result[2]);
         
    }
}
