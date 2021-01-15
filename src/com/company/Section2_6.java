package com.company;

import java.util.Scanner;

public class Section2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");

        int number = input.nextInt();

        int a = number % 10;

        int b = (number / 10) % 10;

        int c = (number / 100) % 10;

        int digits = a * b * c;

        System.out.println(a + " " + b + " " + c);

        System.out.println("The multiplication of all digits in " + number + " is " + digits);


    }
}
