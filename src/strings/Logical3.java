package strings;

public class Logical3 {
    public static void main(String[] args) {
        double num1 = 224.5;
        double num2 = 125.9;
        double num3 = 95.7;
        double add, sub, div, mul;
        add = num2 + num3;
        sub = num1 - num3;
        mul = num1 * 5;
        div = num1 / num3;
        System.out.println("sum of two number " + add);
        System.out.println("sub of two number " + sub);
        System.out.println("product of two number " + mul);
        System.out.println("div of two number " + div);

        System.out.println(num1 > add && sub > num2);
        System.out.println(num1 > add || add > num2);
        System.out.println(mul < num1 && mul < add);
        System.out.println(div > num1 && div > num3);
        System.out.println(add != num1 || sub > num2);
    }
}
