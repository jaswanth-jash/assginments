package datatypes;

public class Inches {
    public static void main(String args[]) {
        /*
        1 inch = 0.0254 meters
         */
        System.out.println("Input a value for inch: ");
        double inch = 1000;
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}

