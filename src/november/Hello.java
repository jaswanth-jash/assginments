package november;

public interface Hello {
    void print();
}

interface Welcome {
    void print1();
}

class J2 implements Hello, Welcome {

    @Override
    public void print() {
        System.out.println("Welcome to my World");
    }

    @Override
    public void print1() {
        System.out.println("We are training java");
    }

    public static void main(String args[]) {
        J2 j = new J2();
        j.print();
        j.print1();
    }
}
