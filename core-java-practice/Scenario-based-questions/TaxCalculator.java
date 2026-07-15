
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket;

        if (income < 10000) {
            tax = income * 0.05;
            bracket = "5% Tax Bracket";
        } else if (income <= 50000) {
            tax = income * 0.15;
            bracket = "15% Tax Bracket";
        } else {
            tax = income * 0.30;
            bracket = "30% Tax Bracket";
        }

        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        
        double[] incomes = {
            5000, 12000, 25000, 60000, 8000,
            45000, 70000, 15000, 30000, 9000
        };

        double totalTax = 0;

        for (double inc : incomes) {
            if (inc < 10000) {
                totalTax += inc * 0.05;
            } else if (inc <= 50000) {
                totalTax += inc * 0.15;
            } else {
                totalTax += inc * 0.30;
            }
        }

        System.out.println("\nTotal Tax Collected from 10 Citizens: " + totalTax);

    }
}