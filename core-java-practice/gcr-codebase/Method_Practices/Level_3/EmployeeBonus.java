public class EmployeeBonus {
    
    // Method to generate salary and years of service for 10 employees
    // Returns 2D array with [salary, yearsOfService]
    public static double[][] generateSalaryAndYearsOfService() {
        double[][] data = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            // Generate 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + Math.random() * 90000;
            // Generate years of service (0 to 20)
            data[i][1] = (int) (Math.random() * 21);
        }
        
        return data;
    }
    
    // Method to calculate new salary and bonus
    // 5% bonus for years >= 5, 2% for years < 5
    public static double[][] calculateNewSalaryAndBonus(double[][] salaryAndYears) {
        double[][] result = new double[10][3]; // [oldSalary, yearsOfService, bonus]
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = salaryAndYears[i][0];
            double yearsOfService = salaryAndYears[i][1];
            double bonusPercentage;
            
            if (yearsOfService >= 5) {
                bonusPercentage = 0.05; // 5% bonus
            } else {
                bonusPercentage = 0.02; // 2% bonus
            }
            
            double bonusAmount = oldSalary * bonusPercentage;
            
            result[i][0] = oldSalary;
            result[i][1] = yearsOfService;
            result[i][2] = bonusAmount;
        }
        
        return result;
    }
    
    // Method to calculate and display results in tabular format
    public static void displayResults(double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        System.out.println("\n========================================================");
        System.out.println("EMPLOYEE BONUS REPORT - ZARA");
        System.out.println("========================================================");
        System.out.println(String.format("%-12s %-12s %-15s %-12s %-12s", 
                           "Employee", "Old Salary", "Yrs of Service", "Bonus", "New Salary"));
        System.out.println("========================================================");
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = bonusData[i][0];
            double yearsOfService = bonusData[i][1];
            double bonus = bonusData[i][2];
            double newSalary = oldSalary + bonus;
            
            System.out.println(String.format("%-12d %-12.2f %-15.0f %-12.2f %-12.2f", 
                               (i + 1), oldSalary, yearsOfService, bonus, newSalary));
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        
        System.out.println("========================================================");
        System.out.println(String.format("%-12s %-12.2f %-15s %-12.2f %-12.2f", 
                           "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary));
        System.out.println("========================================================");
    }
    
    public static void main(String[] args) {
        // Generate salary and years of service
        double[][] salaryAndYears = generateSalaryAndYearsOfService();
        
        // Calculate new salary and bonus
        double[][] bonusData = calculateNewSalaryAndBonus(salaryAndYears);
        
        // Display results
        displayResults(bonusData);
    }
}
