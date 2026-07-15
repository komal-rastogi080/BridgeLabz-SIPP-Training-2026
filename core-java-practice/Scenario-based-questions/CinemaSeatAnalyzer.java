import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of seats: ");
        int totalSeats = scanner.nextInt();

        int[] seatStatus = new int[totalSeats];

        System.out.println("Enter seat status (0 for Empty, 1 for Booked):");

        for (int index = 0; index < totalSeats; index++) {
            seatStatus[index] = scanner.nextInt();
        }

        int longestLength = 0;
        int currentLength = 0;
        int startPosition = -1;
        int endPosition = -1;
        int temporaryStart = 0;
        int bookedSeats = 0;
        int availableSeats = 0;

        for (int index = 0; index < totalSeats; index++) {
            if (seatStatus[index] == 0) {
                availableSeats++;
                if (currentLength == 0) {
                    temporaryStart = index;
                }
                currentLength++;

                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    startPosition = temporaryStart;
                    endPosition = index;
                }
            } else {
                bookedSeats++;
                currentLength = 0;
            }
        }

        System.out.println("Longest Available Block Starts At: " + startPosition);
        System.out.println("Longest Available Block Ends At: " + endPosition);
        System.out.println("Total Booked Seats: " + bookedSeats);
        System.out.println("Total Available Seats: " + availableSeats);

        if (longestLength >= 5) {
            System.out.println("A group of 5 people can sit together.");
        } else {
            System.out.println("A group of 5 people cannot sit together.");
        }

    }
}