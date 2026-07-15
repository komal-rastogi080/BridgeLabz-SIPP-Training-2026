public class OTPGenerator {
    
    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a 6-digit random number (100000 to 999999)
        return 100000 + (int) (Math.random() * 900000);
    }
    
    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Found duplicate
                }
            }
        }
        return true; // All unique
    }
    
    public static void main(String[] args) {
        // Create an array to save 10 OTP numbers
        int[] otps = new int[10];
        
        System.out.println("Generating 10 OTP Numbers:");
        System.out.println("---------------------------");
        
        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        
        // Check if all OTPs are unique
        System.out.println("\n---------------------------");
        boolean unique = areOTPsUnique(otps);
        
        if (unique) {
            System.out.println("✓ All OTP numbers are unique!");
        } else {
            System.out.println("✗ Some OTP numbers are duplicated!");
        }
    }
}
