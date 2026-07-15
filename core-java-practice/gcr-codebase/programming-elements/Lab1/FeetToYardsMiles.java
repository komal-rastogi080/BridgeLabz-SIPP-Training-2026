package Lab1;
import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet is " + distanceInFeet
                + " while in yards is " + yards
                + " and in miles is " + miles);

        input.close();
    }
}