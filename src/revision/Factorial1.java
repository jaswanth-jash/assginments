package revision;

public class Factorial1 {
    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("Factorial of 10 :" +factorial);
    }
}
