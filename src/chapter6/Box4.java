package chapter6;

public class Box4 {
    int width;
    int height;
    int depth;

    void volume() {
        System.out.print(" volume is :");
        System.out.println(width * height * depth);
    }

    public static void main(String args[]) {
        Box4 b = new Box4();// create box object called   b
        Box4 b1 = new Box4();

        //assign to values b instances variables
        b.width = 25;
        b.height = 15;
        b.depth = 5;
        //assign to values b1 instances variables
        b1.width = 10;
        b1.height = 34;
        b1.depth = 5;

        b.volume();
        b1.volume();
    }
}
