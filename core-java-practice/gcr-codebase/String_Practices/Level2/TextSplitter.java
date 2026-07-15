import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter {

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
        int length = findLength(text);
        if (length == 0) return new String[0];

        // Count spaces to determine word boundaries
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Store indices of spaces
        int[] spaceIndices = new int[spaceCount];
        int indexIdx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[indexIdx++] = i;
            }
        }

        int totalWords = spaceCount + 1;
        String[] words = new String[totalWords];
        
        int start = 0;
        int wordIdx = 0;

        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndices[i];
            words[wordIdx++] = extractSubstring(text, start, end);
            start = end + 1;
        }
        words[wordIdx] = extractSubstring(text, start, length);

        return words;
    }

    private static String extractSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to split: ");
        String input = sc.nextLine();

        String[] customSplit = splitWords(input);
        String[] nativeSplit = input.split(" ");

        boolean match = compareArrays(customSplit, nativeSplit);

        System.out.println("\nCustom Split: " + Arrays.toString(customSplit));
        System.out.println("Built-in Split: " + Arrays.toString(nativeSplit));
        System.out.println("Do both array structures match? " + match);
        
        sc.close();
    }
}