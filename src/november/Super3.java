package november;

public class Super3 {
    void eat() {
        System.out.println("Animals is eating");
    }
}

class Cow extends Super3 {
    void eat() {
        System.out.println("Eating Grass");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    void res() {
        super.eat();
        eat();
        sleep();

    }

    public static void main(String args[]) {
        Cow c = new Cow();
        c.res();
    }
}
