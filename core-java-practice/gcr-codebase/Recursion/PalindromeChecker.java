import java.util.Scanner;

public class PalindromeChecker {
    
    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: if pointers have crossed, it's a palindrome
        if (left >= right) {
            return true;
        }
        
        // Check if characters at left and right are equal
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        // Recursive call: move pointers towards center
        return isPalindrome(str, left + 1, right - 1);
    }
    
    // Wrapper method for easier usage
    public static boolean checkPalindrome(String str) {
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        return isPalindrome(str, 0, str.length() - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        boolean palindrome = checkPalindrome(str);
        
        if (palindrome) {
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Output: Not Palindrome");
        }
         
    }
}
