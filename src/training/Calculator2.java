package training;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String args[]) {
        System.out.println("enter the numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int name = scan.nextInt();
        int add, sub, mul, div, mod;
        String[] operations = {"addition", "substraction", "multipication", "division", "modulo"};
        for (int i = 0; i <= operations.length; i++) ;
        switch (name) {
            case 0:
                add = a + b;
                System.out.println("Addition : " + add);
                break;
            case 1:
                sub = a - b;
                System.out.println("Substraction : " + sub);
                break;
            case 2:
                mul = a * b;
                System.out.println("multipication : " + mul);
                break;
            case 3:
                div = a / b;
                System.out.println("Division : " + div);
                break;
            case 4:
                mod = a % b;
                System.out.println("modulo : " + mod);
                break;
        }
    }
}
