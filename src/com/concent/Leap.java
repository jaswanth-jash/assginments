package com.concent;

import java.util.Scanner;

public class Leap {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scan.nextInt();
        boolean leapYear = false;
        if(year % 4 ==0){
            leapYear=true;
            System.out.println(year + "is a leap year");
        }
        else {
            leapYear=false;
            System.out.println(year + "is not a leap year");
        }
            /*if(year % 100 ==0){
                if (year % 400 == 0) {
                    leapYear = true;
                    System.out.println(year + "is a leap year");
                }
                    else{
                    leapYear=false;
                    System.out.println(year + "is not a leap year");
                }
            }
        }*/

    }
}
