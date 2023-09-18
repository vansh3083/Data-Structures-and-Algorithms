package com.vansh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First No: ");
        int n1 = input.nextInt();
        System.out.print("Enter the Second No: ");
        int n2 = input.nextInt();
        int sum = n1 + n2;

        System.out.println("The sum of the 2 numbers is: " + sum);
    }
}
