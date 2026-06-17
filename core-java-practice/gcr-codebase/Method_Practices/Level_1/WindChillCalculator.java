import java.util.Scanner;

public class WindChillCalculator {
    
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) 
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        
        System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);
         
    }
}
