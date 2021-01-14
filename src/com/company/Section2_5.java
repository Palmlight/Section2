package com.company;

import java.util.Scanner;

public class Section2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();

        double gratuity = input.nextDouble() / 100;

        double subSubTotal = subtotal * gratuity;

        double total = subSubTotal + subtotal;

        System.out.println("The gratuity is $" + subSubTotal + " and total is $" + total);

    }
}
