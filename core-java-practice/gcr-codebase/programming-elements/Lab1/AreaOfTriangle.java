package Lab1;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        double areaInSquareInches = 0.5 * base * height;
        double areaInSquareCm    = areaInSquareInches * 6.4516; // 1 inch = 2.54cm, 1 sq inch = 6.4516 sq cm

        System.out.println("Area of Triangle in square inches is " + areaInSquareInches
                + " and in square centimeters is " + areaInSquareCm);

        input.close();
    }
}