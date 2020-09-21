package chapter6;

public class Box8 {
    int width;
    int height;
    int depth;

    Box8() {
        width = 33;
        height = 23;
        depth = 13;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Box8 b = new Box8();// create box object called   b
        //Box5 b1 = new Box5();
        double vol;
        vol = b.volume();
        System.out.println("volume is :" + vol);

    }
}
