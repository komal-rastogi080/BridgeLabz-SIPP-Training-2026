public class DayOfWeek {
    public static void main(String[] args) {
        int month = 4;  // April
        int day = 15;   // 15th
        int year = 2024; // 2024
        
        // Using Zeller's congruence formula for Gregorian calendar
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        System.out.println("Date: " + month + "/" + day + "/" + year);
        System.out.println("Day: " + daysOfWeek[d0]);
        System.out.println("Day code: " + d0);
    }
}
