import java.util.Scanner;

public class WordLengthMatrix {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        
        String[] words = new String[spaces + 1];
        int start = 0, wordIdx = 0;
        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIdx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIdx] = text.substring(start, len);
        return words;
    }

    public static String[][] generateWordLengthData(String[] words) {
        String[][] matrix = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            matrix[i][0] = words[i];
            matrix[i][1] = String.valueOf(findLength(words[i])); // Using String.valueOf()
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] dataMatrix = generateWordLengthData(words);

        System.out.println("\n-----------------------------");
        System.out.printf("%-15s | %-10s\n", "Word", "Length");
        System.out.println("-----------------------------");
        for (String[] row : dataMatrix) {
            int lengthAsInt = Integer.parseInt(row[1]); // Convert back to Int for layout display
            System.out.printf("%-15s | %-10d\n", row[0], lengthAsInt);
        }
        System.out.println("-----------------------------");
        sc.close();
    }
}