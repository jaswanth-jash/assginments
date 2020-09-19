package chapter6;

public class Box7 {
    int width;
    int height;
    int depth;

    double volume() {
        return width * height * depth;
    }

    //set dimensions for box
    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    public static void main(String args[]) {
        Box7 b = new Box7();
        Box7 b1 = new Box7();
        double vol;

        b.setDim(23, 13, 9);
        b1.setDim(20, 15, 10);
        vol = b.volume();
        System.out.println("volume b is :" + vol);

        vol = b1.volume();
        System.out.println("volume b1 is :" + vol);
    }
}
