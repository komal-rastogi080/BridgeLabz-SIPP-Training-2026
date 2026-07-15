import java.util.Scanner;

public class Solution9_2DTo1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        // Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Get input for 2D array
        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Create 1D array of size rows*columns
        int[] array1D = new int[rows * columns];
        
        // Copy elements from 2D array to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1D[index] = matrix[i][j];
                index++;
            }
        }
        
        // Display 2D array
        System.out.println("\n--- Original 2D Array (Matrix) ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Display 1D array
        System.out.println("\n--- Converted 1D Array ---");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
