package training;

public class OverLoad3 {
    void disp(char c) {
        System.out.println(c);
    }

    void disp(char c, int age) {
        System.out.println(c + " " + age);
    }

    void disp(char c, int age, float num1) {
        System.out.println(c + " " + age + " " + num1);
    }

    public static void main(String args[]) {
        OverLoad3 obj = new OverLoad3();
        obj.disp('j');
        obj.disp('a', 38);
        obj.disp('j', 23, 70.4f);
    }
}
