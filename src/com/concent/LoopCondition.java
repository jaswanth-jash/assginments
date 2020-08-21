package com.concent;

import java.util.Scanner;

public class LoopCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else if (i % 2 != 0) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        scan.close();
    }

}


