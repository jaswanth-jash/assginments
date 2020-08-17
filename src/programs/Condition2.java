package programs;

import java.util.Scanner;

public class Condition2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1<num2){
            System.out.println("num1 is less than num2");
            int num3 = num1 * 2;
            if (num2==num3)
                System.out.println("num2 is equal to num3");
           num3 = num1*3;
           if(num3>num2)
               System.out.println("num3 is greater than to num2");

            }
    }
}
