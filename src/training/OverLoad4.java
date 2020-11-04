package training;

public class OverLoad4 {
    public void type(char c, int num) {
        System.out.println("I’m the first definition of method type");
    }

    public void type(int num, char c) {
        System.out.println("I’m the second definition of method type");
    }

    public static void main(String args[]) {
        OverLoad4 obj = new OverLoad4();
        obj.type('x', 51);
        obj.type(52, 'y');
    }
}
