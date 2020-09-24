package chapter6;

public class This4 {
    int width;
    int height;
    int depth;

    This4(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {

        return width * height * depth;
    }

    public static void main(String args[]) {
        This4 b = new This4(27, 17, 7);// create box object called   b
        This4 b1 = new This4(26, 16, 8);
        double vol;
        vol = b.volume();
        System.out.println("volume b is :" + vol);

        vol = b1.volume();
        System.out.println("volume b1 is :" + vol);

    }
}
