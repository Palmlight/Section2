package com.company;
import java.util.Scanner;

public class Section2_3 {
    public static void main(String[] args) {
//         1 meter is equal to 3.2786

        System.out.println("Enter a value for meter: ");

        Scanner input = new Scanner(System.in);

        double meter = input.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(feet);
    }
}
