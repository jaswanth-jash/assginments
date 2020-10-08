package training;

public class Person {
    int id;
    String name;
    int age;

    //creating a default constructor
    Person() {
        System.out.println("here  1st person is a default constructor");
    }

    //creating a parameterized constructor
    Person(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void result() {
        System.out.println(id + " " + name + " " + age);
    }

    static public void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(1, "jashu", 23);
        p2.result();
    }
}
