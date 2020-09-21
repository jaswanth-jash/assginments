package chapter6;

public class Box9 {
    int width;
    int height;
    int depth;

    Box9() {
        width = 34;
        height = 24;
        depth = 14;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Box9 b = new Box9();// create box object called   b
        Box9 b1 = new Box9();
        double vol;
        vol = b.volume();
        System.out.println("volume is :" + vol);

        vol = b1.volume();
        System.out.println("volume is :" + vol);

    }
}
