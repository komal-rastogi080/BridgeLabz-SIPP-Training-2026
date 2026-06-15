import java.util.Scanner;


class RajResultGenerator {
    
    private static final int TOTAL_SUBJECTS = 5;
    private static final String[] SUBJECTS = {
        "Mathematics",
        "English",
        "Science",
        "Social Studies",
        "Hindi"
    };
    
    
    public static int[] inputMarks() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[TOTAL_SUBJECTS];
        
        System.out.println("\n===== ENTER MARKS FOR 5 SUBJECTS =====");
        System.out.println("(Out of 100)\n");
        
        for (int i = 0; i < TOTAL_SUBJECTS; i++) {
            boolean validInput = false;
            
            while (!validInput) {
                try {
                    System.out.print("Enter marks for " + SUBJECTS[i] + ": ");
                    marks[i] = scanner.nextInt();
                    
                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println("❌ Marks should be between 0 and 100!");
                        continue;
                    }
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("❌ Invalid input! Please enter a number.");
                    scanner.nextLine(); 
                }
            }
        }
        
        return marks;
    }
    
    
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / TOTAL_SUBJECTS;
    }
    
    
    public static String assignGrade(double average) {
        int gradeRange = (int) average / 10;
        
        switch (gradeRange) {
            case 10:
            case 9:
                return (average >= 90) ? "A+" : "A";
            case 8:
                return "A";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
    
    
    public static void displayResult(int[] marks, double average, String grade) {
        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("\nSubject-wise Marks:");
        System.out.println("─────────────────────────────────────");
        
        
        for (int i = 0; i < TOTAL_SUBJECTS; i++) {
            System.out.printf("%-20s: %3d/100\n", SUBJECTS[i], marks[i]);
        }
        
        System.out.println("─────────────────────────────────────");
        System.out.printf("Average Marks     : %.2f\n", average);
        System.out.printf("Grade             : %s\n", grade);
        System.out.println("====================================\n");
        
        
        displayPerformanceMessage(average);
    }
    
    
    public static void displayPerformanceMessage(double average) {
        if (average >= 90) {
            System.out.println("🌟 Excellent performance! Keep it up!");
        } else if (average >= 80) {
            System.out.println("✓ Good performance! Work harder for better results.");
        } else if (average >= 70) {
            System.out.println("◐ Average performance. Focus on weaker areas.");
        } else if (average >= 60) {
            System.out.println("⚠ Below average. Need more effort.");
        } else {
            System.out.println("❌ Poor performance. Serious effort required!");
        }
    }
    
    
    public static boolean hasPassed(double average) {
        return average >= 40;
    }
    
    
    public static void displayStatistics(int[] marks) {
        int highest = marks[0];
        int lowest = marks[0];
        String highestSubject = SUBJECTS[0];
        String lowestSubject = SUBJECTS[0];
        
        for (int i = 1; i < TOTAL_SUBJECTS; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                highestSubject = SUBJECTS[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestSubject = SUBJECTS[i];
            }
        }
        
        System.out.println("\n===== SUBJECT STATISTICS =====");
        System.out.println("Best Subject  : " + highestSubject + " (" + highest + ")");
        System.out.println("Weak Subject  : " + lowestSubject + " (" + lowest + ")");
        System.out.println("===============================\n");
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║   RAJ'S COACHING CENTER             ║");
            System.out.println("║   RESULT GENERATOR SYSTEM           ║");
            System.out.println("╚════════════════════════════════════╝");
            
            
            int[] marks = inputMarks();
            
            
            double average = calculateAverage(marks);
            
            
            String grade = assignGrade(average);
            
            
            displayResult(marks, average, grade);
            
            
            displayStatistics(marks);
            
            
            if (hasPassed(average)) {
                System.out.println("✓ RESULT: PASSED");
            } else {
                System.out.println("❌ RESULT: FAILED (Minimum 40 marks required)");
            }
            
            System.out.println();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
