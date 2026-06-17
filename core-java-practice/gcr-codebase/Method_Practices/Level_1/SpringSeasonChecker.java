import java.util.Scanner;

public class SpringSeasonChecker {
    
    // Method to check if the date falls in Spring Season (March 20 to June 20)
    public static boolean isSpringseason(int month, int day) {
        if (month == 3 && day >= 20) {
            return true;
        } else if (month > 3 && month < 6) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        
        boolean isSpringSeason = isSpringseason(month, day);
        
        if (isSpringSeason) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        } 
    }
}
