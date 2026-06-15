import java.util.Scanner;


class SecretMessageValidator {
    
    
    public static int countVowels(String message) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : message.toCharArray()) {
            if (vowels.contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }
    
    
    public static int countConsonants(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch) && !("aeiouAEIOU".contains(String.valueOf(ch)))) {
                count++;
            }
        }
        return count;
    }
    
    
    public static int countDigits(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
    
    
    public static int countSpecialCharacters(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                count++;
            }
        }
        return count;
    }
    
    
    public static String getSpecialCharacters(String message) {
        StringBuilder special = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                if (!special.toString().contains(String.valueOf(ch))) {
                    special.append(ch);
                }
            }
        }
        return special.toString();
    }
    
    
    public static int countUppercase(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
    
    
    public static int countLowercase(String message) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        return count;
    }
    
    
    public static String validateCodeStrength(String message) {
        int digits = countDigits(message);
        int specialChars = countSpecialCharacters(message);
        int length = message.length();
        
        
        boolean hasEnoughDigits = digits >= 2;
        boolean hasSpecialChar = specialChars >= 1;
        boolean hasMinLength = length >= 8;
        
        
        if (hasEnoughDigits && hasSpecialChar && hasMinLength) {
            return "Strong";
        } else {
            return "Weak";
        }
    }
    
    
    public static boolean[] getStrengthCriteria(String message) {
        boolean[] criteria = new boolean[3];
        criteria[0] = countDigits(message) >= 2;      
        criteria[1] = countSpecialCharacters(message) >= 1;  
        criteria[2] = message.length() >= 8;           
        return criteria;
    }
    
    
    public static void displayDetailedReport(String message) {
        int vowels = countVowels(message);
        int consonants = countConsonants(message);
        int digits = countDigits(message);
        int specialChars = countSpecialCharacters(message);
        String strength = validateCodeStrength(message);
        boolean[] criteria = getStrengthCriteria(message);
        
        System.out.println("\n╔═════════════════════════════════════════════════════════╗");
        System.out.println("║     SECRET MESSAGE VALIDATION REPORT                    ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Secret Code              : %-40s ║\n", message);
        System.out.printf("║ Length                   : %-40d ║\n", message.length());
        
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        System.out.println("║ CHARACTER ANALYSIS                                      ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Vowels (a,e,i,o,u)      : %-40d ║\n", vowels);
        System.out.printf("║ Consonants               : %-40d ║\n", consonants);
        System.out.printf("║ Uppercase Letters        : %-40d ║\n", countUppercase(message));
        System.out.printf("║ Lowercase Letters        : %-40d ║\n", countLowercase(message));
        System.out.printf("║ Digits (0-9)             : %-40d ║\n", digits);
        System.out.printf("║ Special Characters       : %-40d ║\n", specialChars);
        
        if (specialChars > 0) {
            System.out.printf("║ Special Chars Found      : %-40s ║\n", getSpecialCharacters(message));
        }
        
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        System.out.println("║ STRENGTH CRITERIA ANALYSIS                              ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        
        System.out.print("║ ✓ At least 2 digits      : ");
        System.out.printf("%-40s ║\n", (criteria[0] ? "PASS ✓" : "FAIL ❌"));
        
        System.out.print("║ ✓ At least 1 special char: ");
        System.out.printf("%-40s ║\n", (criteria[1] ? "PASS ✓" : "FAIL ❌"));
        
        System.out.print("║ ✓ Minimum length 8       : ");
        System.out.printf("%-40s ║\n", (criteria[2] ? "PASS ✓" : "FAIL ❌"));
        
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        
        if (strength.equals("Strong")) {
            System.out.println("║                                                         ║");
            System.out.println("║ CODE STRENGTH: STRONG ✓✓✓                              ║");
            System.out.println("║ Status: This code meets all security requirements!      ║");
        } else {
            System.out.println("║                                                         ║");
            System.out.println("║ CODE STRENGTH: WEAK ❌                                  ║");
            System.out.println("║ Status: This code does NOT meet security requirements!  ║");
            System.out.println("║                                                         ║");
            System.out.println("║ Required for STRONG code:                               ║");
            if (!criteria[0]) System.out.println("║ • Add at least 2 digits                                  ║");
            if (!criteria[1]) System.out.println("║ • Add at least 1 special character (!@#$%^&*-_=+)       ║");
            if (!criteria[2]) System.out.println("║ • Extend length to at least 8 characters                 ║");
        }
        
        System.out.println("╚═════════════════════════════════════════════════════════╝\n");
    }
    
    
    public static void displaySecurityGuidelines() {
        System.out.println("\n╔═════════════════════════════════════════════════════════╗");
        System.out.println("║   SECURITY CODE GUIDELINES                              ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");
        System.out.println("║ For a STRONG security code, ensure:                     ║");
        System.out.println("║                                                         ║");
        System.out.println("║ 1. Minimum length: 8 characters                         ║");
        System.out.println("║ 2. At least 2 digits (0-9)                             ║");
        System.out.println("║ 3. At least 1 special character (!@#$%^&*-_=+)          ║");
        System.out.println("║                                                         ║");
        System.out.println("║ Additional Recommendations:                             ║");
        System.out.println("║ • Mix uppercase and lowercase letters                   ║");
        System.out.println("║ • Use multiple special characters                       ║");
        System.out.println("║ • Avoid common words or patterns                        ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝\n");
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n╔═════════════════════════════════════════════════════════╗");
            System.out.println("║        SECRET MESSAGE VALIDATOR                         ║");
            System.out.println("║      (Security Application)                             ║");
            System.out.println("╚═════════════════════════════════════════════════════════╝");
            
            displaySecurityGuidelines();
            
            boolean continueValidating = true;
            
            while (continueValidating) {
                System.out.print("Enter secret code to validate (or 'exit' to quit): ");
                String message = scanner.nextLine();
                
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("\n✓ Thank you for using Secret Message Validator!");
                    continueValidating = false;
                } else if (message.isEmpty()) {
                    System.out.println("\n❌ Secret code cannot be empty!");
                } else {
                    
                    displayDetailedReport(message);
                    
                    
                    System.out.println("═════════════════════════════════════════════════════════\n");
                }
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
