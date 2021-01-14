package com.company;
import java.util.Scanner;

public class Section2_4 {
    public static void main(String[] args) {
//        One square meter is equal to 0.3025 ping

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in square meters:  ");
        double meters = input.nextDouble();

        double pings = meters * 0.3025;

        System.out.println(meters + " square meters is " + pings + " pings");


    }
}
