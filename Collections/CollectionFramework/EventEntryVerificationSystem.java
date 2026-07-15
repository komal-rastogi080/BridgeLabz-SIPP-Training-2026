import java.util.*;

public class EventEntryVerificationSystem {
    private HashSet<String> registeredEmails = new HashSet<>();

    public boolean registerParticipant(String email) {
        if (registeredEmails.contains(email)) {
            System.out.println("Registration failed: " + email + " is already registered.");
            return false;
        }
        registeredEmails.add(email);
        System.out.println("Registration successful for: " + email);
        return true;
    }

    public void displayRegisteredParticipants() {
        System.out.println("\n--- Registered Participants ---");
        if (registeredEmails.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            for (String email : registeredEmails) {
                System.out.println(email);
            }
        }
        System.out.println("Total attendees eligible to enter: " + registeredEmails.size());
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem system = new EventEntryVerificationSystem();

        system.registerParticipant("amit.kumar@example.com");
        system.registerParticipant("neha.singh@example.com");
        system.registerParticipant("ravi.patel@example.com");
        system.registerParticipant("amit.kumar@example.com"); // duplicate

        system.displayRegisteredParticipants();
    }
}
