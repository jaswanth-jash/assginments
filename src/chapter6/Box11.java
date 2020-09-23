package chapter6;

public class Box11 {
    int width;
    int height;
    int depth;

    Box11(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Box11 b = new Box11(22, 12, 8);// create box object called   b
        Box11 b1 = new Box11(42, 32, 22);
        double vol;
        vol = b.volume();
        System.out.println("volume b is :" + vol);

        vol = b1.volume();
        System.out.println("volume b1 is :" + vol);

    }
}
