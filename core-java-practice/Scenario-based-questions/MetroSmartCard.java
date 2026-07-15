import java.util.Scanner;


class MetroSmartCard {
    
    
    public static int calculateFare(int distance) {
        return (distance <= 2) ? 10 : 
               (distance <= 5) ? 20 : 
               (distance <= 10) ? 30 : 40;
    }
    
    
    public static void displayFareStructure() {
        System.out.println("\n===== DELHI METRO FARE STRUCTURE =====");
        System.out.println("Distance 0-2 km   : Rs. 10");
        System.out.println("Distance 2-5 km   : Rs. 20");
        System.out.println("Distance 5-10 km  : Rs. 30");
        System.out.println("Distance 10+ km   : Rs. 40");
        System.out.println("=====================================\n");
    }
    
    
    public static boolean isValidDistance(int distance) {
        return distance > 0;
    }
    
    
    public static void displayBalance(double balance) {
        System.out.println("Current Balance: Rs. " + String.format("%.2f", balance));
    }
    
    
    public static double deductFare(double balance, int distance) {
        int fare = calculateFare(distance);
        
        if (balance < fare) {
            System.out.println("\n❌ INSUFFICIENT BALANCE!");
            System.out.println("Required: Rs. " + fare);
            System.out.println("Available: Rs. " + String.format("%.2f", balance));
            return balance;
        }
        
        balance -= fare;
        System.out.println("\n✓ JOURNEY COMPLETED");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare Deducted: Rs. " + fare);
        displayBalance(balance);
        return balance;
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double balance;
            boolean continueLoop = true;
            
            System.out.println("\n========================================");
            System.out.println("    DELHI METRO SMART CARD SYSTEM");
            System.out.println("========================================");
            
            
            System.out.print("\nEnter initial smart card balance (Rs.): ");
            balance = scanner.nextDouble();
            
            if (balance < 0) {
                System.out.println("❌ Balance cannot be negative!");
                scanner.close();
                return;
            }
            
            displayFareStructure();
            
            
            while (continueLoop && balance > 0) {
                System.out.println("\n--- New Journey ---");
                System.out.print("Enter distance (in km) or 0 to exit: ");
                int distance = scanner.nextInt();
                
                if (distance == 0) {
                    continueLoop = false;
                    System.out.println("\n✓ Thank you for using Delhi Metro!");
                } else if (!isValidDistance(distance)) {
                    System.out.println("❌ Invalid distance! Please enter a positive number.");
                } else {
                    balance = deductFare(balance, distance);
                }
            }
            
            if (balance <= 0 && continueLoop) {
                System.out.println("\n⚠ BALANCE EXHAUSTED!");
                System.out.println("Please recharge your smart card.");
            }
            
            System.out.println("\n========== FINAL BALANCE ==========");
            displayBalance(balance);
            System.out.println("===================================\n");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
