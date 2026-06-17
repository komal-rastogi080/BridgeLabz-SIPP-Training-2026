import java.util.Scanner;

public class EuclideanDistance {
    
    // Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        double diffX = x2 - x1;
        double diffY = y2 - y1;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
    
    // Method to find the equation of a line given two points
    // Returns array with [slope, y-intercept]
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        
        // Calculate slope
        double slope;
        if (x2 - x1 == 0) {
            // Vertical line
            slope = Double.POSITIVE_INFINITY;
        } else {
            slope = (y2 - y1) / (x2 - x1);
        }
        
        // Calculate y-intercept
        // y = mx + b => b = y - mx
        double yIntercept;
        if (Double.isInfinite(slope)) {
            yIntercept = Double.NaN;
        } else {
            yIntercept = y1 - slope * x1;
        }
        
        equation[0] = slope;
        equation[1] = yIntercept;
        
        return equation;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Euclidean Distance and Line Equation Calculator");
        System.out.println("=============================================");
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        System.out.println("\nPoints:");
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
        
        // Calculate Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("\nEuclidean Distance: %.4f%n", distance);
        
        // Calculate line equation
        double[] equation = findLineEquation(x1, y1, x2, y2);
        
        System.out.println("\nLine Equation:");
        if (Double.isInfinite(equation[0])) {
            System.out.println("Vertical line: x = " + x1);
        } else {
            System.out.printf("y = %.4fx + %.4f%n", equation[0], equation[1]);
            System.out.printf("Slope (m): %.4f%n", equation[0]);
            System.out.printf("Y-intercept (b): %.4f%n", equation[1]);
        } 
    }
}
