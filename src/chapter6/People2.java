package chapter6;

public class People2 {
    String name;
    int age;
    String gender;

    public static void main(String args[]) {
        People2 p = new People2();
        People2 p1 = p;
        p.name = "Rekha";
        p.age = 35;
        p.gender = "Female";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);
    }
}
