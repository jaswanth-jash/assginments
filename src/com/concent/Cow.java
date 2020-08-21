package com.concent;

import java.util.Scanner;

public class Cow {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        // y i am using scanner because we gave certain number in input
        int n = scan.nextInt();
        // y i am using this concept the value of cows
        if (n < 50000) {
            System.out.println("normal cow");
        } else if (n == 50000) {
            System.out.println("ongole githa");
        } else {
            System.out.println("hybrid cows");
        }
    }
}
