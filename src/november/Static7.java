package november;

public class Static7 {
    String name;
    int age;
    static String collegename = "RMD";

    //static method to change the value of static variable
    static void jash() {
        collegename = "svsc";
    }

    Static7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void disc() {
        System.out.println(name + " " + age + " " + collegename);
    }

    public static void main(String args[]) {
        Static7.jash();
        Static7 s1 = new Static7("jay", 11);
        Static7 s2 = new Static7("jash", 12);
        Static7 s3 = new Static7("yoji", 13);
        s1.disc();
        s2.disc();
        s3.disc();
    }
}
