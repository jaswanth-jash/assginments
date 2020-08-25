package statementsloops;

public class Numbers {
    public static void main(String args[]) {
        int number = 10;
        System.out.println("Number of rows: " + number);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
