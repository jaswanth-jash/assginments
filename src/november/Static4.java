package november;

public class Static4 {
    static int rank = 10;
    static String college = "rmd college";

    //Static method
    static void display() {
        System.out.println("Rank:" + rank);
        System.out.println("College Name:" + college);
    }

    //non-static method
    void func() {
        //Static method called in non-static method
        display();
    }

    //static method
    public static void main(String args[]) {
        Static4 s4 = new Static4();
        //You need to have object to call this non-static method
        //s4.func();

        //Static method called in another static method
        display();
    }
}
