package chapter6;

public class Box1 {
    int width;
    int height;
    int depth;

    public static void main(String args[]) {
        Box1 b = new Box1();
        double volume;
        //assign to values b instances variables
        b.width = 25;
        b.height = 15;
        b.depth = 10;
        volume = b.width * b.height * b.depth;
        System.out.println("total volume = " + volume);
    }
}
