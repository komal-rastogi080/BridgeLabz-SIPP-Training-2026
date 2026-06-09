public class BMICalculator {
    public static void main(String[] args) {
        double weight = 70; // in kg
        double height = 175; // in cm
        
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        
        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);
        
        String weightStatus = "";
        
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + weightStatus);
    }
}
