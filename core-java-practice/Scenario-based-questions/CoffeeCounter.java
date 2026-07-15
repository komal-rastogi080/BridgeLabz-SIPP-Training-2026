import java.util.*;

public class CoffeeCounter {
    static double getPrice(String coffeeType) {
        switch (coffeeType.toLowerCase()) {
            case "espresso":     return 80;
            case "cappuccino":   return 120;
            case "latte":        return 130;
            case "cold coffee":  return 150;
            case "filter coffee":return 60;
            case "americano":    return 100;
            default:             return -1;  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.18;
        int customerNumber = 1;

        System.out.println("===== Welcome to Ravi's Café =====");
        System.out.println("Menu: Espresso(Rs 80), Cappuccino(Rs 120), Latte(Rs 130)");
        System.out.println("      Cold Coffee(Rs 150), Filter Coffee(Rs 60), Americano(Rs 100)");
        System.out.println("Type 'exit' anytime to close the counter.\n");

        while (true) {
            System.out.println("--- Customer " + customerNumber + " ---");
            System.out.print("Enter coffee type (or 'exit'): ");
            String coffeeType = sc.nextLine().trim();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("\nSee you again buddy. Goodbye!");
                break;
            }

            double price = getPrice(coffeeType);
            if (price == -1) {
                System.out.println("Coffee not found in menu. Try again.\n");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity;
            try {
                quantity = Integer.parseInt(sc.nextLine().trim());
                if (quantity <= 0) {
                    System.out.println("Quantity must be positive. Try again.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity. Please enter a number.\n");
                continue;
            }

            double subtotal = price * quantity;
            double gst      = subtotal * GST_RATE;
            double total    = subtotal + gst;

            System.out.println("\n---------- Bill ----------");
            System.out.printf("Coffee  : %s%n", coffeeType);
            System.out.printf("Price   : Rs.%.2f %n", price);
            System.out.printf("Subtotal: Rs.%.2f%n", subtotal);
            System.out.printf("GST(18%%): Rs.%.2f%n", gst);
            System.out.printf("TOTAL   : Rs.%.2f%n", total);
            System.out.println("--------------------------\n");

            customerNumber++;
        }
    }
}
