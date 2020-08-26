package statementsloops;

public class Number4 {
    public static void main(String args[]) {
        int number = 1;
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println();
        }
    }
}
