package com.concent;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String s= scan.next();
        String s1="";
        int n;
        for(int i=0;i<=s.length()-1;i++)
        {
            n=s.charAt(i);//This method returns the character at the specified index in a string
            if(n>='a'&& n<='z')
            {
                n=n-32;
                s1=s1+(char)(n);
            }
            else
            {
                s1=s1+(char)(n);
            }
        }
        System.out.println(s1);
        scan.close();

    }

}
