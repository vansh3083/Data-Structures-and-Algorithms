package com.vansh;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=n);
    }
}
