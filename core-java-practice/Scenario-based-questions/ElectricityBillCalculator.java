import java.util.Scanner;

public class ElectricityBillCalculator {

    public static int acceptUnitsConsumed(Scanner scanner) {
        return scanner.nextInt();
    }

    public static double calculateBillAmount(int unitsConsumed) {
        return unitsConsumed * 7.5;
    }

    public static void displayBillDetails(int unitsConsumed, double billAmount) {
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: " + billAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int unitsConsumed = acceptUnitsConsumed(scanner);

        double billAmount = calculateBillAmount(unitsConsumed);

        displayBillDetails(unitsConsumed, billAmount);
    }
}