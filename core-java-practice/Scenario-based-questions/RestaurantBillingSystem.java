import java.util.Scanner;

public class RestaurantBillingSystem {

    public static double calculateFoodCost(double pricePerItem, int quantityOrdered) {
        return pricePerItem * quantityOrdered;
    }

    public static double calculateGST(double foodCost) {
        return foodCost * 0.05;
    }

    public static double calculateDiscount(double foodCost) {
        if (foodCost >= 1000) {
            return foodCost * 0.10;
        }
        return 0;
    }

    public static double generateFinalBill(double foodCost, double gstAmount, double discountAmount) {
        return foodCost + gstAmount - discountAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantityOrdered = scanner.nextInt();

        double foodCost = calculateFoodCost(pricePerItem, quantityOrdered);
        double gstAmount = calculateGST(foodCost);
        double discountAmount = calculateDiscount(foodCost);
        double finalPayableAmount = generateFinalBill(foodCost, gstAmount, discountAmount);

        System.out.println("Food Cost: " + foodCost);
        System.out.println("GST: " + gstAmount);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Payable Amount: " + finalPayableAmount);
    }
}