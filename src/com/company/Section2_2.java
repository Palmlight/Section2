package com.company;
import java.util.Scanner;

public class Section2_2 {
    public static void main(String[] args) {
        System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();

        double area = (Math.sqrt(3) * length * length) / 4;

        System.out.println("The area is " + area);

        double volume = area * length;

        System.out.println("The volume of the Triangular prism is " + volume);

    }
}
