import java.util.Scanner;

public class Handshakes {
    
    // Method to calculate maximum number of handshakes
    public static long calculateHandshakes(int numberOfStudents) {
        return (long) numberOfStudents * (numberOfStudents - 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        long maxHandshakes = calculateHandshakes(numberOfStudents);
        
        System.out.println("The maximum number of possible handshakes: " + maxHandshakes);
         
    }
}
