package statementsloops;

public class Number3 {
    public static void main(String args[]) {
        int number = 1;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println();
        }
    }
}
