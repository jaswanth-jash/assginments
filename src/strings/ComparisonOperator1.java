package strings;

public class ComparisonOperator1 {
    public static void main(String args[]) {
        int i = 95;
        int j = 85;
        int k = 65;
        System.out.println(i += j);
        System.out.println(j += k);
        System.out.println(j += i);
        System.out.println(k += j);
        System.out.println(k += i);
        System.out.println(i += k);

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(j > k);
        System.out.println(i < k);
        System.out.println(i >= j);
        System.out.println(k <= j);
    }
}
