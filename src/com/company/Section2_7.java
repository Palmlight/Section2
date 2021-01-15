package com.company;

import java.util.Scanner;

public class Section2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");

        int minutes = input.nextInt();

        int years = minutes / 60 / 24 / 365;

//        where 60 = minutes in an hour, 24 = hours in a day, 365 = days in a year

        int days = minutes / 60 / 24 % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
