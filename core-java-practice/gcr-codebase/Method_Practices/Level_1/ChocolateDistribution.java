import java.util.Scanner;

public class ChocolateDistribution {
    
    // Method to find the number of chocolates each child gets and remaining chocolates
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        
        result[0] = numberOfChocolates / numberOfChildren;   // chocolates per child
        result[1] = numberOfChocolates % numberOfChildren;   // remaining chocolates
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero");
        } else {
            int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
            
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        } 
    }
}
