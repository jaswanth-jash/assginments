package chapter6;

public class People1 {
    String name;
    int age;
    String gender;

    public static void main(String args[]) {
        People1 p = new People1();
        p.name = "Jaswanth";
        p.age = 23;
        p.gender = "male";

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.gender);
    }
}
