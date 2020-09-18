package chapter6;

public class People3 {
    String name;
    int age;
    String gender;

    void eating() {
        System.out.println("jay is eating");
    }

    void shouting() {
        System.out.println("jay is shouting");
    }

    void sleeping() {
        System.out.println("jay is sleeping");
    }

    public static void main(String args[]) {
        People3 p = new People3();
        p.name = "jay";
        p.age = 3;
        p.gender = "male";

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.gender);

        p.eating();
        p.shouting();
        p.sleeping();
    }
}
