import java.util.Scanner;

public class ReverseString {
    
    // Recursive function to reverse a string
    public static String reverseString(String str) {
        // Base case: if string is empty or has one character
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        
        // Recursive call: last character + reverse of rest
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String reversed = reverseString(str);
        System.out.println("Output: " + reversed);
         
    }
}
