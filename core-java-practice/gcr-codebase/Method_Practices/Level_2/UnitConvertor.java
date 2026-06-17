import java.util.Scanner;

public class UnitConvertor {
    
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    
    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    
    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    
    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unit Convertor Utility");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Fahrenheit to Celsius");
        System.out.println("11. Celsius to Fahrenheit");
        System.out.println("12. Pounds to Kilograms");
        System.out.println("13. Kilograms to Pounds");
        System.out.println("14. Gallons to Liters");
        System.out.println("15. Liters to Gallons");
        
        System.out.print("\nEnter your choice (1-15): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        
        double result = 0;
        String unit1 = "", unit2 = "";
        
        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                unit1 = "km";
                unit2 = "miles";
                break;
            case 2:
                result = convertMilesToKm(value);
                unit1 = "miles";
                unit2 = "km";
                break;
            case 3:
                result = convertMetersToFeet(value);
                unit1 = "meters";
                unit2 = "feet";
                break;
            case 4:
                result = convertFeetToMeters(value);
                unit1 = "feet";
                unit2 = "meters";
                break;
            case 5:
                result = convertYardsToFeet(value);
                unit1 = "yards";
                unit2 = "feet";
                break;
            case 6:
                result = convertFeetToYards(value);
                unit1 = "feet";
                unit2 = "yards";
                break;
            case 7:
                result = convertMetersToInches(value);
                unit1 = "meters";
                unit2 = "inches";
                break;
            case 8:
                result = convertInchesToMeters(value);
                unit1 = "inches";
                unit2 = "meters";
                break;
            case 9:
                result = convertInchesToCentimeters(value);
                unit1 = "inches";
                unit2 = "centimeters";
                break;
            case 10:
                result = convertFahrenheitToCelsius(value);
                unit1 = "Fahrenheit";
                unit2 = "Celsius";
                break;
            case 11:
                result = convertCelsiusToFahrenheit(value);
                unit1 = "Celsius";
                unit2 = "Fahrenheit";
                break;
            case 12:
                result = convertPoundsToKilograms(value);
                unit1 = "pounds";
                unit2 = "kilograms";
                break;
            case 13:
                result = convertKilogramsToPounds(value);
                unit1 = "kilograms";
                unit2 = "pounds";
                break;
            case 14:
                result = convertGallonsToLiters(value);
                unit1 = "gallons";
                unit2 = "liters";
                break;
            case 15:
                result = convertLitersToGallons(value);
                unit1 = "liters";
                unit2 = "gallons";
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }
        
        System.out.printf("%.2f %s = %.2f %s%n", value, unit1, result, unit2);
         
    }
}
