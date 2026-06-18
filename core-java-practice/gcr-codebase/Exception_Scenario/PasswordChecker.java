public class PasswordChecker {

    public static void checkPassword(String password) {
        try {

            if (password == null) {
                throw new NullPointerException();
            }

            if (password.isEmpty()) {
                System.out.println("Error: Password cannot be empty.");
                return;
            }

            if (password.length() < 8) {
                System.out.println("Error: Password must be at least 8 characters.");
                return;
            }

            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("Error: First character must be uppercase.");
                return;
            }

            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                System.out.println("Error: Last character must be a digit.");
                return;
            }

            if (!password.matches(".*[@#$%&*].*")) {
                System.out.println("Error: Password must contain a special character.");
                return;
            }

            System.out.println("Password is Strong.");

        } catch (NullPointerException e) {
            System.out.println("Error: Password cannot be null.");
        } catch (Exception e) {
            System.out.println("Invalid password.");
        }
    }

    public static void main(String[] args) {

        checkPassword("");            // Empty
        checkPassword("Abc12");       // Short
        checkPassword("abcdef@1");    // First not uppercase
        checkPassword("Password1");   // No special char
        checkPassword("Password@");   // Last not digit
        checkPassword("Password@1");  // Valid
        checkPassword(null);          // Null
    }
}