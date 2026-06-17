public class FootballTeamHeights {
    
    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    
    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        // Create an int array of size 11 for 11 players
        int[] heights = new int[11];
        
        // Generate 3-digit random heights in the range 150 to 250 cms
        System.out.println("Football Team Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        // Calculate and display results
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMeanHeight(heights);
        
        System.out.println("\n--- Results ---");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
    }
}
