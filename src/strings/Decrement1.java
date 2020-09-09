package strings;

public class Decrement1 {
    public static void main(String args[]) {
        int a = 75;
        int b = 98;
        System.out.println("before decrement :" + a);
        a--;
        System.out.println("after decrement :" + a);
        a--;
        System.out.println("after decrement :" + a);
        --a;
        System.out.println("post decrement :" + a);

        System.out.println("before decrement :" + b);
        b--;
        System.out.println("after decrement :" + b);
        b--;
        System.out.println("after decrement :" + b);
        --b;
        System.out.println("post decrement :" + b);
    }
}
