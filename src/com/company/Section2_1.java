package com.company;
import java.util.Scanner;

public class Section2_1 {
    public static void main(String[] args) {

//        1 mile = 1.6 kilometers

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles = input.nextDouble();

        double kilometres = miles * 1.6;

        System.out.println(miles + " miles is " + kilometres + " kilometers");

    }
}
