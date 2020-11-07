package november;

abstract public class Bird {
    abstract void fly();

    abstract void eat();
}

abstract class Eagle extends Bird {
    void eat() {
        System.out.println("Eagle is heating");
    }

    static class Sparrow extends Bird {

        @Override
        void fly() {
            System.out.println("Sparrow is flying");
        }

        @Override
        void eat() {
            System.out.println("Sparrow is eating");
        }
    }

    static class GoldenEagle extends Eagle {

        @Override
        void fly() {
            System.out.println("Golden Eagles Flying on mountains");
        }
    }

    static class SerpentEagle extends Eagle {

        @Override
        void fly() {
            System.out.println("Serpent Eagle Flying on oceans");
        }
    }

    public static void main(String args[]) {
        Bird s = new Sparrow();
        s.fly();
        s.eat();
        Eagle e = new GoldenEagle();
        e.eat();
        e.fly();
        Eagle e1 = new SerpentEagle();
        e1.eat();
        e1.fly();
    }
}
