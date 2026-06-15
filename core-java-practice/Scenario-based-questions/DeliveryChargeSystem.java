import java.util.Scanner;

public class DeliveryChargeSystem {

    public static double calculateCharge(int distance) {
        return distance * 5;
    }

    public static double calculateCharge(int distance, int weight) {
        return (distance * 5) + (weight * 10);
    }

    public static double calculateCharge(int distance, int weight, boolean expressDelivery) {
        double totalCharge = (distance * 5) + (weight * 10);

        if (expressDelivery) {
            totalCharge += 100;
        }

        return totalCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance: ");
        int deliveryDistance = scanner.nextInt();

        System.out.print("Enter package weight: ");
        int packageWeight = scanner.nextInt();

        System.out.print("Express delivery (true/false): ");
        boolean expressDelivery = scanner.nextBoolean();

        System.out.println("Charge using distance only: " + calculateCharge(deliveryDistance));
        System.out.println("Charge using distance and weight: " + calculateCharge(deliveryDistance, packageWeight));
        System.out.println("Charge using all parameters: " + calculateCharge(deliveryDistance, packageWeight, expressDelivery));
    }
}