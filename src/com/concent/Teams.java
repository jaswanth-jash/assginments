package com.concent;

import java.util.Scanner;

public class Teams {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        // y i am using scanner because we gave certain number in input
        int n = scan.nextInt();
        String[] teams = {" MI ", " CSK ", " RCB ", " PUNJAB ", " RR ", " SRH ", " DC ", " KKR "};
        // here we find total teams
        System.out.println(teams.length);

        for (int i = 0; i < teams.length; i++) {

            //here we print teams wise
            System.out.println(teams[i] );
            //here we print indiviual by using index number
            System.out.println(teams[n]);
        }
    }
}

