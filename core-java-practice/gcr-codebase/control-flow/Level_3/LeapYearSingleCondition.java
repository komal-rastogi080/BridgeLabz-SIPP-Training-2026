public class LeapYearSingleCondition {
    public static void main(String[] args) {
        int year = 2000;
        
        if (year < 1582) {
            System.out.println("Invalid year. Please enter a year from 1582 onwards.");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
