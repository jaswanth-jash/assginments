package training;

import java.util.Scanner;

public class Product1 {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res;
        //res = (a * a) + (b * b) + (2 * a * b);
        res = (a * a * a) + (b * b * b) + (3 * a * a * b) + (3 * a * b * b);
        // res = Sqrt(a+b);
        System.out.println("Square root of (a+b)*3: " + res);
    }
}