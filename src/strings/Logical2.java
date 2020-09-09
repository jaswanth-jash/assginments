package strings;

public class Logical2 {
    public static void main(String[] args) {
        int a = 25;
        int b = 22;
        int c = 5;
        int add, sub, mul, div, mod;
        add = a + b;
        sub = add - b;
        mul = sub * c;
        div = a / c;
        mod = sub % a;
        System.out.println("sum of two number " + add);
        System.out.println("sub of two number " + sub);
        System.out.println("product of two number " + mul);
        System.out.println("div of two number " + div);
        System.out.println("mod of two number " + mod);

        if (sub > b && a > b) {
            System.out.println("b is less than sub and a");
        }
        if (mul > add && mul > a) {
            System.out.println("mul is greater than a and add");
        }
        if (c != mod || b != c) {
            System.out.println("c is not equal to b and mod");
        }
        if (b < a || c < a) {
            System.out.println("a is greater than b and c");
        }
        if (c > mod || div > mod) {
            System.out.println("mod is less than both c and div\n");
        }
        System.out.println(a > b && mul > add);
    }
}
