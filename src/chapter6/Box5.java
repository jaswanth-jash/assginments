package chapter6;

public class Box5 {
    int width;
    int height;
    int depth;

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Box5 b = new Box5();// create box object called   b
        Box5 b1 = new Box5();
        double vol;

        //assign to values b instances variables
        b.width = 35;
        b.height = 15;
        b.depth = 5;
        //assign to values b1 instances variables
        b1.width = 15;
        b1.height = 26;
        b1.depth = 5;
        vol = b.volume();
        System.out.println("Ref b volume is :" + vol);

        vol = b1.volume();
        System.out.println("Ref b1 volume is :" + vol);

    }
}
