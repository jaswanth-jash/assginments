package chapter6;

public class Box10 {
    int width;
    int height;
    int depth;

    Box10(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Box10 b = new Box10(21, 11, 7);// create box object called   b
        //Box10 b1 = new Box10();
        double vol;
        vol = b.volume();
        System.out.println("volume is :" + vol);

    }
}
