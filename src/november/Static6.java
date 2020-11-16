package november;

public class Static6 {
    int rollno;
    String name;
    static String collegename = "RMD";

    Static6(int r, String n) {
        rollno = r;
        name = n;
    }

    void dis() {
        System.out.println(rollno + " " + name + " " + collegename);
    }

    public static void main(String args[]) {
        //we can change the college of all objects by the single line of code
        // Static6.collegename = "rmk";
        Static6 s = new Static6(11, "jaswanth");
        Static6 s1 = new Static6(12, "jay");
        s.dis();
        s1.dis();
    }
}
