import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate age for negative number
        if (age < 0) {
            return false;
        }
        
        // Check if age is 18 or above
        return age >= 18;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Array to store ages of 10 students
        int[] ages = new int[10];
        
        System.out.println("Enter the age of 10 students:");
        
        // Take user input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        System.out.println("\nVoting Eligibility:");
        
        // Check and display voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") - Can vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") - Cannot vote");
            }
        } 
    }
}
