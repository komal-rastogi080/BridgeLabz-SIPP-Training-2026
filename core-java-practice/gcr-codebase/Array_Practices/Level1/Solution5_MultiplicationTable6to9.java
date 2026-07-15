import java.util.Scanner;

public class Solution5_MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define array to store multiplication results (indices 6 to 9)
        int[] multiplicationResult = new int[4];
        
        // Find multiplication table from 6 to 9
        System.out.println("\n--- Multiplication Table (6 to 9) ---");
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
        
        scanner.close();
    }
}
