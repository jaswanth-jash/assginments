package november;

public class Static5 {
    //Static method
    static void dataType(String name1, String name2) {
        // name1 = name2 ;
        System.out.println("First String arg is: " + name1);
        System.out.println("Second String arg is: " + name2);
    }

    //non static method
    void display1() {
        System.out.println("non-static method");
    }

    public static void main(String args[]) {
        //Static method declare
        // Static5.dataType("jaswanth ", "Ayyappa");
        dataType("jaswanth ", "Ayyappa");

        //non static declare
        Static5 ss = new Static5();
        ss.display1();
    }
}
