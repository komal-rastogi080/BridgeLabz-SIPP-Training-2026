import java.util.Scanner;

public class WarehouseStockRecoverySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numberOfProducts = scanner.nextInt();

        int[] stockQuantities = new int[numberOfProducts];

        int zeroPosition = -1;
        int totalStock = 0;
        int nonZeroCount = 0;

        System.out.println("Enter stock quantities:");

        for (int index = 0; index < numberOfProducts; index++) {
            stockQuantities[index] = scanner.nextInt();

            if (stockQuantities[index] == 0) {
                zeroPosition = index;
            } else {
                totalStock += stockQuantities[index];
                nonZeroCount++;
            }
        }

        int averageStock = totalStock / nonZeroCount;

        stockQuantities[zeroPosition] = averageStock;

        System.out.println("Missing Stock Position: " + zeroPosition);
        System.out.println("Average Stock: " + averageStock);
        System.out.println("Updated Inventory:");

        for (int stock : stockQuantities) {
            System.out.print(stock + " ");
        }
    }
}