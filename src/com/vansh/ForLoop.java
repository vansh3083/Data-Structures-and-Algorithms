package com.vansh;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        for(int i=0; i<=10; i+=1)
//        {
//            System.out.print(i + " ");
//        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}
