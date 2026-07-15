import java.util.Scanner;

public class CalendarDisplay {
    
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        
        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        }
        return "Invalid Month";
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        }
        return 0;
    }
    
    // Method to get the first day of the month using Gregorian calendar algorithm
    // Returns day of week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        // Zeller's Congruence Algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int q = 1; // First day of month
        int m = month;
        int k = year % 100;
        int j = year / 100;
        
        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
        
        // Convert to Sunday = 0, Monday = 1, ..., Saturday = 6
        return (h + 6) % 7;
    }
    
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        System.out.println("-------------------------------");
        
        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDays(month, year);
        
        // First for loop: add spaces for proper indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }
        
        // Second for loop: display the days
        int day = 1;
        int currentDay = firstDay;
        
        while (day <= numberOfDays) {
            System.out.printf("%3d  ", day);
            
            currentDay++;
            if (currentDay == 7) {
                System.out.println();
                currentDay = 0;
            }
            
            day++;
        }
        
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a month between 1 and 12.");
        } else {
            displayCalendar(month, year);
        }
    }
}
