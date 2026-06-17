import java.util.Scanner;

public class StudentMarks {
    
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generatePCMScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [Physics, Chemistry, Math]
        
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random 2-digit scores (10-99)
            scores[i][0] = 10 + (int) (Math.random() * 90); // Physics
            scores[i][1] = 10 + (int) (Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int) (Math.random() * 90); // Math
        }
        
        return scores;
    }
    
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScorecard(int[][] scores) {
        double[][] scorecard = new double[scores.length][5]; 
        // [Physics, Chemistry, Math, Total, Average, Percentage]
        
        for (int i = 0; i < scores.length; i++) {
            double physics = scores[i][0];
            double chemistry = scores[i][1];
            double math = scores[i][2];
            
            double total = physics + chemistry + math;
            double average = total / 3;
            double percentage = (total / 300) * 100;
            
            scorecard[i][0] = physics;
            scorecard[i][1] = chemistry;
            scorecard[i][2] = math;
            scorecard[i][3] = total;
            scorecard[i][4] = Math.round(average * 100.0) / 100.0;
            scorecard[i][5] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return scorecard;
    }
    
    // Method to display scorecard
    public static void displayScorecard(double[][] scorecard) {
        System.out.println("\n========================================================================");
        System.out.println("STUDENT MARKS SCORECARD");
        System.out.println("========================================================================");
        System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s", 
                           "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage"));
        System.out.println("========================================================================");
        
        for (int i = 0; i < scorecard.length; i++) {
            System.out.println(String.format("%-10d %-10.0f %-10.0f %-10.0f %-10.0f %-10.2f %-10.2f%%", 
                               (i + 1), 
                               scorecard[i][0], 
                               scorecard[i][1], 
                               scorecard[i][2], 
                               scorecard[i][3], 
                               scorecard[i][4], 
                               scorecard[i][5]));
        }
        
        System.out.println("========================================================================");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Generate PCM scores
        int[][] pcmScores = generatePCMScores(numberOfStudents);
        
        // Calculate scorecard
        double[][] scorecard = calculateScorecard(pcmScores);
        
        // Display scorecard
        displayScorecard(scorecard);
        
    }
}
