package training;

public class OverLoad2 {
    void data(char c) {
        System.out.println(c);
    }

    void data(int c) {
        System.out.println(c);
    }

    public static void main(String args[]) {
        OverLoad2 obj = new OverLoad2();
        obj.data('j');
        obj.data(23);
    }
}
