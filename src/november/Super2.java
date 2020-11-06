package november;

public class Super2 {

    //we explicitly placed super in the constructor, the java compiler
    // didn’t call the default no-arg constructor of parent class.
    Super2() {
        System.out.println("no args constructor");
    }

    Super2(String var1) {
        System.out.println("parameterised constructor");
    }
}

class Jashu extends Super2 {
    Jashu() {
        super("jaswanth");
        System.out.println("child constructor");
    }

    void disc() {
        System.out.println("hello");
    }

    public static void main(String args[]) {
        Jashu j = new Jashu();
        j.disc();
    }
}
