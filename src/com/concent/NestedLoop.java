package com.concent;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        //int n = scan.nextInt();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
