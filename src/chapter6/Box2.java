package chapter6;

public class Box2 {
    int width;
        int height;
        int depth;

        public static void main(String args[]) {
            Box2 b = new Box2();// create box object called   b
            Box2 b1 = new Box2();
            double volume;
            //assign to values b instances variables
            b.width = 25;
            b.height = 15;
            b.depth = 10;
            //assign to values b1 instances variables
            b1.width = 10;
            b1.height = 8;
            b1.depth = 5;
        // compute volume box2 and ref b
        volume = b.width * b.height * b.depth;
        System.out.println("total volume = " + volume);
        // compute volume box2 and ref b1
        volume = b1.width * b1.height * b1.depth;
        System.out.println("total volume = " + volume);
    }
}
