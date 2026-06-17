import java.util.Scanner;

public class Solution1_EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfEmployees = 10;
        double[] salary = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonus = new double[numberOfEmployees];
        double[] newSalary = new double[numberOfEmployees];
        
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        // Input salary and years of service
        System.out.println("Enter salary and years of service for 10 employees:");
        int index = 0;
        while (index < numberOfEmployees) {
            System.out.println("\nEmployee " + (index + 1) + ":");
            System.out.print("Enter salary: ");
            double sal = scanner.nextDouble();
            
            if (sal < 0) {
                System.out.println("Invalid salary. Please enter a positive value.");
                continue;
            }
            
            System.out.print("Enter years of service: ");
            double years = scanner.nextDouble();
            
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter a positive value.");
                continue;
            }
            
            salary[index] = sal;
            yearsOfService[index] = years;
            index++;
        }
        
        // Calculate bonus and new salary
        for (int i = 0; i < numberOfEmployees; i++) {
            double bonusPercentage;
            if (yearsOfService[i] > 5) {
                bonusPercentage = 0.05; // 5%
            } else {
                bonusPercentage = 0.02; // 2%
            }
            
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];
            
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        
        // Display results
        System.out.println("\n========== EMPLOYEE BONUS DETAILS ==========");
        System.out.println(String.format("%-12s %-15s %-15s %-15s %-15s", "Employee", "Old Salary", "Years", "Bonus", "New Salary"));
        System.out.println("=".repeat(72));
        
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(String.format("%-12d %-15.2f %-15.1f %-15.2f %-15.2f", 
                (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]));
        }
        
        System.out.println("=".repeat(72));
        System.out.println(String.format("Total Old Salary: %.2f", totalOldSalary));
        System.out.println(String.format("Total Bonus Payout: %.2f", totalBonus));
        System.out.println(String.format("Total New Salary: %.2f", totalNewSalary));
        
        scanner.close();
    }
}
