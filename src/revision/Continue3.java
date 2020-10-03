package revision;

public class Continue3 {
    public static void main(String[] args) {

        Double number = -2.2;
        int sum = 0;

        for (int i = 1; i < 6; ++i) {
            System.out.println("Enter number " + i + " : ");
            // if number is negative
            // continue statement is executed
            if (number <= 0.0) {
                continue;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
        //input.close();
    }
}
