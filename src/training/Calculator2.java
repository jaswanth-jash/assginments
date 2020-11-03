package training;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String args[]) {
        System.out.println("enter the two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Choose the Arithmetic operation Id : 0,1,2,3,4");
        int operationId = scan.nextInt();
        int add, sub, mul, div, mod;
        String[] operations = {"addition", "subtraction", "multiplication", "division", "modulo"};
        for (int i = 0; i <= operations.length; i++) ;
        switch (operationId) {
            case 0:
                add = a + b;
                System.out.println("Addition : " + add);
                break;
            case 1:
                sub = a - b;
                System.out.println("Subtraction : " + sub);
                break;
            case 2:
                mul = a * b;
                System.out.println("multiplication : " + mul);
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
