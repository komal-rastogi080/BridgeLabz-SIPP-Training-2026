import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double cmToInchesConversion = 1 / 6.4516;
        double areaIn2 = areaCm2 * cmToInchesConversion;
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
    }
}
