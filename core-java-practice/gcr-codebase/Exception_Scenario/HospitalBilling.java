class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    public static void processPayment(double bill, double amount)
            throws InsufficientFundsException {

        if (amount < bill) {
            throw new InsufficientFundsException(
                "Payment Failed: Insufficient funds."
            );
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 5000;
            int items = 0;
            int avg = totalBill / items;

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        }

        try {
            String[] patients = {"Aman", "Riya"};
            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "ABC";
            int amount = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid numeric value.");
        }

        try {
            processPayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("System continues running...");
    }
}