package programs;

import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int num = scan.nextInt();
        //System.out.println(num);
        System.out.println("The value of num is "  +  num);
        int num1 =num *2;
        //System.out.println(num1);
        System.out.println("The value of num1 is "  + num1);
    }
}
