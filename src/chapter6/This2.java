package chapter6;

public class This2 {
    int width;
    int height;
    int depth;

    This2(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {

        return width * height * depth;
    }

    public static void main(String args[]) {
        This1 b = new This1(12, 23, 5);// create box object called   b
        This2 b1 = new This2(15, 13, 14);
        double vol;
        vol = b.volume();
        System.out.println("volume b is :" + vol);

        vol = b1.volume();
        System.out.println("volume b1 is :" + vol);

    }
}
