package com.vansh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter the Integer: ");
//        int num = input.nextInt();
//        System.out.println(num);

        //type casting
//        int num = (int)(565.43f);
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); //257 % 256 = 1

//        byte a = 40;
//        byte b = 40;
//        byte c = 40;
//        int d = (a * b) / c;
//
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number);

        byte b = 100;
        char c = 'a';
        short s = 2048;
        int i = 131313;
        float f = 1313.1313f;
        double d = 13.13f;
        double result = (f * b) + (i / c) - (d - s);

        System.out.println( (f * b ) + " " + (i / c) + " " + (d - s) );
        System.out.println(result);

    }

}
