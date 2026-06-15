import java.util.Scanner;

/**
 * Sample Program: Find all the occurrences of a character in a string
 * using charAt() method
 */
class StringAnalyzer {
    
    /**
     * Method to find all the index of a character in a string using charAt()
     * method and return them in an array
     * @param text The text to search in
     * @param ch The character to search for
     * @return Array of indexes where the character is found
     */
    public static int[] findAllIndexes(String text, char ch) {
        // The count is used to find the number of occurrences of the character
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        
        // Create an array to store the indexes of the character
        int[] indexes = new int[count];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j] = i;
                j++;
            }
        }
        return indexes;
    }
    
    public static void main(String[] args) {
        try {
            // Take user input for Text and Character to check Occurrences
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a text: ");
            String text = sc.nextLine();
            System.out.print("Enter a character to find the occurrences: ");
            char ch = sc.next().charAt(0);
            
            // Find the occurrences of the character
            int[] indexes = findAllIndexes(text, ch);
            
            // Display the occurrences of the character
            System.out.println("\nIndexes of the character '" + ch + "': ");
            for (int i = 0; i < indexes.length; i++) {
                System.out.print(indexes[i] + " ");
            }
            System.out.println();
            System.out.println("Total occurrences: " + indexes.length);
            
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
