import java.util.Scanner;

public class Solution6_MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create array for 11 players
        double[] heights = new double[11];
        
        // Get input for heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        // Calculate sum
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        
        // Calculate mean
        double mean = sum / heights.length;
        
        // Display result
        System.out.println("\n--- Football Team Height Analysis ---");
        System.out.println("Total players: " + heights.length);
        System.out.println("Sum of all heights: " + sum);
        System.out.println("Mean height of the football team: " + mean);
        
        scanner.close();
    }
}
