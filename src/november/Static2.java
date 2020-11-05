package november;

public class Static2 {
    //static method main is accessing static variables without object
    static int var1 = 3;
    static String var2 = "jay";

    //This is a Static Method
    /*static void data() {
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
    }*/

    public static void main(String args[]) {
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
        //data();
    }
}
