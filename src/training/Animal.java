package training;

public class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class Inheritance {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        System.out.println("This is multilevel inheritance \n");
        d.weep();
        d.bark();
        d.eat();
    }
}
