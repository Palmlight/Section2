package com.company;

import java.util.Scanner;

public class Section2_8 {
    public static void main(String[] args) {
        System.out.println("Enter your GMT");

        Scanner input = new Scanner(System.in);

        int GMT = input.nextInt();


        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour += GMT;

        System.out.println("Current time is " + currentHour + ": " + currentMinute + ": " + currentSecond + " " + GMT + "GMT");
    }
}
