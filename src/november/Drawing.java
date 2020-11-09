package november;

public interface Drawing {
    void dis();

    static int cube(int x) {
        return x * x * x;
    }
}

class D2 implements Drawing {

    @Override
    public void dis() {
        System.out.println("Drawing cude method");
    }

    public static void main(String args[]) {
        D2 d = new D2();
        d.dis();
        System.out.println(Drawing.cube(5));
    }
}
