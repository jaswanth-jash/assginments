package chapter6;

public class Dog2 {
    String name;
    int cost;
    String bread;

    void barking() {
        System.out.println("Jack is barking");
    }

    void eating() {
        System.out.println("Jack is eating");
    }

    void sleeping() {
        System.out.println("Jack is sleeping");
    }

    public static void main(String args[]) {
        Dog2 d = new Dog2();
        d.name = "Jack";
        d.cost = 25000;
        d.bread = "Dobermann";

        System.out.println(d.name);
        System.out.println(d.cost);
        System.out.println(d.bread);

        d.barking();
        d.eating();
        d.sleeping();

    }
}
