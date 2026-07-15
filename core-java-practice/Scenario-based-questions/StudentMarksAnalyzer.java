import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] studentMarks = new int[numberOfStudents];

        int highestMark = Integer.MIN_VALUE;
        int lowestMark = Integer.MAX_VALUE;
        int countAboveSeventyFive = 0;
        int totalMarks = 0;

        System.out.println("Enter marks:");

        for (int index = 0; index < numberOfStudents; index++) {
            studentMarks[index] = scanner.nextInt();

            if (studentMarks[index] > highestMark) {
                highestMark = studentMarks[index];
            }

            if (studentMarks[index] < lowestMark) {
                lowestMark = studentMarks[index];
            }

            if (studentMarks[index] > 75) {
                countAboveSeventyFive++;
            }

            totalMarks += studentMarks[index];
        }

        double averageMarks = (double) totalMarks / numberOfStudents;

        System.out.println("Highest Marks: " + highestMark);
        System.out.println("Lowest Marks: " + lowestMark);
        System.out.println("Students Scoring Above 75: " + countAboveSeventyFive);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Marks Greater Than Average:");

        for (int mark : studentMarks) {
            if (mark > averageMarks) {
                System.out.print(mark + " ");
            }
        }

    }
}