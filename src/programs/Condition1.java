package programs;

import java.util.Scanner;

public class Condition1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int num = scan.nextInt();
        if (num<10){
            System.out.println("num is less than 10");
        }
        else{
            System.out.println("num is greater than 10");
        }
    }
}