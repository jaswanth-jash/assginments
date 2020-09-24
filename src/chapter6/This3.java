package chapter6;

public class This3 {
    int width;
    int height;
    int depth;

    This3(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {

        return width * height * depth;
    }

    public static void main(String args[]) {
        This3 b = new This3(20, 30, 10);// create box object called   b
        //Box10 b1 = new Box10();
        double vol;
        vol = b.volume();
        System.out.println("volume b is :" + vol);

    }
}
