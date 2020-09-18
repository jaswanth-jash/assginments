package chapter6;

public class Box3 {
    int width;
    int height;
    int depth;

    void volume() {
        System.out.print(" volume is :");
        System.out.println(width * height * depth);
    }

    public static void main(String args[]) {
        Box3 b = new Box3();
        //assign to values b instances variables
        b.width = 35;
        b.height = 25;
        b.depth = 15;

        //display box volume
        b.volume();


    }
}
