import java.util.Scanner;

public class Solution3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        // Define array to store multiplication results (1 to 10)
        int[] multiplicationTable = new int[10];
        
        // Store multiplication results in array
        System.out.println("\n--- Multiplication Table of " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
        
        scanner.close();
    }
}
