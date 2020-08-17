package programs;

import java.util.Scanner;

public class Loop {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int n = scan.nextInt();
        int x;
        for(x=0;x<=n;x=x+1){
            System.out.println("the value of x is "  + x );
        }
    }
}
