package november;

public class Super1 {
    int num = 21;
}

class Value extends Super1 {
    int num = 34;

    void disp() {
        System.out.println(num);

        /* Note that instead of writing num we are
         * writing super.num in the print statement
         * this refers to the num variable of Superclass
         */
        System.out.println(super.num);
    }

    public static void main(String args[]) {
        Value v = new Value();
        v.disp();
    }
}
