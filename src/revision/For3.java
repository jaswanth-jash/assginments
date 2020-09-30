package revision;

public class For3 {
    public static void main(String[] args) {
        System.out.println("sum of first 100 natural numbers");
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;  // sum + =i
        }
        System.out.println("SUM = " + sum);
    }
}
