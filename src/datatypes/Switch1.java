package datatypes;

public class Switch1 {
    public static void main(String[] args) {
        int number = 30;
        //switch expression with int value
        switch (number) {
            //switch cases without break statements
            case 1:
                System.out.println("10");
            case 2:
                System.out.println("20");
            case 3:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
