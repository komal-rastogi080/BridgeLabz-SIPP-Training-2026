import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.println("Candidates:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");

            System.out.print("Enter your vote (1/2/3): ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1:
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate A.");
                    break;

                case 2:
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate B.");
                    break;

                case 3:
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate C.");
                    break;

                default:
                    System.out.println("Invalid vote!");
            }
        }

        System.out.println("\n===== ELECTION RESULTS =====");
        System.out.println("Candidate A : " + candidate1Votes + " votes");
        System.out.println("Candidate B : " + candidate2Votes + " votes");
        System.out.println("Candidate C : " + candidate3Votes + " votes");

        int totalVotes = candidate1Votes + candidate2Votes + candidate3Votes;
        System.out.println("Total Votes Cast: " + totalVotes);

        String winner =
                (candidate1Votes > candidate2Votes && candidate1Votes > candidate3Votes)
                        ? "Candidate A"
                        : (candidate2Votes > candidate3Votes)
                                ? "Candidate B"
                                : "Candidate C";

        if (totalVotes > 0) {
            System.out.println("Winner: " + winner);
        }
    }
}