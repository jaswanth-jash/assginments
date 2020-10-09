package training;

public class Person1 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Person1(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Person1(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Person1 p1 = new Person1(111, "Karan");
        Person1 p2 = new Person1(112, "Aryan", 25);
        p1.display();
        p2.display();
    }
}
