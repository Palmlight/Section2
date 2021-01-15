package com.company;

import java.util.Scanner;

public class Section2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double rate = (1 + 0.003125);

        System.out.println("Enter the monthly saving amount: ");

        double amount = input.nextDouble();

        double firstMonth = amount * rate;

        double secondMonth = (firstMonth + amount) * rate;

        double thirdMonth = (secondMonth + amount) * rate;

        double fourthMonth = (thirdMonth + amount) * rate;

        double fifthMonth = (fourthMonth + amount) * rate;

        double sixthMonth = (fifthMonth + amount) * rate;


        System.out.println("After the first month, the account value is " + firstMonth);
        System.out.println("After the second month, the account value is " + secondMonth);
        System.out.println("After the third month, the account value is " + thirdMonth);
        System.out.println("After the fourth month, the account value is " + fourthMonth);
        System.out.println("After the fifth month, the account value is " + fifthMonth);
        System.out.println("After the sixth month, the account value is " + sixthMonth);


    }
}
