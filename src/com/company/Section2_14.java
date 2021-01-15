package com.company;

import java.util.Scanner;


public class Section2_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Enter weight in inches: ");
        double inches = input.nextDouble();

        double poundsToKilograms = pounds * 0.45359237;

        double inchesToMeters = inches * 0.0254;

        double BMI = poundsToKilograms / Math.pow(inchesToMeters, 2);

        System.out.println("BMI is " + BMI);
    }
}
