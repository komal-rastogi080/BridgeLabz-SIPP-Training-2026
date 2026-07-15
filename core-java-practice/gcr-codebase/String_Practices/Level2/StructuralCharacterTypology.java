import java.util.Scanner;

public class StructuralCharacterTypology {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Lowercase offset conversion
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] buildAnalysisMatrix(String text) {
        String[][] matrix = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            matrix[i][0] = String.valueOf(text.charAt(i));
            matrix[i][1] = checkCharType(text.charAt(i));
        }
        return matrix;
    }

    public static void displayMatrixTable(String[][] matrix) {
        System.out.println("\n-----------------------------");
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");
        for (String[] row : matrix) {
            // Highlighting spaces for visual clarity in tabular layout
            String visualChar = row[0].equals(" ") ? "[Space]" : row[0];
            System.out.printf("%-10s | %-15s\n", visualChar, row[1]);
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        String[][] matrix = buildAnalysisMatrix(text);
        displayMatrixTable(matrix);
        sc.close();
    }
}