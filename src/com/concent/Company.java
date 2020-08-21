package com.concent;

import java.util.Scanner;

public class Company {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        // y i am using scanner because we gave certain number in input
        int n = scan.nextInt();
        if (n < 30000) {
            System.out.println("This is  the salary of village and revenue officers ");
        } else if (n == 70000) {
            System.out.println("This is the salary of Govt teachers and MROS, Police officers");
        } else {
            System.out.println("software employess more than that");
        }

    }
}
