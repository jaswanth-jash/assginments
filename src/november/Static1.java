package november;

public class Static1 {
    // static variables
    static int age;
    static String name;

    // static block
    static {
        System.out.println("static block 1");
        age = 23;
        name = "Jaswanth";
    }

    static {
        System.out.println("static block 2");
        age = 38;
        name = "Ayyappa";
    }

    public static void main(String args[]) {
        System.out.println("Age :" + age);
        System.out.println("Name : " + name);
    }
}
