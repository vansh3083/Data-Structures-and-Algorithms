package com.vansh;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature in C: ");
        float c = input.nextFloat();
        float f = (c * 9/5) + 32;
        System.out.print("Temperature in F is: " + f);

    }
}
