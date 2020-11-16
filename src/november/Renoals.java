package november;

public class Renoals {
    static int cost = 10;
    String colour;

    Renoals(String c) {
        colour = c;
    }

    void display() {
        System.out.println(cost + " " + colour);
    }

    public static void main(String args[]) {
        //Renoals.cost=15;
        Renoals r = new Renoals("blue");
        Renoals r1 = new Renoals("Black");
        Renoals r2 = new Renoals("red");
        Renoals r3 = new Renoals("green");
        r.display();
        r1.display();
        r2.display();
        r3.display();
    }
}
