import java.util.Scanner;

public class CharacterMetricCounter {

    // Helper checking classifications using exact ASCII steps
    public static String checkCharType(char ch) {
        // Step i: Convert uppercase to lowercase using ASCII offset values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String evaluation = checkCharType(text.charAt(i));
            if (evaluation.equals("Vowel")) {
                vowels++;
            } else if (evaluation.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter targeted string sequence: ");
        String text = sc.nextLine();

        int[] metrics = countVowelsAndConsonants(text);

        System.out.println("\n--- Aggregation Metrics ---");
        System.out.println("Total Vowels Count: " + metrics[0]);
        System.out.println("Total Consonants Count: " + metrics[1]);
        sc.close();
    }
}