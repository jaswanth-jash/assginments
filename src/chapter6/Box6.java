package chapter6;

public class Box6 {
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
        Box6 b = new Box6();
        double vol;

        b.setDim(23, 13, 9);
        vol = b.volume();
        System.out.println("volume is :" + vol);
    }
}
