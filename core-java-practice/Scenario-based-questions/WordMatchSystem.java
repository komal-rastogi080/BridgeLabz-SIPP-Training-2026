import java.util.Scanner;
import java.util.Arrays;


class WordMatchSystem {
    
    
    public static boolean areAnagrams(String word1, String word2) {
        
        String cleaned1 = word1.replaceAll(" ", "").toLowerCase();
        String cleaned2 = word2.replaceAll(" ", "").toLowerCase();
        
        
        if (cleaned1.length() != cleaned2.length()) {
            return false;
        }
        
        
        char[] arr1 = cleaned1.toCharArray();
        char[] arr2 = cleaned2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
    
    
    public static String convertToUppercase(String word) {
        return word.toUpperCase();
    }
    
    
    public static int getWordLength(String word) {
        return word.length();
    }
    
    
    public static int getLengthWithoutSpaces(String word) {
        return word.replaceAll(" ", "").length();
    }
    
    
    public static String getSortedCharacters(String word) {
        String cleaned = word.replaceAll(" ", "").toLowerCase();
        char[] chars = cleaned.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    
    public static int countUniqueCharacters(String word) {
        String cleaned = word.replaceAll(" ", "").toLowerCase();
        boolean[] charSet = new boolean[26];
        int count = 0;
        
        for (char ch : cleaned.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                if (!charSet[index]) {
                    charSet[index] = true;
                    count++;
                }
            }
        }
        return count;
    }
    
    
    public static String getCharacterFrequency(String word) {
        String cleaned = word.replaceAll(" ", "").toLowerCase();
        int[] freq = new int[26];
        
        for (char ch : cleaned.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                result.append((char)('a' + i)).append(":").append(freq[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
    
    
    public static boolean sameLengthCheck(String word1, String word2) {
        return word1.length() == word2.length();
    }
    
    
    public static String getAnagramMessage(String word1, String word2) {
        if (areAnagrams(word1, word2)) {
            return "✓ These words ARE ANAGRAMS! They match as skill keywords.";
        } else {
            return "❌ These words are NOT ANAGRAMS. They represent different skills.";
        }
    }
    
    
    public static void displayMatchingReport(String word1, String word2) {
        boolean isAnagram = areAnagrams(word1, word2);
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║        RECRUITMENT PORTAL - SKILL MATCHING REPORT         ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Skill Keyword 1 (Original)  : %-40s ║\n", word1);
        System.out.printf("║ Skill Keyword 2 (Original)  : %-40s ║\n", word2);
        
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║ UPPERCASE CONVERSION                                      ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Keyword 1 (UPPERCASE)       : %-40s ║\n", convertToUppercase(word1));
        System.out.printf("║ Keyword 2 (UPPERCASE)       : %-40s ║\n", convertToUppercase(word2));
        
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║ LENGTH ANALYSIS                                           ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Keyword 1 Total Length      : %-40d ║\n", getWordLength(word1));
        System.out.printf("║ Keyword 1 Length (no space) : %-40d ║\n", getLengthWithoutSpaces(word1));
        System.out.printf("║ Keyword 2 Total Length      : %-40d ║\n", getWordLength(word2));
        System.out.printf("║ Keyword 2 Length (no space) : %-40d ║\n", getLengthWithoutSpaces(word2));
        System.out.printf("║ Same Length?                : %-40s ║\n", (sameLengthCheck(word1, word2) ? "Yes ✓" : "No ❌"));
        
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║ CHARACTER ANALYSIS                                        ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Keyword 1 Unique Characters: %-40d ║\n", countUniqueCharacters(word1));
        System.out.printf("║ Keyword 2 Unique Characters: %-40d ║\n", countUniqueCharacters(word2));
        
        String freq1 = getCharacterFrequency(word1);
        String freq2 = getCharacterFrequency(word2);
        
        System.out.println("║                                                           ║");
        System.out.println("║ Keyword 1 Character Frequency:                            ║");
        if (!freq1.isEmpty()) {
            System.out.printf("║ %s ║\n", 
                String.format("%-57s", freq1.substring(0, Math.min(57, freq1.length()))));
        }
        
        System.out.println("║ Keyword 2 Character Frequency:                            ║");
        if (!freq2.isEmpty()) {
            System.out.printf("║ %s ║\n", 
                String.format("%-57s", freq2.substring(0, Math.min(57, freq2.length()))));
        }
        
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║ ANAGRAM ANALYSIS                                          ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        
        System.out.printf("║ Keyword 1 Sorted            : %-40s ║\n", getSortedCharacters(word1));
        System.out.printf("║ Keyword 2 Sorted            : %-40s ║\n", getSortedCharacters(word2));
        System.out.printf("║ Are Anagrams?               : %-40s ║\n", (isAnagram ? "YES ✓✓✓" : "NO ❌"));
        
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║                                                           ║");
        
        
        if (isAnagram) {
            System.out.println("║ ✓✓✓ MATCH FOUND!                                          ║");
            System.out.println("║ These skill keywords are ANAGRAMS of each other.         ║");
            System.out.println("║ They represent the SAME SET OF SKILLS!                   ║");
        } else {
            System.out.println("║ ❌ NO MATCH FOUND                                         ║");
            System.out.println("║ These skill keywords are different.                      ║");
            System.out.println("║ They represent DIFFERENT SKILL SETS!                     ║");
        }
        
        System.out.println("║                                                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
    }
    
    
    public static void displayAnagramExamples() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║           ANAGRAM EXAMPLES                                ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║                                                           ║");
        System.out.println("║ Skill Keywords that ARE anagrams:                         ║");
        System.out.println("║ • listen ↔ silent                                         ║");
        System.out.println("║ • restful ↔ fluster                                       ║");
        System.out.println("║ • parser ↔ rasper                                         ║");
        System.out.println("║ • angular ↔ regular                                       ║");
        System.out.println("║                                                           ║");
        System.out.println("║ Skill Keywords that are NOT anagrams:                     ║");
        System.out.println("║ • java ↔ python                                           ║");
        System.out.println("║ • coding ↔ testing                                        ║");
        System.out.println("║ • swift ↔ kotlin                                          ║");
        System.out.println("║                                                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║         RECRUITMENT PORTAL - SKILL MATCHING SYSTEM         ║");
            System.out.println("║          (Word Anagram Checker)                           ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
            
            displayAnagramExamples();
            
            boolean continueMatching = true;
            
            while (continueMatching) {
                System.out.print("Enter first skill keyword (or 'exit' to quit): ");
                String word1 = scanner.nextLine();
                
                if (word1.equalsIgnoreCase("exit")) {
                    System.out.println("\n✓ Thank you for using Skill Matching System!");
                    continueMatching = false;
                } else if (word1.isEmpty()) {
                    System.out.println("\n❌ Skill keyword cannot be empty!");
                    continue;
                } else {
                    System.out.print("Enter second skill keyword: ");
                    String word2 = scanner.nextLine();
                    
                    if (word2.isEmpty()) {
                        System.out.println("\n❌ Skill keyword cannot be empty!");
                    } else {
                        
                        displayMatchingReport(word1, word2);
                        
                        
                        System.out.println("═══════════════════════════════════════════════════════════\n");
                    }
                }
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
