import java.util.Scanner;

public class Solution9_StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Create 2D array: [student][0=physics, 1=chemistry, 2=maths]
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        String[] subjectNames = {"Physics", "Chemistry", "Maths"};
        
        // Take input for marks
        System.out.println("\nEnter marks for Physics, Chemistry, and Maths (out of 100):");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + subjectNames[j] + " marks: ");
                double mark = scanner.nextDouble();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
        }
        
        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
        System.out.println("\n========== STUDENT RESULTS (2D ARRAY) ==========");
        System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-10s", 
            "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade"));
        System.out.println("=".repeat(68));
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(String.format("%-10d %-12.2f %-12.2f %-12.2f %-12.2f %-10s", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]));
        }
        
        scanner.close();
    }
}
