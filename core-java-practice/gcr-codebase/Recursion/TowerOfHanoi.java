import java.util.Scanner;

public class TowerOfHanoi {
    
    // Recursive function to solve Tower of Hanoi
    // Moves n disks from source to destination using auxiliary
    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: if only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary using destination as temporary
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);
        
        // Move the largest disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move n-1 disks from auxiliary to destination using source as temporary
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of disks (N): ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative number");
        } else if (n == 0) {
            System.out.println("No disks to move");
        } else {
            System.out.println("\nSteps to solve Tower of Hanoi with " + n + " disks:");
            System.out.println("(Moving from A to C using B as auxiliary)\n");
            
            solveTowerOfHanoi(n, 'A', 'C', 'B');
            
            // Calculate total number of moves
            long totalMoves = (long) Math.pow(2, n) - 1;
            System.out.println("\nTotal moves required: " + totalMoves);
        } 
    }
}
