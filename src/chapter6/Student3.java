package chapter6;

public class Student3 {
    int id;
    String name;
    String gender;

    //Parametrised constructor
    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void result() {
        System.out.println("id:" + id + " name :" + name + "  ");
    }

    public static void main(String[] args) {
        Student3 s = new Student3(1102, "jay");
        Student3 s1 = new Student3(1102, "yojith");
        s.result();
        s1.result();
    }
}
