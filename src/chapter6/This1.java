package chapter6;

public class This1 {
    int width;
    int height;
    int depth;

    This1(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {

        return width * height * depth;
    }

    public static void main(String args[]) {
        This1 b = new This1(21, 34, 15);// create box object called   b
        //Box10 b1 = new Box10();
        double vol;
        vol = b.volume();
        System.out.println("volume b is :" + vol);

    }
}
