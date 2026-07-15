import java.util.Scanner;

public class StringMinMaxFinder {

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
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaces++;
        
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

    public static String[][] generateLengthMatrix(String[] words) {
        String[][] matrix = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            matrix[i][0] = words[i];
            matrix[i][1] = String.valueOf(findLength(words[i]));
        }
        return matrix;
    }

    // Returns a 1D array containing [shortestWordIndex, longestWordIndex]
    public static int[] findShortestAndLongest(String[][] matrix) {
        if (matrix.length == 0) return new int[]{-1, -1};

        int shortestIdx = 0;
        int longestIdx = 0;
        int minLen = Integer.parseInt(matrix[0][1]);
        int maxLen = Integer.parseInt(matrix[0][1]);

        for (int i = 1; i < matrix.length; i++) {
            int currentLen = Integer.parseInt(matrix[i][1]);
            if (currentLen < minLen) {
                minLen = currentLen;
                shortestIdx = i;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide sequence text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] matrix = generateLengthMatrix(words);
        int[] results = findShortestAndLongest(matrix);

        if (results[0] != -1) {
            System.out.println("Shortest Component: " + matrix[results[0]][0] + " (Length: " + matrix[results[0]][1] + ")");
            System.out.println("Longest Component: " + matrix[results[1]][0] + " (Length: " + matrix[results[1]][1] + ")");
        }
        sc.close();
    }
}