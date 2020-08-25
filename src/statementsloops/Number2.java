package statementsloops;

public class Number2 {
    public static void main(String args[]) {
        int number = 5;
        System.out.println("Number of rows: " + number);
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println("");
        }
    }
}
