import java.util.Scanner;

public class Solution8_StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Create arrays
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        // Take input for marks
        System.out.println("\nEnter marks for Physics, Chemistry, and Maths (out of 100):");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            System.out.print("Enter Physics marks: ");
            double physics = scanner.nextDouble();
            if (physics < 0 || physics > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--;
                continue;
            }
            physicsMarks[i] = physics;
            
            System.out.print("Enter Chemistry marks: ");
            double chemistry = scanner.nextDouble();
            if (chemistry < 0 || chemistry > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--;
                continue;
            }
            chemistryMarks[i] = chemistry;
            
            System.out.print("Enter Maths marks: ");
            double maths = scanner.nextDouble();
            if (maths < 0 || maths > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                i--;
                continue;
            }
            mathsMarks[i] = maths;
        }
        
        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
            
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else if (percentages[i] >= 50) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }
        
        // Display results
        System.out.println("\n========== STUDENT RESULTS ==========");
        System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-10s", 
            "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade"));
        System.out.println("=".repeat(68));
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(String.format("%-10d %-12.2f %-12.2f %-12.2f %-12.2f %-10s", 
                (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]));
        }
        
        scanner.close();
    }
}
