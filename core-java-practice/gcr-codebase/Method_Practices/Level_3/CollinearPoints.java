import java.util.Scanner;

public class CollinearPoints {
    
    // Method to find if 3 points are collinear using slope formula
    // Slopes: slope(AB) = slope(BC)
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, 
                                               double x3, double y3) {
        // Calculate slope of AB
        double slopeAB;
        if (x2 - x1 == 0) {
            // Vertical line
            slopeAB = Double.POSITIVE_INFINITY;
        } else {
            slopeAB = (y2 - y1) / (x2 - x1);
        }
        
        // Calculate slope of BC
        double slopeBC;
        if (x3 - x2 == 0) {
            // Vertical line
            slopeBC = Double.POSITIVE_INFINITY;
        } else {
            slopeBC = (y3 - y2) / (x3 - x2);
        }
        
        // Compare slopes
        return Math.abs(slopeAB - slopeBC) < 1e-9;
    }
    
    // Method to find if 3 points are collinear using area of triangle formula
    // Area = 0 means collinear
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, 
                                              double x3, double y3) {
        // Area = |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)| / 2
        double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
        
        return area < 1e-9;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Collinear Points Checker");
        System.out.println("Enter coordinates for 3 points:");
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        
        System.out.println("\nPoints:");
        System.out.println("A(" + x1 + ", " + y1 + ")");
        System.out.println("B(" + x2 + ", " + y2 + ")");
        System.out.println("C(" + x3 + ", " + y3 + ")");
        
        // Check using slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Slope Formula:");
        System.out.println("Points are " + (collinearBySlope ? "COLLINEAR" : "NOT COLLINEAR"));
        
        // Check using area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Area of Triangle Formula:");
        System.out.println("Points are " + (collinearByArea ? "COLLINEAR" : "NOT COLLINEAR"));
         
    }
}
