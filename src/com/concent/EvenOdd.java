package com.concent;

public class EvenOdd {
    public static void main(String args[]) {
        System.out.println("Here are the numbers");
        for (int num = 1; num <= 20; num = num + 1) {
            if (num % 2 == 0) {
                System.out.println(num + " even");
            } else {
                System.out.println(num + " odd ");
             }
        }
    }
}
