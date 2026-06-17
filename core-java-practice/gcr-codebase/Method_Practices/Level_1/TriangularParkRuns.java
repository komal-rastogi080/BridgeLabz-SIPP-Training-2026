import java.util.Scanner;

public class TriangularParkRuns {
    
    // Method to calculate number of rounds needed to complete 5km run
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000; // 5 km in meters
        return distanceInMeters / perimeter;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first side of triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of triangle (in meters): ");
        double side3 = scanner.nextDouble();
        
        double rounds = calculateRounds(side1, side2, side3);
        
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km"); 
    }
}
