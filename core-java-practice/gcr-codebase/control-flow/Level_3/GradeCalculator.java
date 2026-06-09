public class GradeCalculator {
    public static void main(String[] args) {
        double physics = 85;
        double chemistry = 78;
        double maths = 92;
        
        double totalMarks = physics + chemistry + maths;
        double averageMarks = totalMarks / 3;
        double percentage = averageMarks;
        
        String grade = "";
        String remarks = "";
        
        if (percentage >= 90) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Level 2, but approaching agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else {
            grade = "E";
            remarks = "Level too below agency-normalized standards";
        }
        
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.println("Average Mark: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
