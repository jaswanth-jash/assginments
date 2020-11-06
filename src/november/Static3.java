package november;

public class Static3 {
    static int num1 = 21;
    String name;

    public static void main(String args[]) {
        Static3 obj1 = new Static3();
        Static3 s = new Static3();
        /* static variables can be accessed directly without
         * any instances. Just to demonstrate that static variables
         * are shared, I am accessing them using objects so that
         * we can check that the changes made to static variables
         * by one object, reflects when we access them using other
         * objects
         */

        //Assigning the value to static variable using object ob1
        obj1.num1 = 34;
        obj1.name = "some one";

        s.num1 = 38;
        s.name = "Ayyappa";
        System.out.println("obj1 number :" + obj1.num1);
        System.out.println("obj1 String :" + obj1.name);
        System.out.println("s number :" + s.num1);
        System.out.println("s String :" + s.name);
    }
}
