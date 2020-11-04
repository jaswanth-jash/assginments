package training;

public class OverLoad1 {
    void disp(char c) {
        System.out.println(c);
    }

    void disp(char c, int num) {
        System.out.println(c + " " + num);
    }

    public static void main(String args[]) {
        OverLoad1 obj = new OverLoad1();
        obj.disp('j');
        obj.disp('a', 38);
    }
}
