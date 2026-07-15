public class EmployeeBonus {
    public static void main(String[] args) {
        double salary = 50000;
        int yearsOfService = 6;
        
        double bonus = 0.0;
        
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Salary: " + salary);
            System.out.println("Years of Service: " + yearsOfService);
            System.out.println("Bonus (5%): " + bonus);
        } else {
            System.out.println("Salary: " + salary);
            System.out.println("Years of Service: " + yearsOfService);
            System.out.println("No bonus as years of service is not more than 5 years.");
        }
    }
}
