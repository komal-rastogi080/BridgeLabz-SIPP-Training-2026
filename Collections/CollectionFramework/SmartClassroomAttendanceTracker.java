import java.util.*;

public class SmartClassroomAttendanceTracker {
    private HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public boolean markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println("Duplicate: " + student + " is already marked present in " + subject + ".");
            return false;
        }
        students.add(student);
        System.out.println("Marked " + student + " present in " + subject + ".");
        return true;
    }

    public void displayAttendance() {
        System.out.println("\n--- Subject-wise Attendance ---");
        if (attendance.isEmpty()) {
            System.out.println("No attendance records available.");
            return;
        }
        for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {
            String subject = entry.getKey();
            ArrayList<String> students = entry.getValue();
            System.out.println("\nSubject: " + subject);
            for (String s : students) {
                System.out.println("  - " + s);
            }
            System.out.println("Total present in " + subject + ": " + students.size());
        }
    }

    public static void main(String[] args) {
        SmartClassroomAttendanceTracker tracker = new SmartClassroomAttendanceTracker();

        tracker.markAttendance("Mathematics", "Rohit");
        tracker.markAttendance("Mathematics", "Simran");
        tracker.markAttendance("Mathematics", "Rohit"); // duplicate

        tracker.markAttendance("Physics", "Simran");
        tracker.markAttendance("Physics", "Arjun");

        tracker.markAttendance("Chemistry", "Rohit");

        tracker.displayAttendance();
    }
}
