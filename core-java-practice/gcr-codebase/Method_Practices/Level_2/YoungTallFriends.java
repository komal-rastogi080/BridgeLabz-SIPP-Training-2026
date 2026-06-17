import java.util.Scanner;

public class YoungTallFriends {
    
    // Method to find the youngest of the 3 friends
    public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        
        return youngestIndex;
    }
    
    // Method to find the tallest of the 3 friends
    public static int findTallest(double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        
        return tallestIndex;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter age and height (in cm) for 3 friends:");
        
        // Take input for age and height of 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        // Find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        
        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + " years)");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        
        
    }
}
