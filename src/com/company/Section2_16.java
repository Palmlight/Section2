package com.company;

import java.util.Scanner;

public class Section2_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the side: ");
        double length = input.nextDouble();

        double area = (3 * Math.pow(3, 0.5) * Math.pow(length, 2)) / 2;

        System.out.println("The area of the hexagon is " + area);


    }
}
