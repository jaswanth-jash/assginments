package com.concent;

public class ForLoop {
    public static void main(String args[]) {
        String[] myFamily = {" Govardhan ", " Subhashini", " Jaswanth", " Sai"};
        System.out.println("My family members:");
        for (int family = 0; family < myFamily.length; family++) {
            System.out.println(myFamily[family]);
        }
    }
}
