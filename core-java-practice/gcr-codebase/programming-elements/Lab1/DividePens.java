package Lab1;
public class DividePens {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;   // Integer division
        int remainingPens = totalPens % students;    // Modulus for remainder

        System.out.println("Total Pens        : " + totalPens);
        System.out.println("Total Students    : " + students);
        System.out.println("Pens per Student  : " + pensPerStudent);
        System.out.println("Remaining Pens    : " + remainingPens);
    }
}
