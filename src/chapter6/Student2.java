package chapter6;

public class Student2 {
    int id;
    String name;
    String gender;

    //Parametrised constructor
    Student2(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    void res() {
        System.out.println("id:" + id + " name :" + name + " gender:" + gender + " ");
    }

    public static void main(String[] args) {
        Student2 s = new Student2(101, "jashu", "male");
        Student2 s1 = new Student2(102, "rekha", "female");
        s.res();
        s1.res();
    }

}
