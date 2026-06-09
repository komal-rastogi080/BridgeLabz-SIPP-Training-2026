import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit price (in INR): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        double quantity = scanner.nextDouble();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity and unit price is INR " + unitPrice);
    }
}
