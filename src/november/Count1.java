package november;

public class Count1 {
    static int count = 0;

    Count1() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Count1 c = new Count1();
        Count1 c1 = new Count1();
        Count1 c2 = new Count1();
        Count1 c3 = new Count1();
        Count1 c4 = new Count1();
        Count1 c5 = new Count1();
    }
}
