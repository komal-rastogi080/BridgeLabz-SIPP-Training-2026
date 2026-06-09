package practice;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers = " + miles + " miles");

        input.close();
    }
}