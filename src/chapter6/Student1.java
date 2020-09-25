package chapter6;

public class Student1 {
    String name;
    int age;
    String gender;

    //Default constructor
    Student1() {
        this.name = "jaswanth";
        this.age = 23;
        this.gender = "male";
    }

    public static void main(String[] args) {
        Student1 s = new Student1();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.gender);


    }
}
