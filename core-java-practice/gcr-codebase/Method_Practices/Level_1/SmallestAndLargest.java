import java.util.Scanner;

public class SmallestAndLargest {
    
    // Method to find the smallest and largest of the 3 numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        
        int max = number1;
        int min = number1;
        
        if (number2 > max) max = number2;
        if (number3 > max) max = number3;
        
        if (number2 < min) min = number2;
        if (number3 < min) min = number3;
        
        result[0] = min;   // smallest
        result[1] = max;   // largest
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
         
    }
}
