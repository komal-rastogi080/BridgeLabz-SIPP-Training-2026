import java.util.Scanner;

public class LeapYearChecker {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // The LeapYear program only works for year >= 1582 (Gregorian calendar)
        if (year < 1582) {
            return false;
        }
        
        // Leap year is divisible by 4 and not divisible by 100 or divisible by 400
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
         
    }
}
