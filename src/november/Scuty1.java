package november;

public interface Scuty1 {
    void action();

    default void print() {
        System.out.println("Scutty is running");
    }
}

class S2 implements Scuty1 {

    @Override
    public void action() {
        System.out.println("Engine is on ready to go");
    }

    public static void main(String args[]) {
        S2 s = new S2();
        s.action();
        s.print();
    }
}

